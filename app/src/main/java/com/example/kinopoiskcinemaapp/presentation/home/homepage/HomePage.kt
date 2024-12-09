
package com.example.kinopoiskcinemaapp.presentation.home.homepage

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.domain.utils.FilmType
import com.example.kinopoiskcinemaapp.domain.utils.HomePageRequestState
import com.example.kinopoiskcinemaapp.domain.utils.ScreenState
import com.example.kinopoiskcinemaapp.entity.FilmGroup
import com.example.kinopoiskcinemaapp.entity.GroupsType
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.presentation.ViewContainer
import com.example.kinopoiskcinemaapp.presentation.home.components.FilmsGroupPreview

@SuppressLint("RememberReturnType")
@Composable
fun HomePage(
    homePageViewModel: HomePageViewModel = hiltViewModel(),
    onClickItem: (id: Int) -> Unit,
    onClickGroup: (nameGroup: GroupsType) -> Unit,
    selectedScreen: (screen: ScreenState) -> Unit,
    screen: ScreenState
) {

    val listFilmGroup = homePageViewModel.filmGroupList.collectAsState()
    val viewedCollectionFilmList = homePageViewModel.collectionWithFilmsDTO
        .find { it.collectionDTO.collectionName == stringResource(R.string.viewed_default_name_collection) }
        ?.films
    val listId = (viewedCollectionFilmList ?: emptyList())
    ViewContainer(
        topBar = {
            Text(
                modifier = Modifier.padding(20.dp),
                style = TextStyle(fontSize = 20.sp),
                text = stringResource(id = R.string.app_name)
            )
        },
        body = {
            when (listFilmGroup.value) {
                is HomePageRequestState.Error -> {}
                HomePageRequestState.Loading -> {}
                is HomePageRequestState.Success -> {
                    FilmDataView(
                        listFilmGroup = (listFilmGroup.value as HomePageRequestState.Success).listGroup,
                        viewedFilmList = listId.map { it.filmId ?: 0 },
                        onClickItem = { filmId -> onClickItem(filmId) },
                        onClickGroup = { nameGroup -> onClickGroup(nameGroup) }
                    )

                }
            }

        },
        selectedScreen = { selectedScreen(it) },
        screenState = screen
    )

}

@Composable
private fun FilmDataView(
    listFilmGroup: List<FilmGroup>,
    viewedFilmList: List<Int>,
    onClickItem: (id: Int) -> Unit,
    onClickGroup: (nameGroup: GroupsType) -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        LazyColumn(
            modifier = Modifier.fillMaxWidth(),
            verticalArrangement = Arrangement.spacedBy(30.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            items(listFilmGroup) { filmGroup ->
                FilmsGroupPreview(
                    nameGroup = stringResource(filmGroup.group.nameGroup),
                    filmList = filmGroup.listFilms,
                    viewedFilmId = viewedFilmList,
                    clickableText = stringResource(id = R.string.all_clickable_text),
                    onclickItem = { filmItemId -> onClickItem(filmItemId) },
                    onClickGroup = { onClickGroup(filmGroup.group) },
                    modifier = Modifier.padding(start = 20.dp),
                    total = filmGroup.total
                )
                Spacer(modifier = Modifier.height(20.dp))
            }

        }
    }
}


@Preview(showBackground = true)
@Composable
fun PreviewHomePage() {

    FilmDataView(
        listFilmGroup = listOf(
            FilmGroup(FilmType.TEST, FakeData.filmItemList, 21),
            FilmGroup(FilmType.TEST, FakeData.filmItemList, 10)
        ),
        onClickItem = {},
        onClickGroup = {},
        viewedFilmList = emptyList()
    )
}