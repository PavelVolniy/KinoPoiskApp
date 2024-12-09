package com.example.kinopoiskcinemaapp.data.room

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Transaction
import com.example.kinopoiskcinemaapp.domain.dto.CollectionDTO
import com.example.kinopoiskcinemaapp.domain.dto.CollectionFilmCrossRef
import com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms
import com.example.kinopoiskcinemaapp.domain.dto.FilmDTO

@Dao
interface FilmsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addFilm(filmItem: FilmDTO)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun addCollection(collectionDTO: CollectionDTO)

    @Transaction
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addCollectionWithFilmCrossRef(collectionFilmCrossRef: CollectionFilmCrossRef)

    @Transaction
    @Query("SELECT * FROM films ORDER BY date DESC LIMIT 20")
    suspend fun getLast20Films(): List<FilmDTO>

    @Transaction
    @Query("SELECT * FROM films ORDER BY date DESC")
    suspend fun getAllFilms(): List<FilmDTO>

    @Transaction
    @Query("SELECT * FROM collection_films")
    suspend fun getCollectionWithFilms(): List<CollectionWithFilms>

    @Query("SELECT * FROM collection_films WHERE collectionName= :name LIMIT 1")
    suspend fun getCollectionWithFilmsByName(name: String): CollectionWithFilms

    @Query("SELECT count(*) FROM films")
    suspend fun getCountFilms(): Int

    @Delete
    suspend fun deleteFilmFromCollection(collectionFilmCrossRef: CollectionFilmCrossRef)

    @Delete
    suspend fun deleteReport(filmDTO: FilmDTO)

    @Delete
    suspend fun deleteCollection(collectionDTO: CollectionDTO)

}