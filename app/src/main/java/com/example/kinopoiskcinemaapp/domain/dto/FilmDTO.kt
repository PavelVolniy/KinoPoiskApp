package com.example.kinopoiskcinemaapp.domain.dto

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "films")
data class FilmDTO(
    @PrimaryKey
    val filmId: Int? = null,
    val filmName: String,
    val image: String,
    val genre: String,
    val slogan: String,
    val descriptions: String,
    val countries: String,
    val filmLength: String,
    val ageLimit: String,
    val rating: Double,
    val date: Long
)