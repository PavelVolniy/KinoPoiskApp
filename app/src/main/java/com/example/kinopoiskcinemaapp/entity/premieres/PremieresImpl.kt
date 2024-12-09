package com.example.kinopoiskcinemaapp.entity.premieres

import com.example.kinopoiskcinemaapp.entity.Films
import com.example.kinopoiskcinemaapp.entity.films.FilmItem

data class PremieresImpl(
    val items: List<FilmItem>,
    val total: Int
): Films