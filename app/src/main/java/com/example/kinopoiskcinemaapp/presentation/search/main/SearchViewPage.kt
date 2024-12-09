package com.example.kinopoiskcinemaapp.presentation.search.main

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.domain.utils.ScreenState
import com.example.kinopoiskcinemaapp.entity.RequestState
import com.example.kinopoiskcinemaapp.entity.films.FilmItem
import com.example.kinopoiskcinemaapp.presentation.ViewContainer
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

@Composable
fun SearchViewPage(
    resultRequest: RequestState,
    onClickSearchText: (text: String) -> Unit,
    onClickSettings: () -> Unit,
    selectedScreen: (screen: ScreenState) -> Unit,
    screenState: ScreenState,
    onClickFilmItem: (id: Int) -> Unit
) {

    var textRequest by rememberSaveable { mutableStateOf("") }
    val listState = rememberLazyListState()
    val scope = rememberCoroutineScope()

    ViewContainer(
        topBar = {
            Surface(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp),
                color = Color.LightGray,
                shape = RoundedCornerShape(30.dp)
            ) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    verticalAlignment = Alignment.CenterVertically,
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    OutlinedTextField(
                        value = textRequest,
                        leadingIcon = {
                            IconButton(onClick = {
                                onClickSearchText(textRequest)
                                scope.launch {
                                    delay(700)
                                    listState.animateScrollToItem(0, 0)
                                }
                            }) {
                                Icon(
                                    imageVector = Icons.Default.Search,
                                    contentDescription = null,
                                    modifier = Modifier.size(15.dp)
                                )
                            }
                        },
                        onValueChange = { changedText ->
                            textRequest = changedText
                            scope.launch {
                                delay(1500)
                                if (textRequest == changedText) {
                                    onClickSearchText(textRequest)
                                }
                            }
                        },
                        placeholder = {
                            Text(
                                stringResource(R.string.placeholder_search_text),
                                style = TextStyle(fontSize = 13.sp)
                            )
                        },
                        textStyle = TextStyle(
                            color = Color.Black,
                            fontWeight = FontWeight.Normal,
                            fontSize = 13.sp
                        ),
                        maxLines = 1,
                        colors = OutlinedTextFieldDefaults.colors(
                            focusedBorderColor = Color.LightGray,
                            unfocusedBorderColor = Color.LightGray
                        ),
                    )
                    VerticalDivider(Modifier.height(15.dp), color = Color.Gray)
                    IconButton(onClick = { onClickSettings() }) {
                        Icon(
                            painter = painterResource(R.drawable.icon_settings),
                            contentDescription = null,
                            modifier = Modifier.size(15.dp)
                        )
                    }
                }
            }
        },
        body = {
            when (resultRequest) {
                RequestState.Error -> {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 20.dp, end = 20.dp)
                    ) {
                        Spacer(Modifier.height(40.dp))
                        Row(verticalAlignment = Alignment.CenterVertically) {
                            Text(
                                text = stringResource(R.string.no_data_text_search_page),
                                style = MaterialTheme.typography.bodyLarge,
                                textAlign = TextAlign.Center
                            )
                        }
                    }

                }

                RequestState.Loading -> {
                    Column(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalAlignment = Alignment.CenterHorizontally,
                        verticalArrangement = Arrangement.Center
                    ) {
                        Spacer(Modifier.height(40.dp))
                        CircularProgressIndicator()
                    }

                }

                is RequestState.Success -> {
                    LazyColumn(
                        verticalArrangement = Arrangement.spacedBy(10.dp),
                        modifier = Modifier.padding(start = 20.dp, end = 20.dp),
                        state = listState
                    ) {
                        item { Spacer(Modifier.height(20.dp)) }
                        items(resultRequest.list) {
                            FilmItem(it) { filmId -> onClickFilmItem(filmId) }
                        }
                    }
                }
            }
        },
        selectedScreen = { state -> selectedScreen(state) },
        screenState = screenState
    )

}

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
private fun FilmItem(filmItem: FilmItem, onClickRow: (filmId: Int) -> Unit) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = Modifier.clickable { onClickRow(filmItem.kinopoiskId ?: 0) }
    ) {
        Card {
            Box() {
                GlideImage(
                    modifier = Modifier.size(120.dp, 180.dp),
                    model = R.drawable.ic_default_frame,
                    contentDescription = null
                ) {
                    it.load(filmItem.posterUrl)
                }

                Surface(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(5.dp),
                    color = MaterialTheme.colorScheme.inversePrimary,
                    shape = RoundedCornerShape(15.dp),
                    shadowElevation = 4.dp
                ) {
                    RatingText(filmItem.ratingKinopoisk.toString() ?: "")
                }

            }
        }
        Spacer(Modifier.width(20.dp))
        Column(verticalArrangement = Arrangement.Center, horizontalAlignment = Alignment.Start) {
            Text(text = filmItem.nameRu ?: "")
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

@Composable
private fun RatingText(rating: String) {
    Text(
        text = rating,
        modifier = Modifier
            .background(MaterialTheme.colorScheme.inversePrimary)
            .padding(5.dp),
        style = MaterialTheme.typography.titleSmall
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewFilmItem() {
    FilmItem(FakeData.filmItem) { }
}


@Preview(showBackground = true)
@Composable
fun PreviewSearchView() {
    SearchViewPage(
        RequestState.Success(FakeData.filmItemList),
        {},
        {},
        {},
        ScreenState.SearchScreen
    ) {}
}