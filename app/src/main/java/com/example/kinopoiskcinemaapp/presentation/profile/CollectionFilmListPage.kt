package com.example.kinopoiskcinemaapp.presentation.profile

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.domain.dto.FilmDTO
import com.example.kinopoiskcinemaapp.domain.utils.ScreenState
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.presentation.ViewContainer
import com.example.kinopoiskcinemaapp.ui.theme.SmBlueColor
import com.example.kinopoiskcinemaapp.ui.theme.SmGrayColor
import com.example.kinopoiskcinemaapp.ui.theme.SmWhiteColor


@Composable
fun CollectionFilmListPage(
    screenState: ScreenState,
    collectionName: String = "",
    onClickItem: (id: Int) -> Unit = {},
    collectionListViewModel: CollectionListViewModel? = hiltViewModel(),
    onBackPressed: () -> Unit = {},
    selectedScreen: (screen: ScreenState) -> Unit,
) {
    collectionListViewModel?.getCollection(collectionName)
    val collectionList = collectionListViewModel?.collectionList?.collectAsState()
    val modifier = Modifier
    ViewContainer(
        topBar = {
            Box(modifier = modifier.fillMaxWidth()) {
                IconButton(onClick = onBackPressed) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Default.KeyboardArrowLeft,
                        contentDescription = null,
                        modifier = Modifier.align(Alignment.CenterStart)
                    )
                }
                Text(
                    text = collectionName,
                    style = MaterialTheme.typography.titleLarge,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        },
        body = {
            CollectionFilmListView(
                list = collectionList?.value ?: emptyList(),
                onClickItem = onClickItem,
                modifier = Modifier
            )
        },
        selectedScreen = selectedScreen,
        screenState = screenState
    )
}

@Composable
private fun CollectionFilmListView(
    list: List<FilmDTO>,
    onClickItem: (id: Int) -> Unit,
    modifier: Modifier
) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
        modifier = modifier.padding(20.dp)
    ) {
        items(list) {
            FilmItemDTO(
                filmItem = it,
                onClickItem = onClickItem
            )
        }
    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
private fun FilmItemDTO(filmItem: FilmDTO, onClickItem: (id: Int) -> Unit) {
    Column(
        modifier = Modifier.width(220.dp),
        horizontalAlignment = Alignment.Start
    ) {
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
fun PreviewCollectionFilmListPage() {
    CollectionFilmListView(
        list = FakeData.filmItemList.map {
            FilmDTO(
                filmId = it.filmId,
                filmName = it.nameRu ?: it.nameEn ?: "",
                image = it.posterUrl,
                genre = it.genres.toString(),
                slogan = "",
                descriptions = it.description,
                countries = "",
                filmLength = "",
                ageLimit = "",
                rating = it.ratingKinopoisk,
                date = 0L
            )
        },
        onClickItem = {},
        modifier = Modifier
    )
}