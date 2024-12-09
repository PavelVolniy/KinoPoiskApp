package com.example.kinopoiskcinemaapp.presentation.home.listpage

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo
import com.example.kinopoiskcinemaapp.entity.films.FilmItem
import com.example.kinopoiskcinemaapp.presentation.home.filmpage.PagingFilmSource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class ListPageViewModel @Inject constructor(
    private val kinopoiskRepo: KinopoiskRepo,
) : ViewModel() {
    lateinit var collectionsFilms: Flow<PagingData<FilmItem>>
    lateinit var films: Flow<PagingData<FilmItem>>

    fun getFilms(typeRequest: String) {
        try {
            collectionsFilms = Pager(
                config = PagingConfig(pageSize = 5, enablePlaceholders = false),
                pagingSourceFactory = {
                    PagingFilmSource(
                        kinopoiskRepo = kinopoiskRepo,
                        typeRequest = typeRequest
                    )
                }
            ).flow.cachedIn(viewModelScope)
        } catch (e: Exception) {
            Log.e("ListPageVM", e.message.toString())
        }
    }
}