package com.example.kinopoiskcinemaapp.entity.collections

import com.example.kinopoiskcinemaapp.entity.Films
import com.example.kinopoiskcinemaapp.entity.films.FilmItem

data class CollectionsImpl(
    val items: List<FilmItem>,
    val total: Int,
    val totalPages: Int
): Films