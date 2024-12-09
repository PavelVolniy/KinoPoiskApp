package com.example.kinopoiskcinemaapp.entity.mediaposts

import com.example.kinopoiskcinemaapp.entity.Films
import com.example.kinopoiskcinemaapp.entity.films.FilmItem

data class MediaPostsImpl(
    val items: List<FilmItem>,
    val total: Int,
    val totalPages: Int
): Films