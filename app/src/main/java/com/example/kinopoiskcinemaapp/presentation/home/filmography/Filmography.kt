package com.example.kinopoiskcinemaapp.presentation.home.filmography

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.domain.utils.ScreenState
import com.example.kinopoiskcinemaapp.entity.films.FilmItem
import com.example.kinopoiskcinemaapp.entity.staff.Actor
import com.example.kinopoiskcinemaapp.presentation.ViewContainer
import com.example.kinopoiskcinemaapp.presentation.home.actorpage.ActorPageViewModel

@Composable
fun FilmographyPreview(
    actorPageViewModel: ActorPageViewModel = hiltViewModel(),
    selectedScreen: (screen: ScreenState) -> Unit,
    onClickFilmItem: (filmId: Int) -> Unit,
    onBackButtonPressed: () -> Unit,
    screenState: ScreenState
) {
    val actor = actorPageViewModel.actor.collectAsState()

    ViewContainer(
        topBar = {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier.fillMaxWidth()
            ) {
                IconButton(onClick = { onBackButtonPressed() }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Default.ArrowBack,
                        contentDescription = null
                    )
                }
                Text(
                    text = stringResource(R.string.filmography_title),
                    style = MaterialTheme.typography.bodyLarge
                )
                Spacer(Modifier.width(50.dp))
            }
        },
        body = {
            actor.value?.let {
                FilmographyView(it,
                    onClickRow = { filmId ->
                        onClickFilmItem(filmId)
                    })
            }
        },
        selectedScreen = { screen -> selectedScreen(screen) },
        screenState = screenState
    )


}

@Composable
private fun FilmographyView(actor: Actor, onClickRow: (filmId: Int) -> Unit) {
    var isChecked by remember {
        mutableStateOf(actor.films[0].professionKey ?: "")
    }

    Column(modifier = Modifier.fillMaxSize()) {
        NameActorView(actor.nameRu)
        Spacer(modifier = Modifier.height(10.dp))
        val listNameButtons = mutableSetOf<String>()
        val listButtons = mutableListOf<Pair<String, Int>>()

        actor.films.forEach {
            listNameButtons.add(it.professionKey)
        }

        listNameButtons.forEach { nameButton ->
            listButtons.add(
                (Pair(
                    nameButton,
                    actor.films.count { filmItem -> filmItem.professionKey == nameButton }))
            )
        }

        BottomsRow(filmsGroup = listButtons,
            isChecked = isChecked,
            checkItem = { isChecked = it })

        LazyColumn {
            items(actor.films.filter { it.professionKey == isChecked }) {
                FilmItem(it, onClickRow = { filmId -> onClickRow(filmId) })
            }
        }

    }
}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
private fun FilmItem(filmItem: FilmItem, onClickRow: (filmId: Int) -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier.clickable {
            onClickRow(
                if (filmItem.kinopoiskId != 0) filmItem.kinopoiskId else filmItem.filmId ?: 0
            )
        }
    ) {
        GlideImage(
            modifier = Modifier.size(80.dp, 120.dp),
            model = R.drawable.ic_default_frame,
            contentDescription = null
        ) {
            it.load(filmItem.posterUrl)
        }
        Spacer(Modifier.width(20.dp))
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.Start) {
            Text(text = filmItem.nameRu ?: filmItem.nameEn ?: "")
            if (filmItem.genres != null) {
                Text(
                    text = "${filmItem.year}, ${
                        filmItem.genres.map { it.genre }.toString().trim('[', ']') ?: ""
                    }"
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewFilmItem() {
    FilmItem(FakeData.filmItem) {}
}

@Composable
private fun BottomsRow(
    filmsGroup: List<Pair<String, Int>>,
    isChecked: String,
    checkItem: (item: String) -> Unit
) {
    LazyRow(horizontalArrangement = Arrangement.spacedBy(10.dp), content = {
        items(filmsGroup) { imagesType ->
            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                if (isChecked === imagesType.first) {
                    Button(onClick = {

                    }) {
                        GalleryButton(imageType = imagesType.first, imagesType.second)
                    }
                } else OutlinedButton(onClick = { checkItem(imagesType.first) }) {
                    GalleryButton(imageType = imagesType.first, imagesType.second)
                }
            }
        }
    })
}

@Composable
private fun GalleryButton(
    imageType: String,
    listSize: Int
) {
    Text(text = imageType)
    Text(
        text = " $listSize",
        style = TextStyle(color = Color.Gray)
    )
}

@Composable
private fun NameActorView(nameActor: String) {
    Text(text = nameActor, style = MaterialTheme.typography.headlineLarge)
}

@Preview(showBackground = true)
@Composable
fun PreviewFilmographyView() {
    FilmographyView(FakeData.actor, onClickRow = {})
}