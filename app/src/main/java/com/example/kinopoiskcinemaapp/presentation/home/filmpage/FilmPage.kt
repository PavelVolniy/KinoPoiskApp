package com.example.kinopoiskcinemaapp.presentation.home.filmpage

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.ScrollState
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.domain.utils.ScreenState
import com.example.kinopoiskcinemaapp.entity.filmdetails.FilmDetails
import com.example.kinopoiskcinemaapp.entity.films.FilmItem
import com.example.kinopoiskcinemaapp.entity.images.FilmImages
import com.example.kinopoiskcinemaapp.entity.staff.StaffItem
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.presentation.ViewContainer
import com.example.kinopoiskcinemaapp.presentation.home.bottomsheet.BottomSheetDialog
import com.example.kinopoiskcinemaapp.presentation.home.components.ActorItemPreview
import com.example.kinopoiskcinemaapp.presentation.home.components.FilmDetailsPreview
import com.example.kinopoiskcinemaapp.presentation.home.components.FilmStaffPreview
import com.example.kinopoiskcinemaapp.presentation.home.components.FilmsGroupPreview
import com.example.kinopoiskcinemaapp.presentation.home.components.GalleryPreview
import com.example.kinopoiskcinemaapp.ui.theme.MyTextStyle
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("RememberReturnType", "CoroutineCreationDuringComposition")
@Composable
fun FilmPage(
    filmPageViewModel: FilmPageViewModel = hiltViewModel(),
    filmId: Int,
    onClickFilmItem: (id: Int) -> Unit,
    onClickImageGallery: (id: Int) -> Unit,
    onClickStaff: (id: Int) -> Unit,
    onBackPressed: () -> Unit,
    selectedScreen: (screen: ScreenState) -> Unit,
    screenState: ScreenState,
    onClickSeason: (id: Int) -> Unit
) {
    remember { filmPageViewModel.getFilmDetails(filmId) }
    val scrollState = rememberScrollState()

    val film = filmPageViewModel.filmDetails.collectAsState().value
    val staff = filmPageViewModel.staffByFilm.collectAsState().value
    val images = filmPageViewModel.images.collectAsState().value
    val similarFilms = filmPageViewModel.similarFilms.collectAsState().value
    val collectionList = filmPageViewModel.collections.collectAsState().value

    ViewContainer(topBar = {
        Row(verticalAlignment = Alignment.CenterVertically) {
            IconButton(
                onClick = onBackPressed,
            ) {
                Image(
                    imageVector = Icons.AutoMirrored.Default.ArrowBack,
                    contentDescription = null
                )
            }
        }
    }, body = {
        var isShowDialog by remember { mutableStateOf(false) }
        val scope = rememberCoroutineScope()
        val sheetState = rememberModalBottomSheetState()
        if (isShowDialog) {
            ModalBottomSheet(
                onDismissRequest = { isShowDialog = false },
                sheetState = sheetState
            ) {

                BottomSheetDialog(
                    filmItem = film ?: FakeData.filmDetails,
                    addToCollection = { collectionName ->
                        filmPageViewModel.addFilmToCollection(collectionName)
                    },
                    deleteFromCollection = { collectionName ->
                        filmPageViewModel.dellFilmFromCollection(collectionName)
                    },
                    addNewCollection = { collectionName ->
                        filmPageViewModel.addNewCollection(collectionName)
                    },
                    listCollections = collectionList,
                    isClose = {
                        scope.launch {
                            sheetState.hide()
                        }.invokeOnCompletion { if (!sheetState.isVisible) isShowDialog = false }

                    }
                )
            }
        }
        if (film != null) {
            FilmDetailsView(
                film = film,
                scrollState = scrollState,
                staff = staff ?: emptyList(),
                onClickStaff = onClickStaff,
                images = images ?: FilmImages(emptyList(), 0, 0),
                onClickImageGallery = onClickImageGallery,
                filmId = filmId,
                similarFilms = similarFilms,
                onClickFilmItem = { id ->
                    onClickFilmItem(id)
                },
                addToCollection = {
                    isShowDialog = true
                },
                modifier = Modifier.padding(start = 20.dp),
                onClickSeasons = { filmId ->
                    onClickSeason(filmId)
                }
            )
        }
    },
        selectedScreen = { selectedScreen(it) },
        screenState = screenState
    )
}


@Composable
private fun FilmDetailsView(
    modifier: Modifier,
    film: FilmDetails,
    scrollState: ScrollState,
    staff: List<StaffItem>,
    onClickStaff: (id: Int) -> Unit,
    images: FilmImages,
    onClickImageGallery: (id: Int) -> Unit,
    filmId: Int,
    similarFilms: List<FilmItem>,
    onClickFilmItem: (id: Int) -> Unit,
    addToCollection: () -> Unit,
    onClickSeasons: (id: Int) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(scrollState),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        FilmDetailsPreview(
            film = film,
            addToCollection = { addToCollection() }
        )
        ShortDescriptionFilm(
            slogan = film.slogan ?: "",
            description = film.description ?: film.shortDescription ?: "",
            modifier = modifier
        )
        if (film.serial) {

            SeasonRow(modifier = modifier,
                onClickSeason = {
                    onClickSeasons(filmId)
                })
        }
        staff.let {
            FilmStaffPreview(
                nameGroupPerson = stringResource(R.string.the_film_was_shot_name_group_text),
                person = it,
                total = it.size,
                modifier = modifier,
                onClickGroup = {},
                onClickStaffItem = { staffId -> onClickStaff(staffId) }
            )
        }

        images.let { filmImages ->
            filmImages.items.let { itemFilmImages ->
                if (itemFilmImages.isNotEmpty()) {
                    GalleryPreview(
                        nameGallery = stringResource(R.string.gallery_name_group_text),
                        galleryList = itemFilmImages,
                        size = images.total,
                        modifier = modifier,
                        onClickGalleryGroup = { onClickImageGallery(filmId) }
                    )
                }
            }
        }

        similarFilms.let { list ->
            if (list.isNotEmpty()) {
                FilmsGroupPreview(
                    nameGroup = stringResource(R.string.similar_films_name_group),
                    filmList = list,
                    clickableText = list.size.toString(),
                    onclickItem = { filmId ->
                        onClickFilmItem(filmId)
                    },
                    onClickGroup = {}, //not used
                    modifier = modifier,
                    viewedFilmId = emptyList(),
                    total = list.size
                )
            }
        }
    }
}

@Composable
fun SeasonRow(modifier: Modifier, onClickSeason: () -> Unit) {
    Column(
        modifier = modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(end = 20.dp)
                .clickable {
                    onClickSeason()
                },
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = stringResource(R.string.season_and_series_film_page),
                style = MyTextStyle.bodyLarge
            )
            Text(
                text = stringResource(R.string.all_clickable_text),
                style = MyTextStyle.bodyLargeSelected
            )
        }
    }
}

@Composable
private fun ShortDescriptionFilm(slogan: String, description: String, modifier: Modifier) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        SloganText(slogan, modifier)
        DescriptionText(description, modifier)
    }
}

@Composable
private fun DescriptionText(description: String, modifier: Modifier) {
    var isLong by remember { mutableStateOf(description.length > 250) }
    var maxLine by remember { mutableIntStateOf(3) }
    Text(
        text = description,
        style = MyTextStyle.bodyMedium,
        modifier = modifier
            .padding(end = 20.dp)
            .fillMaxWidth()
            .clickable {
                isLong = !isLong
                if (isLong) maxLine = 4 else maxLine = 10
            },
        overflow = if (isLong) TextOverflow.Ellipsis else TextOverflow.Visible,
        maxLines = maxLine
    )
}

@Composable
private fun SloganText(slogan: String, modifier: Modifier) {
    Text(
        text = slogan,
        style = MyTextStyle.bodyLarge,
        modifier = modifier
            .fillMaxWidth()
    )
}


@Preview(showBackground = true)
@Composable
fun PreviewFilmPage() {
    FilmDetailsView(
        film = FakeData.filmDetails,
        staff = FakeData.personStaff,
        images = FilmImages(FakeData.galleryItems, 1, 10),
        similarFilms = FakeData.filmItemList,
        filmId = 1,
        onClickFilmItem = {},
        onClickImageGallery = {},
        onClickStaff = {},
        scrollState = ScrollState(0),
        addToCollection = {},
        modifier = Modifier.padding(start = 20.dp),
        onClickSeasons = {}
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewPersonItem() {
    ActorItemPreview(person = FakeData.personStaff[0], onClickItem = {})
}

