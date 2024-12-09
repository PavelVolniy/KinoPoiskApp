package com.example.kinopoiskcinemaapp.entity.similars

import com.example.kinopoiskcinemaapp.entity.films.FilmItem

data class SimilarFilms(
    val items: List<FilmItem>,
    val total: Int
)