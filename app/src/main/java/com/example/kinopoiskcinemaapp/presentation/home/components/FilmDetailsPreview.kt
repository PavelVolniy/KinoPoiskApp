package com.example.kinopoiskcinemaapp.presentation.home.components

import android.content.Intent
import android.net.Uri
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.entity.filmdetails.FilmDetails
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.presentation.home.filmpage.FilmPageViewModel
import com.example.kinopoiskcinemaapp.ui.theme.SmBlueTitleColor
import com.example.kinopoiskcinemaapp.ui.theme.SmLightGrayColor
import com.example.kinopoiskcinemaapp.ui.theme.SmWhiteColor
import kotlin.time.Duration.Companion.minutes
import kotlin.time.DurationUnit

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun FilmDetailsPreview(
    film: FilmDetails,
    viewModel: FilmPageViewModel? = hiltViewModel(),
    addToCollection: () -> Unit
) {
    val collectionList = viewModel?.collections?.collectAsState()?.value
    val viewedCollectionName = stringResource(R.string.viewed_default_name_collection)
    val likeCollectionName = stringResource(R.string.like_default_name_collection)
    val wantToSeeCollectionName = stringResource(R.string.want_to_see_collection_name)

    var isViewed by remember {
        mutableStateOf(
            collectionList
                ?.find { it.collectionDTO.collectionName.contains(viewedCollectionName) }
                ?.films?.map { it.filmId }?.contains(film.kinopoiskId) ?: false

        )
    }
    var isLike by remember {
        mutableStateOf(
            collectionList
                ?.find { it.collectionDTO.collectionName.contains(likeCollectionName) }
                ?.films?.map {
                    it.filmId
                }?.contains(film.kinopoiskId) ?: false
        )
    }
    var isWantToSee by remember {
        mutableStateOf(
            collectionList
                ?.find { it.collectionDTO.collectionName == wantToSeeCollectionName }
                ?.films?.map { it.filmId }?.contains(film.kinopoiskId) ?: false
        )
    }

    Box {
        GlideImage(
            modifier = Modifier.fillMaxWidth()/*.height(300.dp)*/,
            model = painterResource(id = R.drawable.ic_image),
            contentDescription = null
        ) {
            it.load(film.posterUrlPreview ?: film.posterUrl).optionalCenterCrop()
        }

        Column(
            modifier = Modifier.align(Alignment.BottomCenter),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            NameAndRatingText(film.ratingKinopoisk, film.nameRu ?: film.nameEn ?: "")
            YearsAndGenresText(
                film.year,
                film.genres.map { it.genre }.toString().trim('[', ']') ?: ""
            )
            CountryAndLengthAndAgeLimitText(
                countries = film.countries.map { it.country }.toString().trim('[', ']'),
                filmLength = if (film.filmLength != 0) (film.filmLength.minutes.toString(
                    DurationUnit.HOURS,
                    2
                ))
                else "",
                ageLimits = if (film.ratingAgeLimits != null) {
                    film.ratingAgeLimits.let { Regex("[0-9]+").find(it)?.value.toString() }
                } else ""
            )
            Spacer(modifier = Modifier.height(10.dp))
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .background(SmLightGrayColor)
                    .fillMaxWidth()
            ) {
                FavoriteButton(
                    isLike = isLike,
                    onClick = {
                        moveFilmToCollection(isLike, viewModel, likeCollectionName)
                        isLike = !isLike
                    })
                WantToSeeButton(
                    isWantToSee = isWantToSee,
                    onClick = {
                        moveFilmToCollection(isWantToSee, viewModel, wantToSeeCollectionName)
                        isWantToSee = !isWantToSee
                    }
                )
                ViewedButton(isViewed = isViewed,
                    onClick = {
                        moveFilmToCollection(isViewed, viewModel, viewedCollectionName)
                        isViewed = !isViewed
                    })
                val mContext = LocalContext.current
                val intent: Intent = remember {
                    Intent(Intent.ACTION_VIEW, Uri.parse(film.webUrl))
                }
                SharedButton(onClick = {
                    mContext.startActivity(intent)
                })
                CollectionButton(onClick = { addToCollection() })
            }


        }
    }

}

private fun moveFilmToCollection(
    isLike: Boolean,
    viewModel: FilmPageViewModel?,
    likeCollectionName: String
) {
    if (isLike) {
        viewModel?.dellFilmFromCollection(likeCollectionName)
    } else {
        viewModel?.addFilmToCollection(likeCollectionName)
    }
}

@Composable
private fun CollectionButton(onClick: () -> Unit) {
    TextButton(onClick = { onClick() }) {
        Icon(
            painter = painterResource(R.drawable.icons3dot), contentDescription = null,
            tint = SmWhiteColor
        )
    }
}

@Composable
private fun SharedButton(onClick: () -> Unit) {
    TextButton(onClick = { onClick() }) {
        Icon(
            painter = painterResource(id = R.drawable.icon), contentDescription = null,
            tint = SmWhiteColor
        )
    }
}

@Composable
private fun FavoriteButton(onClick: () -> Unit, isLike: Boolean) {
    TextButton(onClick = { onClick() }) {
        Icon(
            painter = painterResource(R.drawable.heart),
            tint = if (isLike) SmBlueTitleColor else SmWhiteColor,
            contentDescription = null
        )
    }
}

@Composable
private fun WantToSeeButton(onClick: () -> Unit, isWantToSee: Boolean) {
    TextButton(onClick = { onClick() }) {
        Icon(
            painter = painterResource(id = R.drawable.frame_7299),
            tint = if (isWantToSee) SmBlueTitleColor else SmWhiteColor,
            contentDescription = null
        )
    }
}

@Composable
private fun ViewedButton(onClick: () -> Unit, isViewed: Boolean) {
    TextButton(onClick = { onClick() }) {
        Icon(
            painter = painterResource(
                id = if (isViewed) R.drawable.viewed
                else R.drawable.not_viewed
            ),
            contentDescription = null,
            tint = if (isViewed) SmBlueTitleColor else SmWhiteColor
        )
    }
}

@Composable
private fun CountryAndLengthAndAgeLimitText(
    countries: String,
    filmLength: String,
    ageLimits: String
) {
    Text(
        text = "$countries, $filmLength, ${
            if (ageLimits.isNotEmpty()) "$ageLimits+"
            else ""
        }",
        style = TextStyle(Color.Gray)
    )
}

@Composable
private fun YearsAndGenresText(
    year: Int,
    genres: String
) {
    Text(
        text = "$year, $genres",
        style = TextStyle(Color.Gray)
    )
}

@Composable
private fun NameAndRatingText(
    rating: Double,
    nameFilm: String,

    ) {
    Text(
        text = "$rating $nameFilm", style = TextStyle(Color.Gray)
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewFilmDetails() {
    val film = FakeData.filmDetails
    FilmDetailsPreview(
        film = film,
        addToCollection = {},
        viewModel = null
    )
}