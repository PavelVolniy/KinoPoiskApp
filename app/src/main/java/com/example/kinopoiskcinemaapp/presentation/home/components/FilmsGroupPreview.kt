package com.example.kinopoiskcinemaapp.presentation.home.components

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowForward
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.entity.films.FilmItem
import com.example.kinopoiskcinemaapp.ui.theme.MyTextStyle
import com.example.kinopoiskcinemaapp.ui.theme.SmBlueTitleColor
import com.example.kinopoiskcinemaapp.ui.theme.SmLightGrayColor

@Composable
fun FilmsGroupPreview(
    nameGroup: String,
    filmList: List<FilmItem>,
    total: Int,
    viewedFilmId: List<Int>,
    clickableText: String,
    onclickItem: (filmItem: Int) -> Unit,
    onClickGroup: () -> Unit,
    modifier: Modifier
) {
    var clickableInt = 0
    try {
        clickableInt = clickableText.toInt()
    } catch (e: Exception) {
        Log.d("FilmsGroupPreview", e.message.toString())
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(end = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            FilmGroupNameText(nameGroup)
            Row(verticalAlignment = Alignment.CenterVertically) {
                if (total > 20) {
                    ClickableText(
                        text = AnnotatedString(clickableText),
                        style = TextStyle(color = SmBlueTitleColor, fontSize = 16.sp),
                        onClick = { onClickGroup() }
                    )
                }
                if (clickableInt != 0) Icon(
                    imageVector = Icons.AutoMirrored.Default.KeyboardArrowRight,
                    contentDescription = null,
                    tint = SmBlueTitleColor
                )
            }
        }
        LazyRow(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(15.dp),
            modifier = modifier,
            content = {
                items(filmList) { filmItem ->
                    FilmItemPreview(
                        item = filmItem,
                        onClickItem = {
                            onclickItem(
                                if (filmItem.kinopoiskId != 0) filmItem.kinopoiskId
                                else filmItem.filmId
                            )
                        },
                        isViewed = viewedFilmId.contains(filmItem.kinopoiskId ?: filmItem.filmId)
                    )
                }
                if (filmList.size > 10) item { ShowAllButton { onClickGroup() } }
            })
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

@Preview(showBackground = true)
@Composable
private fun PreviewShowAllButton() {
    ShowAllButton { }
}


@Composable
private fun FilmGroupNameText(nameGroup: String) {
    Text(
        text = nameGroup,
        style = MyTextStyle.bodyLarge
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewFilmsGroup() {
    val list = FakeData.filmItemList
    FilmsGroupPreview(
        nameGroup = "Premieres",
        filmList = list,
        viewedFilmId = listOf(0),
        clickableText = stringResource(R.string.all_clickable_text),
        onclickItem = {},
        onClickGroup = {},
        modifier = Modifier,
        total = 20
    )
}