package com.example.kinopoiskcinemaapp.presentation.home.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.entity.films.FilmItem

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun FilmItemPreview(item: FilmItem, onClickItem: (id: Int) -> Unit, isViewed: Boolean) {
    Card(onClick = { onClickItem(item.kinopoiskId) }) {
        Column() {
            Box() {
                GlideImage(
                    model = painterResource(R.drawable.ic_image),
                    contentDescription = null,
                    modifier = Modifier.size(180.dp, 220.dp)
                ) {
                    it.load(item.posterUrl ?: item.posterUrlPreview).centerCrop()
                }
                if (item.ratingKinopoisk != null && item.ratingKinopoisk > 0.0) {
                    Surface(
                        modifier = Modifier
                            .align(Alignment.TopEnd)
                            .padding(5.dp),
                        color = MaterialTheme.colorScheme.inversePrimary,
                        shape = RoundedCornerShape(15.dp),
                        shadowElevation = 4.dp
                    ) {
                        RatingText(item.ratingKinopoisk.toString() ?: "")
                    }
                }
                if (isViewed) {
                    Icon(
                        painter = painterResource(R.drawable.viewed),
                        contentDescription = null,
                        modifier = Modifier
                            .align(Alignment.BottomEnd)
                            .padding(5.dp)
                    )
                }
            }
            Spacer(modifier = Modifier.height(10.dp))
            Row(modifier = Modifier.padding(start = 5.dp, end = 5.dp)) {
                FilmItemNameText(item)
            }
            Row(modifier = Modifier.padding(start = 5.dp, end = 5.dp, bottom = 5.dp)) {
                val genresList =
                    if (item.genres != null) item.genres.map { it.genre } else emptyList()
                FilmGenreText(genresList)
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
            .padding(start = 5.dp, end = 5.dp),
        style = MaterialTheme.typography.titleSmall
    )
}

@Composable
private fun FilmGenreText(map: List<String>) {
    Text(
        text = map.toString().trim('[', ']'),
        style = TextStyle(color = Color.Gray),
        modifier = Modifier.requiredWidth(170.dp)
    )
}

@Composable
private fun FilmItemNameText(item: FilmItem) {
    Text(
        text = if (item.nameRu.isNullOrEmpty()) {
            if (!item.nameEn.isNullOrEmpty()) item.nameEn else ""
        } else item.nameRu,
        modifier = Modifier.requiredWidth(170.dp)
    )
}

@Preview()
@Composable
fun PreviewFilmItem() {
    val item = FakeData.filmItem
    FilmItemPreview(item = item, onClickItem = {}, isViewed = true)
}
