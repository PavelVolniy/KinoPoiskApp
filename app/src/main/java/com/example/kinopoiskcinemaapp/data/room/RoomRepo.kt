package com.example.kinopoiskcinemaapp.data.room

import com.example.kinopoiskcinemaapp.domain.dto.CollectionDTO
import com.example.kinopoiskcinemaapp.domain.dto.CollectionFilmCrossRef
import com.example.kinopoiskcinemaapp.domain.dto.FilmDTO
import javax.inject.Inject

class RoomRepo @Inject constructor(
    private val filmsDao: FilmsDao
) {
    suspend fun getAllFilms() = filmsDao.getAllFilms()

    suspend fun addFilmToDB(filmDTO: FilmDTO) = filmsDao.addFilm(filmDTO)

    suspend fun getLast20Films() = filmsDao.getLast20Films()

    suspend fun addCollection(collection: CollectionDTO) = filmsDao.addCollection(collection)

    suspend fun addCollectionWithCrossRef(collectionFilmCrossRef: CollectionFilmCrossRef) =
        filmsDao.addCollectionWithFilmCrossRef(collectionFilmCrossRef)

    suspend fun deleteFilmFromCollection(collectionFilmCrossRef: CollectionFilmCrossRef) =
        filmsDao.deleteFilmFromCollection(collectionFilmCrossRef)

    suspend fun getCollectionWithFilms() = filmsDao.getCollectionWithFilms()

    suspend fun getCollectionWithFilmsByName(name: String) =
        filmsDao.getCollectionWithFilmsByName(name)

    suspend fun deleteCollection(collection: CollectionDTO) = filmsDao.deleteCollection(collection)
}