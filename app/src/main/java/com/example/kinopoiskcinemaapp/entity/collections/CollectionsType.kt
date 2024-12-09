package com.example.kinopoiskcinemaapp.entity.collections

import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.entity.GroupsType

enum class CollectionsType(override val nameGroup: Int, override val nameRequest: String) :
    GroupsType {
    TOP_POPULAR_ALL(R.string.top_popular_all_collection_type, "TOP_POPULAR_ALL"),
    TOP_POPULAR_MOVIES(R.string.top_popular_movies_collection_type, "TOP_POPULAR_MOVIES"),
    TOP_250_TV_SHOWS(R.string.top_250_tv_shows_collection_type, "TOP_250_TV_SHOWS"),
    TOP_250_MOVIES(R.string.top_250_movies_collection_type, "TOP_250_MOVIES"),
    VAMPIRE_THEME(R.string.vampire_theme_collection_type, "VAMPIRE_THEME"),
    COMICS_THEME(R.string.comics_theme_collection_type, "COMICS_THEME"),
    CLOSES_RELEASES(R.string.closes_releases_collection_type, "CLOSES_RELEASES"),
    FAMILY(R.string.family_collection_type, "FAMILY"),
    OSKAR_WINNERS_2021(R.string.oskar_winners_2021_collection_type, "OSKAR_WINNERS_2021"),
    LOVE_THEME(R.string.love_theme_collection_type, "LOVE_THEME"),
    ZOMBIE_THEME(R.string.zombie_theme_collection_type, "ZOMBIE_THEME"),
    CATASTROPHE_THEME(R.string.catastrophe_theme_collection_type, "CATASTROPHE_THEME"),
    KIDS_ANIMATION_THEME(R.string.kids_animation_theme_collection_type, "KIDS_ANIMATION_THEME"),
    POPULAR_SERIES(R.string.popular_series_collection_type, "POPULAR_SERIES")
}
