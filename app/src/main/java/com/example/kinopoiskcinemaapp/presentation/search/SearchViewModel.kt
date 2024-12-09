package com.example.kinopoiskcinemaapp.presentation.search

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo
import com.example.kinopoiskcinemaapp.domain.utils.FilmType
import com.example.kinopoiskcinemaapp.domain.utils.Sorting
import com.example.kinopoiskcinemaapp.entity.RequestState
import com.example.kinopoiskcinemaapp.entity.films.Country
import com.example.kinopoiskcinemaapp.entity.films.Genre
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val kinopoiskRepo: KinopoiskRepo
) : ViewModel() {
    private val _filmsList = MutableStateFlow<RequestState>(RequestState.Success(emptyList()))
    val filmList get() = _filmsList.asStateFlow()
    private val _countryListNames = MutableStateFlow<List<Country>>(emptyList())
    val countryListNames get() = _countryListNames.asStateFlow()
    private val _genreList = MutableStateFlow<List<Genre>>(emptyList())
    val genreList get() = _genreList.asStateFlow()

    init {
        viewModelScope.launch {
            try {
                val filters = kinopoiskRepo.getFilters()
                _countryListNames.value = filters.countries
                _genreList.value = filters.genres
            } catch (e: Exception) {
                Log.e("error searchViewModel", e.message.toString())
            }
        }
    }

    fun getFilmsByParams(
        countriesId: Int = 0,
        genresId: Int = 0,
        order: String = Sorting.RATING.toString(),
        type: String = FilmType.FILM.toString(),
        ratingFrom: Int = 0,
        ratingTo: Int = 10,
        yearFrom: Int = 1000,
        yearTo: Int = 3000,
        keyword: String = "",
        page: Int = 1
    ) {
        viewModelScope.launch {
            _filmsList.value = RequestState.Loading
            try {
                _filmsList.value = RequestState.Success(kinopoiskRepo.getFilmsByParams(
                    countriesId = countriesId,
                    genresId = genresId,
                    order = order,
                    type = type,
                    ratingFrom = ratingFrom,
                    ratingTo = ratingTo,
                    yearFrom = yearFrom,
                    yearTo = yearTo,
                    keyword = keyword,
                    page = page
                ).items.filter { it.nameRu != null || it.nameEn != null })
            } catch (e: Exception) {
                Log.e("error searchViewModel", e.message.toString())
                _filmsList.value = RequestState.Error
            }
        }
    }

}