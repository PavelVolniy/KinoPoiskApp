package com.example.kinopoiskcinemaapp.presentation

import android.annotation.SuppressLint
import android.content.SharedPreferences
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kinopoiskcinemaapp.App
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.domain.utils.HomePageRequestState
import com.example.kinopoiskcinemaapp.domain.utils.HomePageState
import com.example.kinopoiskcinemaapp.domain.utils.ScreenState
import com.example.kinopoiskcinemaapp.entity.collections.CollectionsType
import com.example.kinopoiskcinemaapp.presentation.home.actorpage.ActorPagePreview
import com.example.kinopoiskcinemaapp.presentation.home.bottomsheet.BottomSheetErrorMessage
import com.example.kinopoiskcinemaapp.presentation.home.filmography.FilmographyPreview
import com.example.kinopoiskcinemaapp.presentation.home.filmpage.FilmPage
import com.example.kinopoiskcinemaapp.presentation.home.gallerypage.GalleryPagePreview
import com.example.kinopoiskcinemaapp.presentation.home.homepage.HomePage
import com.example.kinopoiskcinemaapp.presentation.home.homepage.HomePageViewModel
import com.example.kinopoiskcinemaapp.presentation.home.listpage.ListPage
import com.example.kinopoiskcinemaapp.presentation.home.listpage.LoaderPage
import com.example.kinopoiskcinemaapp.presentation.home.season.SeasonPage
import com.example.kinopoiskcinemaapp.presentation.profile.CollectionFilmListPage
import com.example.kinopoiskcinemaapp.presentation.profile.ProfilePage
import com.example.kinopoiskcinemaapp.presentation.profile.ProfilePageState
import com.example.kinopoiskcinemaapp.presentation.search.SettingsNavGraph
import com.example.kinopoiskcinemaapp.presentation.search.settings.SearchPageState
import com.example.kinopoiskcinemaapp.presentation.startpage.Onboarding

private const val NAME_GROUP = "nameGroup"
private const val FILM_ID = "filmId"
private const val NAME_COLLECTION = "nameCollection"
private const val SEASON_ID = "seasonId"
private const val ACTOR_ID = "actorId"

@SuppressLint("RememberReturnType", "CommitPrefEdits")
@Composable
fun MainNavGraph(
    sharedPreferences: SharedPreferences
) {
    val navController = rememberNavController()
    val selectedScreen = rememberSaveable { mutableStateOf(ScreenState.HomeScreen) }

    var isFirstStart = remember {
        sharedPreferences.getBoolean(App.IS_FIRST_START, true)
    }

    NavHost(
        navController = navController,
        startDestination = ScreenState.HomeScreen.name
    ) {
        fun navigateToScreen(
            screenState: ScreenState,
        ) {
            if (selectedScreen.value != screenState) {
                selectedScreen.value = screenState
                navController.navigate(selectedScreen.value.name) {
                    popUpTo(selectedScreen.value.name) {
                        inclusive = true
                    }
                }
            }
        }

        composable(ScreenState.HomeScreen.name) {
            if (isFirstStart) {
                isFirstStart = false
                sharedPreferences.edit().putBoolean(App.IS_FIRST_START, isFirstStart).apply()
                navController.navigate(HomePageState.StartPage.route)
            } else {
                navController.navigate(HomePageState.HomePage.route)
            }
        }
        composable(ScreenState.SearchScreen.name) {
            navController.navigate(SearchPageState.MAIN.route)
        }
        composable(ScreenState.ProfileScreen.name) {
            navController.navigate(ProfilePageState.MAIN.route)
        }

        composable(HomePageState.StartPage.route) {
            val arrStrings = stringArrayResource(R.array.start_page_data)
            val arrImagesInt = listOf(R.drawable.wfh_4_1, R.drawable.wfh_8, R.drawable.wfh_2)
            val arrPairs = arrStrings.mapIndexed { index: Int, item: String ->
                Pair(
                    arrImagesInt[index],
                    item
                )
            }

            Onboarding(
                contentList = arrPairs,
                isLoading = false,
                onClickSkip = {
                    navController.navigate(HomePageState.HomePage.route) {
                        popUpTo(HomePageState.HomePage.route) { inclusive = true }
                    }
                }
            )
        }

        composable(HomePageState.HomePage.route) {
            val homePageViewModel: HomePageViewModel = hiltViewModel()
            val dataIsLoading = homePageViewModel.filmGroupList.collectAsState().value
            remember { homePageViewModel.getFilms() }

            when (dataIsLoading) {
                is HomePageRequestState.Error -> {
                    val errorNum = "[0-9]+".toRegex().find(dataIsLoading.message)
                    val errorMessage = when (errorNum?.value) {
                        "401" -> stringResource(R.string._401)
                        "402" -> stringResource(R.string._402)
                        "429" -> stringResource(R.string._429)
                        else -> {
                            "Unknown error"
                        }
                    }

                    BottomSheetErrorMessage(
                        title = stringResource(R.string.error_title),
                        errorMessage = errorMessage,
                        isClose = {
                            homePageViewModel.getFilms()
                        },
                        screenState = selectedScreen.value
                    )
                }

                is HomePageRequestState.Loading -> {
                    LoaderPage()
                }

                is HomePageRequestState.Success -> {
                    HomePage(
                        onClickItem = { filmId ->
                            navController.navigate(HomePageState.FilmPage.route + "/$filmId")
                        },
                        onClickGroup = { nameGroup ->
                            navController.navigate(
                                HomePageState.ListPage.route + "/${nameGroup.nameRequest}"
                            )
                        },
                        selectedScreen = {
                            navigateToScreen(it)
                        },
                        screen = selectedScreen.value
                    )
                }
            }

        }

        composable(
            HomePageState.ListPage.route + "/{$NAME_GROUP}"
        ) { navBackStackEntry ->
            val request =
                navBackStackEntry.arguments?.getString(NAME_GROUP)

            if (request != null) {
                ListPage(
                    typeFilmRequest = request ?: CollectionsType.TOP_POPULAR_ALL.nameRequest,
                    onClickItem = { filmId ->
                        navController.navigate(HomePageState.FilmPage.route + "/$filmId")
                    },
                    onClickBack = { navController.popBackStack() },
                    selectedScreen = {
                        navigateToScreen(it)
                    },
                    screenState = selectedScreen.value
                )
            }
        }

        composable(HomePageState.FilmPage.route + "/{${FILM_ID}}") { navBackStackEntry ->
            val filmId =
                navBackStackEntry.arguments?.getString(FILM_ID)

            FilmPage(
                filmId = filmId?.toInt() ?: 0,
                onClickFilmItem = { id ->
                    navController.navigate(HomePageState.FilmPage.route + "/$id") {
                    }
                },
                onClickImageGallery = { id ->
                    navController.navigate(HomePageState.GalleryPage.route + "/$id")
                },
                onClickStaff = { staffId ->
                    navController.navigate(HomePageState.ActorPage.route + "/$staffId")
                },
                onBackPressed = { navController.popBackStack() },
                selectedScreen = {
                    navigateToScreen(it)
                },
                onClickSeason = { seasonId ->
                    navController.navigate(HomePageState.SeasonPage.route + "/$seasonId")
                },
                screenState = selectedScreen.value
            )
        }

        composable(HomePageState.SeasonPage.route + "/{$SEASON_ID}") { navBackStackEntry ->
            val seasonIdString = navBackStackEntry.arguments?.getString(SEASON_ID)
            val seasonId = seasonIdString?.toInt() ?: 0
            SeasonPage(
                screenState = selectedScreen.value,
                seasonId = seasonId,
                onBackPressedButton = { navController.popBackStack() }
            )
        }

        composable(HomePageState.ActorPage.route + "/{${ACTOR_ID}}") { navBackStackEntry ->
            val actorId =
                navBackStackEntry.arguments?.getString(ACTOR_ID)

            ActorPagePreview(
                actorId = actorId?.toInt() ?: 0,
                onClickFilmItem = { filmId ->
                    navController.navigate(HomePageState.FilmPage.route + "/$filmId")
                },
                selectedScreen = {
                    navigateToScreen(it)
                },
                onClickBack = { navController.popBackStack() },
                onClickFilmography = {
                    navController.navigate(HomePageState.FilmographyPage.route)
                },
                screenState = selectedScreen.value
            )
        }

        composable(HomePageState.GalleryPage.route + "/{${FILM_ID}}") { navBackStackEntry ->
            val filmId =
                navBackStackEntry.arguments?.getString(FILM_ID)
                    ?.toInt()

            GalleryPagePreview(
                filmId = filmId ?: 0,
                onClickBack = { navController.popBackStack() },
                selectedScreen = {
                    navigateToScreen(it)
                },
                screenState = selectedScreen.value
            )
        }

        composable(HomePageState.FilmographyPage.route) {
            FilmographyPreview(
                onBackButtonPressed = { navController.popBackStack() },
                selectedScreen = {
                    navigateToScreen(it)
                },
                onClickFilmItem = { filmId ->
                    navController.navigate(HomePageState.FilmPage.route + "/$filmId")
                },
                screenState = selectedScreen.value
            )
        }

        composable(ProfilePageState.MAIN.route) {
            ProfilePage(
                screenState = selectedScreen.value,
                selectedScreen = {
                    navigateToScreen(it)
                },
                onClickItem = { filmId ->
                    navController.navigate(HomePageState.FilmPage.route + "/$filmId")
                },
                onClickCollection = { nameCollection ->
                    navController.navigate(ProfilePageState.GALLERY.route + "/$nameCollection")
                })
        }

        composable(ProfilePageState.GALLERY.route + "/{${NAME_COLLECTION}}") { navBackStackEntry ->
            val collectionName = navBackStackEntry.arguments?.getString(NAME_COLLECTION)
            CollectionFilmListPage(
                collectionName = collectionName ?: "",
                onClickItem = { filmId ->
                    navController.navigate(HomePageState.FilmPage.route + "/$filmId")
                },
                onBackPressed = { navController.popBackStack() },
                screenState = selectedScreen.value,
                selectedScreen = { navigateToScreen(it) }
            )
        }

        composable(SearchPageState.MAIN.route) {
            SettingsNavGraph(
                selectedScreen = { state ->
                    navigateToScreen(state)
                },
                screenState = selectedScreen.value,
                onClickFilmItem = { filmId ->
                    navController.navigate(HomePageState.FilmPage.route + "/$filmId") {
                        popUpTo(SearchPageState.MAIN.route) {
                            inclusive = false
                        }
                    }
                }
            )
        }
    }
}

