package com.example.kinopoiskcinemaapp.domain.utils

import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.entity.GroupsType

enum class FilmType(override val nameGroup: Int, override val nameRequest: String) : GroupsType {
    FILM(R.string.films_film_type, "FILM"),
    TV_SHOW(R.string.tv_shows_film_type, "TV_SHOW"),
    TV_SERIES(R.string.tv_series_film_type, "TV_SERIES"),
    MINI_SERIES(R.string.mini_series_film_type, "MINI_SERIES"),
    ALL(R.string.all_film_type, "ALL"),
    PREMIERES(R.string.premieres_film_type, "PREMIERES"),
    TEST(R.string.test_film_type, "TEST")
}


