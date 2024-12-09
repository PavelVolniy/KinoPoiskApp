package com.example.kinopoiskcinemaapp.entity.awards

data class ItemAward(
    val imageUrl: String,
    val name: String,
    val nominationName: String,
    val persons: List<PersonAward>,
    val win: Boolean,
    val year: Int
)