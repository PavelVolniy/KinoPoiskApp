package com.example.kinopoiskcinemaapp.domain.utils

import com.example.kinopoiskcinemaapp.entity.FilmGroup

sealed class HomePageRequestState {
    object Loading : HomePageRequestState()
    class Error(val message: String) : HomePageRequestState()
    class Success(val listGroup: List<FilmGroup>) : HomePageRequestState()
}