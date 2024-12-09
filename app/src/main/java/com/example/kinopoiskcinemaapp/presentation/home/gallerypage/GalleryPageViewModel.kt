package com.example.kinopoiskcinemaapp.presentation.home.gallerypage

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo
import com.example.kinopoiskcinemaapp.domain.utils.ImageType
import com.example.kinopoiskcinemaapp.entity.images.FilmImages
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class GalleryPageViewModel @Inject constructor(
    private val repo: KinopoiskRepo
) : ViewModel() {
    private val _images = MutableStateFlow<Map<String, FilmImages>>(emptyMap())
    val images get() = _images.asStateFlow()

    fun getImagesById(filmId: Int) {
        viewModelScope.launch {
            try {
                val map = mutableMapOf<String, FilmImages>()
                ImageType.values().map {
                    map.put(it.name, repo.getImagesByFilmId(id = filmId, imageType = it))
                }

                _images.value = map
            } catch (e: Exception) {
                Log.e("GalleryPageViewModel", e.message.toString())
            }
        }
    }
}