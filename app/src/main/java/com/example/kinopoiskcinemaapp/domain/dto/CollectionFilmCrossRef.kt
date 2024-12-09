package com.example.kinopoiskcinemaapp.domain.dto

import androidx.room.Entity

@Entity(primaryKeys = ["collectionName", "filmId"])
data class CollectionFilmCrossRef(
    val collectionName: String,
    val filmId: Int
)