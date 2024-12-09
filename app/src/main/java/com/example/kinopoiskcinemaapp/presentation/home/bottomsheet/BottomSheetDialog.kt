package com.example.kinopoiskcinemaapp.presentation.home.bottomsheet

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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.BasicAlertDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.domain.dto.CollectionDTO
import com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms
import com.example.kinopoiskcinemaapp.entity.filmdetails.FilmDetails
import com.example.kinopoiskcinemaapp.ui.theme.SmGrayColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetDialog(
    roundedCorner: Int = 20,
    filmItem: FilmDetails,
    isClose: () -> Unit,
    addToCollection: (nameColl: String) -> Unit,
    deleteFromCollection: (nameColl: String) -> Unit,
    addNewCollection: (nameColl: String) -> Unit,
    listCollections: List<CollectionWithFilms>
) {
    var isShowDialog by remember { mutableStateOf(false) }
    var newCollectionNameToBD by remember { mutableStateOf("") }
    Surface(
        shape = RoundedCornerShape(
            topStart = roundedCorner.dp,
            topEnd = roundedCorner.dp
        ),
        color = Color.White
    ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = roundedCorner.dp)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = roundedCorner.dp, end = roundedCorner.dp)
            ) {
                CloseButton(isClose)
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = roundedCorner.dp, end = roundedCorner.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                ImageFilm(
                    rating = filmItem.ratingKinopoisk.toString(),
                    image = filmItem.posterUrlPreview
                )
                Spacer(modifier = Modifier.width(15.dp))
                FilmDescription(
                    filmItem.nameRu ?: filmItem.nameEn ?: "",
                    "${filmItem.year}, ${
                        filmItem.genres.map { it.genre }.toString().trim('[', ']')
                    }"
                )
            }
            Spacer(modifier = Modifier.height(20.dp))
            HorizontalDivider(thickness = 1.dp, color = SmGrayColor)
            AddCollectionRow(stringResource(R.string.add_to_collection_title_dialog))
            HorizontalDivider(thickness = 1.dp, color = SmGrayColor)
            LazyColumn {
                items(listCollections) { collectionItem ->
                    Row(horizontalArrangement = Arrangement.Center) {
                        var checkedState by remember {
                            mutableStateOf(
                                collectionItem.films.find { it.filmId == filmItem.kinopoiskId } != null
                            )
                        }
                        if (collectionItem.collectionDTO.collectionName == newCollectionNameToBD) {
                            checkedState = true
                            addToCollection(collectionItem.collectionDTO.collectionName)
                            newCollectionNameToBD = ""
                        }
                        CollectionRowCheckBox(
                            text = collectionItem.collectionDTO.collectionName,
                            count = collectionItem.films.size.toString(),
                            onCheckedChange = {
                                if (!checkedState) addToCollection(collectionItem.collectionDTO.collectionName)
                                else deleteFromCollection(collectionItem.collectionDTO.collectionName)
                                checkedState = !it
                            },
                            isChecked = checkedState
                        )
                    }
                    HorizontalDivider(thickness = 1.dp, color = SmGrayColor)
                }

                item {
                    CollectionRowCheckBox(
                        icon = Icons.Default.Add,
                        text = stringResource(R.string.create_new_collection_button),
                        onCheckedChange = {
                            isShowDialog = true
                        })
                    HorizontalDivider(thickness = 1.dp, color = SmGrayColor)
                }
            }
            Spacer(modifier = Modifier.height(50.dp))
        }
        if (isShowDialog) {
            BasicAlertDialog(onDismissRequest = { isShowDialog = false }) {
                CollectionNameDialog(
                    isClose = {
                        isShowDialog = false
                    },
                    isSuccess = {
                        addNewCollection(it)
                        newCollectionNameToBD = it
                        isShowDialog = false
                    }
                )
            }
        }
    }
}

@Composable
private fun CollectionRowCheckBox(
    isChecked: Boolean? = null,
    icon: ImageVector? = null,
    text: String,
    count: String = "",
    onCheckedChange: ((Boolean) -> Unit)? = null
) {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 40.dp, end = 20.dp, top = 5.dp, bottom = 5.dp)
            .clickable {
                onCheckedChange?.let { it(isChecked == true) }
            },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            if (icon != null) {
                Surface(
                    modifier = Modifier.padding(start = 10.dp, end = 10.dp)
                ) {
                    Icon(
                        imageVector = icon,
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                }
            } else {
                if (isChecked == false) {
                    Icon(
                        painterResource(R.drawable.frame_7373),
                        contentDescription = null
                    )
                } else {
                    Box {
                        Icon(
                            painterResource(R.drawable.frame_7373),
                            contentDescription = null,
                            modifier = Modifier.align(Alignment.Center)
                        )
                        Icon(
                            imageVector = Icons.Default.Check,
                            contentDescription = null,
                            modifier = Modifier
                                .align(Alignment.Center)
                                .size(15.dp)
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.width(20.dp))
            Text(
                text = text,
                style = TextStyle(fontSize = 22.sp)
            )
        }
        Spacer(modifier = Modifier.width(40.dp))
        Text(
            text = count,
            style = TextStyle(fontSize = 22.sp)
        )
    }
}

@Composable
private fun AddCollectionRow(text: String) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceAround,
        modifier = Modifier
            .fillMaxWidth(0.7f)
            .padding(top = 5.dp, bottom = 5.dp)
    ) {
        Icon(painter = painterResource(id = R.drawable.icons), contentDescription = null)
        Text(
            text = text,
            style = TextStyle(fontSize = 22.sp)
        )
    }
}

@Composable
private fun FilmDescription(nameFilm: String, yearAndGenre: String) {
    Column(verticalArrangement = Arrangement.Center) {
        Text(
            text = nameFilm,
            style = TextStyle(fontSize = 16.sp, fontWeight = FontWeight.Bold)
        )
        Text(
            text = yearAndGenre,
            color = Color.Gray
        )
    }
}

@Composable
@OptIn(ExperimentalGlideComposeApi::class)
private fun ImageFilm(rating: String, image: String) {
    Surface(
        shape = RoundedCornerShape(10.dp),
        color = Color.Gray
    ) {
        Box(
            modifier = Modifier
        ) {
            GlideImage(
                model = painterResource(id = R.drawable.ic_image),
                contentDescription = null
            ) { it.load(image) }
            Surface(shape = RoundedCornerShape(10.dp)) {
                Text(
                    text = rating,
                    modifier = Modifier.padding(5.dp),
                    style = TextStyle(fontSize = 12.sp)
                )
            }
        }
    }
}

@Composable
private fun CloseButton(isClose: () -> Unit) {
    IconButton(
        onClick = { isClose() }) {
        Icon(
            modifier = Modifier.size(15.dp),
            imageVector = Icons.Default.Close,
            contentDescription = null
        )
    }
}

@Preview
@Composable
fun PreviewBottomSheetDialog() {
    BottomSheetDialog(isClose = {},
        filmItem = FakeData.filmDetails,
        listCollections = listOf(
            CollectionWithFilms(CollectionDTO("Like", 0, false), emptyList()),
            CollectionWithFilms(CollectionDTO("Want to see", 0, false), emptyList()),
            CollectionWithFilms(CollectionDTO("TEst", 0, true), emptyList())
        ),
        addToCollection = {},
        addNewCollection = {},
        deleteFromCollection = {})
}