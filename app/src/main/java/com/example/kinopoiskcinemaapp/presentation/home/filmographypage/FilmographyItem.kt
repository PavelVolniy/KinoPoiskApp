package com.example.kinopoiskcinemaapp.presentation.home.filmographypage

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.entity.films.FilmItem

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun FilmographyItem(filmItem: FilmItem) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Card {
            Box(
                modifier = Modifier
                    .size(150.dp, 200.dp)
                    .background(Color.Gray)
            ) {
                GlideImage(model = R.drawable.ic_default_frame, contentDescription = null) {
                    it.load(filmItem.posterUrlPreview).centerCrop()
                }

                Surface(
                    modifier = Modifier
                        .align(Alignment.TopStart)
                        .padding(5.dp),
                    color = MaterialTheme.colorScheme.inversePrimary,
                    shape = RoundedCornerShape(15.dp),
                    shadowElevation = 4.dp
                ) {
                    RatingText(filmItem.ratingKinopoisk.toString())
                }
            }
        }
        Spacer(modifier = Modifier.width(20.dp))
        Column(
            verticalArrangement = Arrangement.Center
        ) {
            NameFilmItemText(filmItem.nameRu)
            YearsAndGenreText(filmItem)
        }
    }
}

@Composable
private fun YearsAndGenreText(filmItem: FilmItem) {
    Text(
        text = "${filmItem.year}, ${
            filmItem.genres.map { it.genre }.toString().trim('[', ']')
        }",
        style = TextStyle(color = Color.Gray, fontSize = 12.sp)
    )
}

@Composable
private fun NameFilmItemText(name: String) {
    Text(
        text = name,
        style = TextStyle(color = Color.Black, fontSize = 15.sp)
    )
}

@Composable
private fun RatingText(text: String) {
    Text(
        text = text,
        modifier = Modifier.padding(5.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewFilmographyItem() {
    FilmographyItem(FakeData.filmItem)
}