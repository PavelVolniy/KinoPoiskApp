package com.example.kinopoiskcinemaapp.data.retrofit

import com.example.kinopoiskcinemaapp.entity.filmdetails.FilmDetails
import com.example.kinopoiskcinemaapp.entity.films.FilmsImpl
import com.example.kinopoiskcinemaapp.entity.filters.Filters
import com.example.kinopoiskcinemaapp.entity.images.FilmImages
import com.example.kinopoiskcinemaapp.entity.season.SeasonFilm
import com.example.kinopoiskcinemaapp.entity.similars.SimilarFilms
import com.example.kinopoiskcinemaapp.entity.staff.Actor
import com.example.kinopoiskcinemaapp.entity.staff.Staff
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query
import javax.inject.Singleton

@Singleton
interface KPApi {

    @GET("/api/v2.2/films/premieres")
    suspend fun getPremieres(@Query("year") year: Int, @Query("month") month: String): FilmsImpl

    @GET("/api/v2.2/films/collections")
    suspend fun getCollections(@Query("type") type: String, @Query("page") page: Int): FilmsImpl

    @GET("/api/v2.2/films/filters")
    suspend fun getFilters(): Filters

    @GET("/api/v2.2/films")
    suspend fun getFilmsByParams(
        @Query("countries") countriesId: Int?,
        @Query("genres") genresId: Int?,
        @Query("order") order: String?,
        @Query("type") type: String?,
        @Query("ratingFrom") ratingFrom: Int,
        @Query("ratingTo") ratingTo: Int?,
        @Query("yearFrom") yearFrom: Int,
        @Query("yearTo") yearTo: Int,
//        @Query("imdbId") imdbId: String,
        @Query("keyword") keyword: String?,
        @Query("page") page: Int?,
    ): FilmsImpl

    @GET("/api/v2.2/films/{id}")
    suspend fun getFilmById(@Path("id") id: Int): FilmDetails

    @GET("/api/v1/staff")
    suspend fun getStaffByFilmId(@Query("filmId") id: Int): Staff

    @GET("/api/v1/staff/{id}")
    suspend fun getActorById(@Path("id") id: Int): Actor

    @GET("/api/v2.2/films/{id}/images")
    suspend fun getImagesByFilmId(
        @Path("id") id: Int,
        @Query("type") type: String,
        @Query("page") page: Int
    ): FilmImages

    @GET("/api/v2.2/films/{id}/similars")
    suspend fun getSimilarFilms(@Path("id") id: Int): SimilarFilms

    @GET("/api/v2.2/films/{id}/seasons")
    suspend fun getSeasons(@Path("id") id: Int): SeasonFilm
}
