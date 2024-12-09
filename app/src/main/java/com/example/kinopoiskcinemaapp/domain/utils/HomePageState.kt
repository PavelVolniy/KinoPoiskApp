package com.example.kinopoiskcinemaapp.domain.utils

sealed class HomePageState(val route: String) {
    object StartPage : HomePageState("StartPage")
    object HomePage : HomePageState("HomePage")
    object ListPage : HomePageState("ListPage")
    object FilmPage : HomePageState("FilmPage")
    object ActorPage : HomePageState("ActorPage")
    object GalleryPage : HomePageState("GalleryPage")
    object FilmographyPage : HomePageState("FilmographyPage")
    object SeasonPage: HomePageState("SeasonPage")
}
