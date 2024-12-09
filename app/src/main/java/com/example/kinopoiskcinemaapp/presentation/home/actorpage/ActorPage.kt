package com.example.kinopoiskcinemaapp.presentation.home.actorpage

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.domain.utils.ScreenState
import com.example.kinopoiskcinemaapp.entity.staff.Actor
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.presentation.ViewContainer
import com.example.kinopoiskcinemaapp.presentation.home.components.FilmItemPreview
import com.example.kinopoiskcinemaapp.ui.theme.SmBlueTitleColor
import com.example.kinopoiskcinemaapp.ui.theme.SmLightGrayColor

@SuppressLint("RememberReturnType")
@Composable
fun ActorPagePreview(
    actorPageViewModel: ActorPageViewModel = hiltViewModel(),
    actorId: Int,
    onClickFilmItem: (filmId: Int) -> Unit,
    onClickBack: () -> Unit,
    selectedScreen: (screen: ScreenState) -> Unit,
    onClickFilmography: () -> Unit,
    screenState: ScreenState
) {

    remember { actorPageViewModel.getActorData(actorId) }
    val actor = actorPageViewModel.actor.collectAsState()
    ViewContainer(
        topBar = {
            Row(modifier = Modifier.fillMaxWidth()) {
                IconButton(onClick = { onClickBack() }) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Default.KeyboardArrowLeft,
                        contentDescription = null
                    )
                }
            }
        },
        body = {
            actor.value?.let {
                ActorPageView(
                    it,
                    onClickFilmItem = { filmId -> onClickFilmItem(filmId) },
                    onClickFilmography = { onClickFilmography() },
                    modifier = Modifier.padding(start = 20.dp)
                )
            }
        },
        selectedScreen = { selectedScreen(it) },
        screenState = screenState
    )


}

@Composable
@OptIn(ExperimentalGlideComposeApi::class)
private fun ActorPageView(
    actor: Actor,
    onClickFilmItem: (filmId: Int) -> Unit,
    onClickFilmography: () -> Unit,
    modifier: Modifier
) {
    val scrollState = rememberScrollState()
    val sortedFilmList = actor.films.sortedBy { it.ratingKinopoisk }

    Column(
        modifier = modifier
            .fillMaxWidth()
            .verticalScroll(scrollState)
    ) {
        Row {
            Surface(
                modifier = Modifier.size(150.dp, 220.dp),
                shape = RoundedCornerShape(10.dp)
            ) {
                GlideImage(model = R.drawable.ic_default_person, contentDescription = null) {
                    it.load(actor.posterUrl)
                }
            }
            Spacer(modifier = Modifier.width(20.dp))
            Column {
                PersonNameText(actor.nameRu)
                ProfessionText(actor.profession)
            }
        }
        Spacer(modifier = Modifier.height(30.dp))

        Row(
            horizontalArrangement = Arrangement.SpaceBetween, modifier = Modifier.fillMaxWidth()
        ) {
            FilmGroupText(stringResource(R.string.the_most_name_group))
            ClickableText(
                stringResource(R.string.all_clickable_text),
                onClick = onClickFilmography
            )
        }
        Spacer(modifier = Modifier.height(20.dp))
        LazyRow(horizontalArrangement = Arrangement.spacedBy(10.dp),
            verticalAlignment = Alignment.CenterVertically, content = {
                items(sortedFilmList) { filmItem ->
                    FilmItemPreview(
                        item = filmItem,
                        onClickItem = {
                            onClickFilmItem(
                                if (filmItem.kinopoiskId != 0)
                                    filmItem.kinopoiskId
                                else filmItem.filmId
                            )
                        },
                        isViewed = false
                    )
                }
                item { ShowAllButton { } }
            })
        Spacer(modifier = Modifier.height(20.dp))
        Row(
            modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween
        ) {
            FilmGroupText(text = stringResource(R.string.films_name_group))
            ClickableText(
                text = stringResource(R.string.to_list_clickable_text),
                onClick = { onClickFilmography() })
        }
        FilmsCountText(actor.films.size)
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
private fun FilmsCountText(count: Int) {
    Text(
        text = stringResource(R.string.films_count_text_actor_page, count),
        style = TextStyle(color = Color.Gray)
    )
}

@Composable
private fun ClickableText(text: String, onClick: () -> Unit) {
    ClickableText(
        text = AnnotatedString(text),
        style = TextStyle(color = SmBlueTitleColor),
        onClick = { onClick() }
    )
}

@Composable
private fun FilmGroupText(text: String) {
    Text(text = text)
}

@Composable
private fun ProfessionText(profession: String) {
    Text(
        text = profession, style = TextStyle(color = Color.Gray)
    )
}

@Composable
private fun PersonNameText(name: String) {
    Text(
        text = name, style = MaterialTheme.typography.headlineLarge
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewActorPage() {
    val person = FakeData.actor
    ActorPageView(
        actor = person, onClickFilmItem = {},
        onClickFilmography = {},
        modifier = Modifier.padding(start = 20.dp)
    )
}