package com.example.kinopoiskcinemaapp.presentation.home.gallerypage

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.rememberLazyGridState
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.Card
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
import com.example.kinopoiskcinemaapp.domain.utils.ImageType
import com.example.kinopoiskcinemaapp.domain.utils.ScreenState
import com.example.kinopoiskcinemaapp.entity.images.ItemFilmImages
import com.example.kinopoiskcinemaapp.presentation.ViewContainer


@OptIn(ExperimentalGlideComposeApi::class)
@SuppressLint("RememberReturnType")
@Composable
fun GalleryPagePreview(
    galleryPageViewModel: GalleryPageViewModel = hiltViewModel(),
    filmId: Int,
    onClickBack: () -> Unit,
    selectedScreen: (screen: ScreenState) -> Unit,
    screenState: ScreenState
) {
    remember { galleryPageViewModel.getImagesById(filmId) }
    val imagesGroup = galleryPageViewModel.images.collectAsState()
    var isChecked by remember { mutableStateOf(ImageType.STILL.name) }
    var image by remember { mutableStateOf("") }

    ViewContainer(topBar = {
        Row(
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth()
        ) {
            IconButton(onClick = { onClickBack() }) {
                Icon(
                    imageVector = Icons.AutoMirrored.Default.ArrowBack,
                    contentDescription = null
                )
            }
            Text(
                text = stringResource(R.string.gallery_name_group_text),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(Modifier.width(40.dp))
        }
    }, body = {
        val modifier = Modifier.padding(start = 20.dp)
        if (image.isEmpty()) {
            Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {
                BottomsRow(
                    modifier = modifier,
                    imagesGroup = imagesGroup.value.map { Pair(it.key, it.value.total) }
                        .filter { it.second > 0 }, isChecked, checkItem = { isChecked = it })

                imagesGroup.value[isChecked]?.items?.let {
                    ImagesGrid(
                        modifier = modifier,
                        imagesList = it,
                        onClickImage = { imagePath ->
                            image = imagePath
                        }
                    )
                }
            }
        } else {
            Box(modifier = modifier.fillMaxSize()) {
                Card(modifier = Modifier
                    .clickable { image = "" }
                    .align(Alignment.Center)) {
                    GlideImage(model = null, contentDescription = null) {
                        it.load(image)
                    }
                }
            }
        }
    }, selectedScreen = { selectedScreen(it) },
        screenState = screenState
    )

}

@Composable
@OptIn(ExperimentalGlideComposeApi::class)
private fun ImagesGrid(
    modifier: Modifier,
    imagesList: List<ItemFilmImages>,
    onClickImage: (imagePath: String) -> Unit
) {
    val stateGrid = rememberLazyGridState()
    LazyVerticalGrid(
        state = stateGrid,
        modifier = modifier.padding(end = 20.dp),
        columns = GridCells.Fixed(2),
        verticalArrangement = Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(10.dp),
    ) {
        imagesList.forEachIndexed { index, _ ->
            if (index % 3 == 0) GridItemSpan(2)
            else GridItemSpan(1)
        }
        val list = imagesList.mapIndexed { index, itemFilmImages -> Pair(index, itemFilmImages) }
        items(
            list,
            span = {
                GridItemSpan(if (it.first % 3 == 0) 2 else 1)
            }) { images ->
            Card(modifier = modifier.clickable { onClickImage(images.second.imageUrl) }) {
                GlideImage(
                    model = R.drawable.ic_default_person, contentDescription = null
                ) {
                    it.load(images.second.imageUrl)
                }
            }
        }
    }
}

@Composable
private fun BottomsRow(
    modifier: Modifier,
    imagesGroup: List<Pair<String, Int>>,
    isChecked: String,
    checkItem: (item: String) -> Unit
) {
    val rowState = rememberLazyListState()
    LazyRow(
        state = rowState,
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(10.dp), content = {
            items(imagesGroup) { imagesType ->
                Row(
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    if (isChecked == imagesType.first) {
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

@Preview(showBackground = true)
@Composable
fun PreviewGalleryPage() {

    Column {
        BottomsRow(
            imagesGroup = listOf(
                Pair("test", 5),
                Pair("test1", 4),
                Pair("test2", 3),
                Pair("test3", 6),
            ),
            isChecked = "test",
            checkItem = {},
            modifier = Modifier
        )

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewImages() {
    ImagesGrid(
        imagesList = FakeData.filmImagesList,
        modifier = Modifier,
        onClickImage = {}
    )
}