package com.example.kinopoiskcinemaapp.entity.filters

import com.example.kinopoiskcinemaapp.entity.films.Country
import com.example.kinopoiskcinemaapp.entity.films.Genre

data class Filters(
    val countries: List<Country>,
    val genres: List<Genre>
)