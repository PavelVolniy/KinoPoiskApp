package com.example.kinopoiskcinemaapp.entity.films

import com.example.kinopoiskcinemaapp.entity.Films

data class FilmsImpl(
    val items: List<FilmItem>,
    val total: Int,
    val totalPages: Int
): Films