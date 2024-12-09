package com.example.kinopoiskcinemaapp.presentation.profile

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kinopoiskcinemaapp.data.room.RoomRepo
import com.example.kinopoiskcinemaapp.domain.dto.FilmDTO
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class CollectionListViewModel @Inject constructor(
    private val roomRepo: RoomRepo
) : ViewModel() {
    private val _collectionList = MutableStateFlow<List<FilmDTO>>(emptyList())
    val collectionList get() = _collectionList.asStateFlow()

    fun getCollection(collectionName: String) {
        viewModelScope.launch {
            _collectionList.value = roomRepo.getCollectionWithFilmsByName(collectionName).films
        }
    }
}