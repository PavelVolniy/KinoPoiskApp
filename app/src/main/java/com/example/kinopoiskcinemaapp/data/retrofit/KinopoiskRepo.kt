package com.example.kinopoiskcinemaapp.data.retrofit

import android.icu.util.Calendar
import com.example.kinopoiskcinemaapp.domain.utils.FilmType
import com.example.kinopoiskcinemaapp.domain.utils.ImageType
import com.example.kinopoiskcinemaapp.domain.utils.Sorting
import com.example.kinopoiskcinemaapp.entity.films.FilmsImpl
import java.text.SimpleDateFormat
import java.util.Locale
import javax.inject.Inject

class KinopoiskRepo @Inject constructor(
    private val api: KPApi
) {
    private val calendar: Calendar = Calendar.getInstance()

    suspend fun getPremieres() = api.getPremieres(
        calendar.get(Calendar.YEAR),
        SimpleDateFormat("MMMM", Locale.US).format(calendar.time)
    )


    suspend fun getFilmStaff(id: Int) = api.getStaffByFilmId(id)

    suspend fun getSeasons(id: Int) = api.getSeasons(id)

    suspend fun getActorByStaffId(id: Int) = api.getActorById(id)

    suspend fun getImagesByFilmId(
        id: Int,
        imageType: ImageType = ImageType.STILL,
        page: Int = 1
    ) = api.getImagesByFilmId(id, imageType.name, page)

    suspend fun getSimilarFilms(id: Int) = api.getSimilarFilms(id)

    suspend fun getFilmDetailsById(id: Int) = api.getFilmById(id)

    suspend fun getCollections(type: String, page: Int) =
        api.getCollections(type, page)

    suspend fun getFilters() = api.getFilters()

    suspend fun getFilmsByParams(
        countriesId: Int = 0,
        genresId: Int = 0,
        order: String = Sorting.RATING.toString(),
        type: String = FilmType.FILM.toString(),
        ratingFrom: Int = 0,
        ratingTo: Int = 10,
        yearFrom: Int = 1000,
        yearTo: Int = 3000,
//        imdbId: String,
        keyword: String = "",
        page: Int = 1
    ): FilmsImpl {
        return api.getFilmsByParams(
            countriesId = if (countriesId == 0) null else countriesId,
            genresId = if (genresId == 0) null else genresId,
            order = order.ifEmpty { null },
            type = type.ifEmpty { null },
            ratingFrom = if (ratingFrom < 0 || ratingFrom > 10) 0 else ratingFrom,
            ratingTo = if (ratingTo < 1) null else ratingTo,
            yearFrom = if (yearFrom < 1000 || yearFrom > 3000) 1000 else yearFrom,
            yearTo = if (yearTo > 3000 || yearTo < 1000) 3000 else yearTo,
//            imdbId = imdbId.ifEmpty { "" },
            keyword = keyword.ifEmpty { null },
            page = if (page < 0) 1 else page
        )
    }
}