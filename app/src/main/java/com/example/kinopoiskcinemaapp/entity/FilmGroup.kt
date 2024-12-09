package com.example.kinopoiskcinemaapp.entity

import com.example.kinopoiskcinemaapp.entity.films.FilmItem

data class FilmGroup(
    val group: GroupsType,
    val listFilms: List<FilmItem>,
    val total: Int
)