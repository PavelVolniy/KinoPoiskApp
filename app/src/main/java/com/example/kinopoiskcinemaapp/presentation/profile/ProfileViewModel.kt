package com.example.kinopoiskcinemaapp.presentation.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.data.room.RoomRepo
import com.example.kinopoiskcinemaapp.domain.dto.CollectionDTO
import com.example.kinopoiskcinemaapp.domain.dto.CollectionFilmCrossRef
import com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms
import com.example.kinopoiskcinemaapp.domain.dto.FilmDTO
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProfileViewModel @Inject constructor(
    private val roomRepo: RoomRepo
) : ViewModel() {
    private val _collections = MutableStateFlow<List<CollectionWithFilms>>(emptyList())
    val collections = _collections.asStateFlow()
    private val _lookedFilms = MutableStateFlow<List<FilmDTO>>(emptyList())
    val lookedFilms get() = _lookedFilms.asStateFlow()

    fun getCollections() {
        viewModelScope.launch {
            _collections.value = roomRepo.getCollectionWithFilms()
        }
    }

    fun getLast20Films() {
        viewModelScope.launch {
            _lookedFilms.value = roomRepo.getLast20Films()
        }
    }

    fun addNewCollection(collectionName: String) {
        viewModelScope.launch {
            roomRepo.addCollection(CollectionDTO(collectionName.trim(), R.drawable.user_icon, true))
        }
    }

    fun deleteCollectionByName(nameCollection: String) {
        viewModelScope.launch {
            val collectionWithFilms = roomRepo.getCollectionWithFilmsByName(nameCollection)
            collectionWithFilms.films.forEach {
                roomRepo.deleteFilmFromCollection(
                    CollectionFilmCrossRef(
                        collectionWithFilms.collectionDTO.collectionName,
                        it.filmId ?: 0
                    )
                )
            }
            roomRepo.deleteCollection(collectionWithFilms.collectionDTO)
            getCollections()
        }
    }

}