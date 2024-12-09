package com.example.kinopoiskcinemaapp.presentation.home.listpage

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.paging.LoadState
import androidx.paging.compose.LazyPagingItems
import androidx.paging.compose.collectAsLazyPagingItems
import com.example.kinopoiskcinemaapp.domain.utils.FilmType
import com.example.kinopoiskcinemaapp.domain.utils.ScreenState
import com.example.kinopoiskcinemaapp.entity.collections.CollectionsType
import com.example.kinopoiskcinemaapp.entity.films.FilmItem
import com.example.kinopoiskcinemaapp.presentation.ViewContainer
import com.example.kinopoiskcinemaapp.presentation.home.components.FilmItemPreview

@SuppressLint("RememberReturnType")
@Composable
fun ListPage(
    listPageViewModel: ListPageViewModel = hiltViewModel(),
    typeFilmRequest: String,
    onClickItem: (filmId: Int) -> Unit,
    onClickBack: () -> Unit,
    selectedScreen: (screen: ScreenState) -> Unit,
    screenState: ScreenState
) {

    remember { listPageViewModel.getFilms(typeFilmRequest) }
    val titleName = CollectionsType.values().find { it.nameRequest === typeFilmRequest }
        ?: FilmType.values().find { it.nameRequest === typeFilmRequest }

    val filmGroup: LazyPagingItems<FilmItem> =
        listPageViewModel.collectionsFilms.collectAsLazyPagingItems()

    ViewContainer(topBar = {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(),
        ) {
            Box(modifier = Modifier.fillMaxWidth()) {
                IconButton(
                    onClick = onClickBack,
                    modifier = Modifier.align(Alignment.CenterStart)
                ) {
                    Image(
                        imageVector = Icons.AutoMirrored.Default.ArrowBack,
                        contentDescription = null
                    )
                }
                Text(
                    text = titleName?.let { stringResource(it.nameGroup) } ?: "",
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        }
    }, body = {
        ListFilmsView(
            listFilmItem = filmGroup,
            onClickItem = { onClickItem(it) }
        )
        if (filmGroup.loadState.refresh is LoadState.Loading) {
            CircularProgressIndicator()
        }
    },
        selectedScreen = { selectedScreen(it) },
        screenState = screenState
    )


}

@Composable
private fun ListFilmsView(
    listFilmItem: LazyPagingItems<FilmItem>,
    onClickItem: (filmId: Int) -> Unit
) {
    LazyVerticalGrid(columns = GridCells.Fixed(2),
        modifier = Modifier.padding(start = 10.dp, end = 10.dp),
        horizontalArrangement = Arrangement.spacedBy(20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        content = {
            items(listFilmItem.itemCount) { index ->
                listFilmItem[index].let {
                    it?.let { filmItem ->
                        FilmItemPreview(item = filmItem,
                            isViewed = filmItem.filmId == index,
                            onClickItem = { filmId ->
                                onClickItem(filmId)
                            })
                    }
                }
            }
        })
}

@Preview
@Composable
fun PreviewListFilms() {

//    ListFilmsView(filmGroup = premieres) {}
}
