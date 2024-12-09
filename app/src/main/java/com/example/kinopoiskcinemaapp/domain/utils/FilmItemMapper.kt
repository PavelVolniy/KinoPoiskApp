package com.example.kinopoiskcinemaapp.domain.utils

import com.example.kinopoiskcinemaapp.domain.dto.FilmDTO
import com.example.kinopoiskcinemaapp.entity.filmdetails.FilmDetails
import kotlin.time.Duration.Companion.minutes
import kotlin.time.DurationUnit

object FilmItemMapper {
    fun mapFilmItemToFilmDTO(filmItem: FilmDetails) = FilmDTO(
        filmId = filmItem.kinopoiskId ?: 0,
        filmName = filmItem.nameRu ?: filmItem.nameEn ?: "",
        image = filmItem.posterUrlPreview ?: filmItem.posterUrl ?: "",
        genre = filmItem.genres.map { it.genre }.toString().trim('[', ']'),
        descriptions = filmItem.description ?: "",
        countries = filmItem.countries.map { it.country }.toString().trim('[', ']'),
        rating = filmItem.ratingKinopoisk ?: filmItem.ratingImdb ?: 0.0,
        date = System.currentTimeMillis(),
        slogan = filmItem.slogan?:"",
        filmLength = if (filmItem.filmLength != 0) (filmItem.filmLength.minutes.toString(
            DurationUnit.HOURS,
            2
        ))
        else "",
        ageLimit = if (filmItem.ratingAgeLimits != null) {
            filmItem.ratingAgeLimits.let { Regex("[0-9]+").find(it)?.value.toString() }
        } else ""
    )
}