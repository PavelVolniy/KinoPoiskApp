package com.example.kinopoiskcinemaapp.domain.dto

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation


data class CollectionWithFilms(
    @Embedded val collectionDTO: CollectionDTO,
    @Relation(
        parentColumn = "collectionName",
        entityColumn = "filmId",
        associateBy = Junction(CollectionFilmCrossRef::class)
    )
    val films: List<FilmDTO>
)