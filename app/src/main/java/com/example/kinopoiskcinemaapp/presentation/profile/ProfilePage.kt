package com.example.kinopoiskcinemaapp.presentation.profile

import android.annotation.SuppressLint
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Clear
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.domain.dto.CollectionDTO
import com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms
import com.example.kinopoiskcinemaapp.domain.dto.FilmDTO
import com.example.kinopoiskcinemaapp.domain.utils.ScreenState
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.presentation.ViewContainer
import com.example.kinopoiskcinemaapp.presentation.home.bottomsheet.CollectionNameDialog
import com.example.kinopoiskcinemaapp.ui.theme.MyTextStyle
import com.example.kinopoiskcinemaapp.ui.theme.SmBlackColor
import com.example.kinopoiskcinemaapp.ui.theme.SmBlueColor
import com.example.kinopoiskcinemaapp.ui.theme.SmBlueTitleColor
import com.example.kinopoiskcinemaapp.ui.theme.SmGrayColor
import com.example.kinopoiskcinemaapp.ui.theme.SmLightGrayColor
import com.example.kinopoiskcinemaapp.ui.theme.SmWhiteColor

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun ProfilePage(
    screenState: ScreenState,
    selectedScreen: (screen: ScreenState) -> Unit,
    profileViewModel: ProfileViewModel = hiltViewModel(),
    onClickItem: (id: Int) -> Unit,
    onClickCollection: (nameCollection: String) -> Unit
) {

    profileViewModel.getCollections()
    profileViewModel.getLast20Films()
    val collections = profileViewModel.collections.collectAsState()
    val films = profileViewModel.lookedFilms.collectAsState()
    var isShowDialog by remember { mutableStateOf(false) }

    ViewContainer(
        topBar = { Spacer(modifier = Modifier.height(50.dp)) },
        body = {
            ProfileView(
                lookedFilmList = films.value,
                wasInterestingFilmList = films.value,
                collectionsList = collections.value,
                createNewCollection = {
                    isShowDialog = true
                },
                deleteCollection = { nameCollection ->
                    profileViewModel.deleteCollectionByName(nameCollection)
                },
                onClickItem = onClickItem,
                onClickCollection = onClickCollection
            )
            if (isShowDialog) {
                BasicAlertDialog(onDismissRequest = { isShowDialog = false }) {
                    CollectionNameDialog(
                        isClose = {
                            isShowDialog = false
                        },
                        isSuccess = {
                            profileViewModel.addNewCollection(it)
                            profileViewModel.getCollections()
                            isShowDialog = false
                        }
                    )
                }
            }

        },
        selectedScreen = { selectedScreen(it) },
        screenState = screenState
    )
}

@Composable
fun ProfileView(
    lookedFilmList: List<FilmDTO>,
    wasInterestingFilmList: List<FilmDTO>,
    collectionsList: List<CollectionWithFilms>,
    createNewCollection: () -> Unit,
    deleteCollection: (nameCollection: String) -> Unit,
    onClickItem: (id: Int) -> Unit = {},
    onClickCollection: (nameCollection: String) -> Unit
) {
    val modifier = Modifier.padding(start = 20.dp)
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .verticalScroll(state = rememberScrollState()),
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        FilmGroup(
            modifier = modifier,
            titleFilmGroup = stringResource(R.string.looked_title_profil_page),
            listFilmDTO = lookedFilmList,
            onClickItem = onClickItem
        )

        CollectionsGroup(
            modifier = modifier,
            collectionList = collectionsList,
            createNewCollection = { createNewCollection() },
            deleteCollection = deleteCollection,
            onClickCollection = onClickCollection
        )

        FilmGroup(
            modifier = modifier,
            stringResource(R.string.was_interesting_title_profil_page),
            listFilmDTO = wasInterestingFilmList,
            onClickItem = {}
        )

        Spacer(Modifier.height(10.dp))
    }

}

@Composable
private fun ShowAllButton(onClick: () -> Unit) {
    Column(
        modifier = Modifier.padding(end = 10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        IconButton(
            onClick = { onClick() },
        ) {
            Surface(
                shape = CircleShape,
                color = SmLightGrayColor
            ) {
                Icon(
                    imageVector = Icons.AutoMirrored.Default.ArrowForward,
                    contentDescription = null,
                    modifier = Modifier.padding(10.dp),
                    tint = SmBlueTitleColor
                )
            }

        }
        Text(text = stringResource(R.string.show_all_button))
    }
}


@Composable
private fun CollectionsGroup(
    modifier: Modifier,
    collectionList: List<CollectionWithFilms>,
    createNewCollection: () -> Unit,
    deleteCollection: (nameCollection: String) -> Unit,
    onClickCollection: (nameCollection: String) -> Unit
) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(end = 20.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Title(stringResource(R.string.collection_title_profile_page))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .clickable { createNewCollection() },
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(imageVector = Icons.Default.Add, contentDescription = null)
            Spacer(Modifier.width(15.dp))
            Text(text = stringResource(R.string.create_new_collection_button))
        }

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier.height(310.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            horizontalArrangement = Arrangement.spacedBy(10.dp)
        ) {
            items(collectionList) {
                CollectionCardItem(
                    paint = it.collectionDTO.icon,
                    nameCollection = it.collectionDTO.collectionName,
                    count = it.films.size,
                    isClosable = it.collectionDTO.closable,
                    onClose = { deleteCollection(it.collectionDTO.collectionName) },
                    onClick = { nameCollection ->
                        onClickCollection(nameCollection)
                    }
                )
            }
        }
    }
}

@Composable
private fun CollectionCardItem(
    paint: Int,
    nameCollection: String,
    count: Int,
    isClosable: Boolean = false,
    onClose: () -> Unit,
    onClick: (nameCollection: String) -> Unit
) {
    Card(
        modifier = Modifier.size(150.dp),
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(1.dp, color = SmBlackColor)
    ) {
        Box(modifier = Modifier
            .fillMaxSize()
            .clickable { onClick(nameCollection) }) {
            Column(
                modifier = Modifier.align(Alignment.Center),
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.spacedBy(3.dp)
            ) {
                Icon(
                    painter = painterResource(paint),
                    modifier = Modifier.size(30.dp),
                    tint = SmGrayColor,
                    contentDescription = null
                )
                Text(text = nameCollection)
                Surface(
                    shape = RoundedCornerShape(15.dp),
                    shadowElevation = 4.dp
                ) {
                    RatingText(count.toString())
                }
            }
            if (isClosable) {
                IconButton(
                    modifier = Modifier.align(Alignment.TopEnd),
                    onClick = { onClose() }) {
                    Icon(imageVector = Icons.Default.Clear, contentDescription = null)
                }
            }
        }
    }
}

@Composable
fun Title(title: String) {
    Text(
        text = title,
        style = TextStyle(
            color = SmBlackColor,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    )
}

@Composable
private fun FilmGroup(
    modifier: Modifier,
    titleFilmGroup: String,
    listFilmDTO: List<FilmDTO>,
    onClickItem: (id: Int) -> Unit
) {
    Column(
        verticalArrangement = Arrangement.spacedBy(20.dp),
        modifier = modifier
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = titleFilmGroup,
                style = TextStyle(
                    color = SmBlackColor,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold
                )
            )
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (listFilmDTO.size > 10)
                    Text(
                        text = "${listFilmDTO.size}",
                        style = MyTextStyle.bodyLargeSelected
                    )
                Icon(
                    imageVector = Icons.AutoMirrored.Default.KeyboardArrowRight,
                    contentDescription = null,
                    tint = SmBlueTitleColor
                )
            }
        }
        LazyRow(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(10.dp),
        ) {
            items(listFilmDTO) { filmItem ->
                FilmItemDTO(filmItem) { onClickItem(filmItem.filmId ?: 0) }
            }
            item {
                ShowAllButton { }
            }
        }
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
private fun FilmItemDTO(filmItem: FilmDTO, onClickItem: (id: Int) -> Unit) {

    Column(modifier = Modifier.width(220.dp)) {
        Card(onClick = { onClickItem(filmItem.filmId ?: 0) }) {
            Box() {
                GlideImage(
                    model = painterResource(R.drawable.ic_image),
                    contentDescription = null,
                    modifier = Modifier.size(180.dp, 220.dp)
                ) {
                    it.load(filmItem.image).centerCrop()
                }
                if (filmItem.rating > 0.0) {
                    Surface(
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(10.dp),
                        shape = RoundedCornerShape(15.dp),
                        shadowElevation = 4.dp
                    ) {
                        RatingText(filmItem.rating.toString())
                    }
                }
            }
        }
        Text(
            text = filmItem.filmName,
            modifier = Modifier.padding(top = 5.dp)
        )
        Text(
            text = filmItem.genre,
            modifier = Modifier.padding(top = 5.dp),
            style = TextStyle(color = SmGrayColor)
        )
    }

}

@Composable
private fun RatingText(rating: String) {
    Text(
        text = rating,
        modifier = Modifier
            .background(SmBlueColor)
            .padding(start = 5.dp, end = 5.dp),
        style = TextStyle(color = SmWhiteColor, fontSize = 14.sp)
    )
}


@Preview(showBackground = true)
@Composable
fun PreviewProfilePage() {
    ProfileView(
        lookedFilmList = FakeData.filmItemList.map {
            FilmDTO(
                filmName = it.nameRu,
                image = it.imageUrl,
                genre = it.genres.map { it.genre }.toString().trim('[', ']'),
                rating = 4.5,
                descriptions = "",
                countries = "",
                date = 1L,
                slogan = "",
                filmLength = "",
                ageLimit = ""
            )
        },
        wasInterestingFilmList = FakeData.filmItemList.map {
            FilmDTO(
                filmName = it.nameRu,
                image = it.imageUrl,
                genre = it.genres.map { it.genre }.toString().trim('[', ']'),
                rating = 4.5,
                descriptions = "",
                countries = "",
                date = 1L,
                slogan = "",
                filmLength = "",
                ageLimit = ""
            )
        },
        collectionsList = listOf(
            CollectionWithFilms(
                CollectionDTO("like", R.drawable.icons, false),
                films = emptyList()
            ),
            CollectionWithFilms(
                CollectionDTO("like", R.drawable.icons, false),
                films = emptyList()
            ),
            CollectionWithFilms(CollectionDTO("like", R.drawable.icons, true), films = emptyList()),
        ),
        createNewCollection = {},
        deleteCollection = {},
        onClickCollection = {}
    )
}