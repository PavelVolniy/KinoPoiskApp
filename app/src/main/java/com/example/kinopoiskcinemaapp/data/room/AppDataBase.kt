package com.example.kinopoiskcinemaapp.data.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.kinopoiskcinemaapp.data.room.FilmsDao
import com.example.kinopoiskcinemaapp.domain.dto.CollectionDTO
import com.example.kinopoiskcinemaapp.domain.dto.CollectionFilmCrossRef
import com.example.kinopoiskcinemaapp.domain.dto.FilmDTO

@Database(
    entities = [FilmDTO::class, CollectionDTO::class, CollectionFilmCrossRef::class],
    version = 1
)
abstract class AppDataBase : RoomDatabase() {
    abstract fun filmsDao(): FilmsDao
}