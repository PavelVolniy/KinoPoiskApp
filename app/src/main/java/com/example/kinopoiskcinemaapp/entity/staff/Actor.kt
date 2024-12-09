package com.example.kinopoiskcinemaapp.entity.staff

import com.example.kinopoiskcinemaapp.entity.films.FilmItem

data class Actor(
    val age: Int,
    val birthday: String,
    val birthplace: String,
    val death: String,
    val deathplace: String,
    val facts: List<String>,
    val films: List<FilmItem>,
    val growth: String,
    val hasAwards: Int,
    val nameEn: String,
    val nameRu: String,
    val personId: Int,
    val posterUrl: String,
    val profession: String,
    val sex: String,
    val spouses: List<Spouse>,
    val webUrl: String
)