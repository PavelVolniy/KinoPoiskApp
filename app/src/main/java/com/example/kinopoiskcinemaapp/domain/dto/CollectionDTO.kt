package com.example.kinopoiskcinemaapp.domain.dto

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "collection_films")
data class CollectionDTO(
    @PrimaryKey
    val collectionName: String,
    val icon: Int,
    val closable: Boolean
)