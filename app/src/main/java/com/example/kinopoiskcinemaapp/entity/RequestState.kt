package com.example.kinopoiskcinemaapp.entity

import com.example.kinopoiskcinemaapp.entity.films.FilmItem

sealed class RequestState {
    object Loading : RequestState()
    object Error : RequestState()
    class Success(val list: List<FilmItem>) : RequestState()
}
