package com.example.kinopoiskcinemaapp.presentation.search

import android.annotation.SuppressLint
import android.util.Log
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.kinopoiskcinemaapp.domain.utils.FilmType
import com.example.kinopoiskcinemaapp.domain.utils.ScreenState
import com.example.kinopoiskcinemaapp.domain.utils.Sorting
import com.example.kinopoiskcinemaapp.presentation.search.main.SearchViewPage
import com.example.kinopoiskcinemaapp.presentation.search.settings.PeriodDateView
import com.example.kinopoiskcinemaapp.presentation.search.settings.SearchPageState
import com.example.kinopoiskcinemaapp.presentation.search.settings.SearchSettingsPage
import com.example.kinopoiskcinemaapp.presentation.search.settings.SelectCountryView
import com.example.kinopoiskcinemaapp.presentation.search.settings.SelectGenreView
import com.example.kinopoiskcinemaapp.presentation.search.settings.SettingsViewContainer

@SuppressLint("RememberReturnType")
@Composable
fun SettingsNavGraph(
    searchViewModel: SearchViewModel = hiltViewModel(),
    selectedScreen: (screen: ScreenState) -> Unit,
    screenState: ScreenState,
    onClickFilmItem: (filmId: Int) -> Unit
) {
    val navHostController = rememberNavController()
    val listCountries = searchViewModel.countryListNames.collectAsState()
    val listGenres = searchViewModel.genreList.collectAsState()

    val countriesId = rememberSaveable { mutableIntStateOf(0) }
    val countriesName = rememberSaveable { mutableStateOf("") }
    val genresId = rememberSaveable { mutableIntStateOf(0) }
    val genresName = rememberSaveable { mutableStateOf("") }
    val sortingName = rememberSaveable { mutableStateOf(Sorting.YEAR.name) }
    val filmsTypeName = rememberSaveable { mutableStateOf(FilmType.ALL.name) }
    val ratingFrom = rememberSaveable { mutableIntStateOf(0) }
    val ratingTo = rememberSaveable { mutableIntStateOf(10) }
    val yearFrom = rememberSaveable { mutableIntStateOf(1900) }
    val yearTo = rememberSaveable { mutableIntStateOf(2024) }
    val keyWord = rememberSaveable { mutableStateOf("") }

    fun getFilms() {
        searchViewModel.getFilmsByParams(
            countriesId = countriesId.intValue,
            genresId = genresId.intValue,
            order = sortingName.value,
            type = filmsTypeName.value,
            ratingFrom = ratingFrom.intValue,
            ratingTo = ratingTo.intValue,
            yearFrom = yearFrom.intValue,
            yearTo = yearTo.intValue,
            keyword = keyWord.value,
        )

    }

    NavHost(
        navController = navHostController,
        startDestination = SearchPageState.MAIN.route
    ) {
        composable(SearchPageState.MAIN.route) {
            remember { getFilms() }
            val listFilms = searchViewModel.filmList.collectAsState()
            SearchViewPage(
                resultRequest = listFilms.value,
                onClickSearchText = { text ->
                    keyWord.value = text
                    getFilms()
                },
                onClickSettings = { navHostController.navigate(SearchPageState.SETTINGS.route) },
                selectedScreen = { screenState ->
                    selectedScreen(screenState)
                },
                screenState = screenState,
                onClickFilmItem = { filmId ->
                    onClickFilmItem(filmId)
                }
            )
        }

        composable(SearchPageState.SETTINGS.route) {
            SettingsViewContainer(
                titleName = "Settings search",
                onBackPressed = {
                    navHostController.popBackStack()
                },
                body = {
                    SearchSettingsPage(
                        onPressCountry = { navHostController.navigate(SearchPageState.COUNTRY.route) },
                        onPressGenre = { navHostController.navigate(SearchPageState.GENRE.route) },
                        onPressYear = { navHostController.navigate(SearchPageState.PERIOD.route) },
                        changedRatingFrom = { from -> ratingFrom.intValue = from },
                        changedRatingTo = { to -> ratingTo.intValue = to },
                        filmType = { filmsTypeName.value = it.name },
                        sorting = { sortingName.value = it.name },
                        countryValue = countriesName.value,
                        genre = genresName.value,
                        years = if (yearFrom.intValue == 0 || yearTo.intValue == 0) {
                            ""
                        } else {
                            "from ${yearFrom.intValue} to ${yearTo.intValue}"
                        },
                        hideViewedFilms = {}
                    )
                })
        }

        composable(SearchPageState.COUNTRY.route) {
            SelectCountryView(
                listCountries = listCountries.value,
                nameItem = { countryItem ->
                    countriesName.value = countryItem.country
                    countriesId.intValue = countryItem.id
                    navHostController.popBackStack()
                }
            )
        }

        composable(SearchPageState.GENRE.route) {
            SelectGenreView(listGenres = listGenres.value,
                nameItem = { genreItem ->
                    genresName.value = genreItem.genre
                    genresId.intValue = genreItem.id
                    navHostController.popBackStack()
                })
        }

        composable(SearchPageState.PERIOD.route) {
            PeriodDateView(onSuccessPressed = { from, to ->
                yearFrom.intValue = from
                yearTo.intValue = to
                navHostController.popBackStack()
            },
                onBackPressed = { navHostController.popBackStack() })
        }
    }
}