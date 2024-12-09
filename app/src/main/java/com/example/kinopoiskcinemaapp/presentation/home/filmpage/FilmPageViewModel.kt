package com.example.kinopoiskcinemaapp.presentation.home.filmpage

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo
import com.example.kinopoiskcinemaapp.data.room.RoomRepo
import com.example.kinopoiskcinemaapp.domain.dto.CollectionDTO
import com.example.kinopoiskcinemaapp.domain.dto.CollectionFilmCrossRef
import com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms
import com.example.kinopoiskcinemaapp.domain.utils.FilmItemMapper
import com.example.kinopoiskcinemaapp.entity.filmdetails.FilmDetails
import com.example.kinopoiskcinemaapp.entity.films.FilmItem
import com.example.kinopoiskcinemaapp.entity.images.FilmImages
import com.example.kinopoiskcinemaapp.entity.staff.StaffItem
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FilmPageViewModel @Inject constructor(
    private val kinopoiskRepo: KinopoiskRepo,
    private val roomRepo: RoomRepo,
    @ApplicationContext private val context: Context
) : ViewModel() {
    private var _filmDetails = MutableStateFlow<FilmDetails?>(null)
    val filmDetails get() = _filmDetails.asStateFlow()
    private var _staffByFilm = MutableStateFlow<List<StaffItem>?>(emptyList())
    val staffByFilm get() = _staffByFilm.asStateFlow()
    private var _images = MutableStateFlow<FilmImages?>(null)
    val images get() = _images.asStateFlow()
    private var _similarFilms = MutableStateFlow<List<FilmItem>>(emptyList())
    val similarFilms get() = _similarFilms.asStateFlow()
    private var _collections = MutableStateFlow<List<CollectionWithFilms>>(emptyList())
    val collections get() = _collections.asStateFlow()

    init {
        getCollections()
    }

    fun getFilmDetails(id: Int) {
        viewModelScope.launch {
            try {
                getFilmDetailsById(id)
                getStaffByFilmId(id)
                getImages(id)
                getSimilarFilms(id)
                addFilmToCollection(context.getString(R.string.looked_title_profil_page))
            } catch (e: Exception) {
                showErrorToLog(e)
                _filmDetails.value = FakeData.filmDetails
            }
        }
    }

    fun addNewCollection(nameCollection: String, icon: Int = R.drawable.user_icon) {
        viewModelScope.launch {
            roomRepo.addCollection(
                CollectionDTO(
                    collectionName = nameCollection.trim(),
                    icon = icon,
                    closable = true
                )
            )
            getCollections()
        }
    }

    private fun getCollections() {
        viewModelScope.launch {
            _collections.value = roomRepo.getCollectionWithFilms()
        }
    }

    fun addFilmToCollection(collectionName: String) {
        viewModelScope.launch {
            if (filmDetails.value != null) {
                _filmDetails.value?.let { FilmItemMapper.mapFilmItemToFilmDTO(it) }?.let {
                    roomRepo.addFilmToDB(
                        it
                    )
                }

                roomRepo.addCollectionWithCrossRef(
                    CollectionFilmCrossRef(
                        collectionName = collectionName.trim(),
                        filmId = filmDetails.value!!.kinopoiskId
                    )
                )
                getCollections()
            }
        }
    }

    fun dellFilmFromCollection(collectionName: String) {
        viewModelScope.launch {
            if (filmDetails.value != null) {
                roomRepo.deleteFilmFromCollection(
                    CollectionFilmCrossRef(
                        collectionName = collectionName,
                        filmId = _filmDetails.value?.kinopoiskId ?: 0
                    )
                )
            }
            getCollections()
        }
    }

    private suspend fun getFilmDetailsById(id: Int) {
        _filmDetails.value = kinopoiskRepo.getFilmDetailsById(id)
        _filmDetails.value?.let {
            roomRepo.addFilmToDB(
                FilmItemMapper.mapFilmItemToFilmDTO(it)
            )
        }
    }

    private suspend fun getStaffByFilmId(id: Int) {
        _staffByFilm.value = kinopoiskRepo.getFilmStaff(id)
    }

    private suspend fun getImages(id: Int) {
        _images.value = kinopoiskRepo.getImagesByFilmId(id = id)
    }

    private suspend fun getSimilarFilms(id: Int) {
        _similarFilms.value = kinopoiskRepo.getSimilarFilms(id).items
    }


    private fun showErrorToLog(e: Exception) {
        Log.e("ErrorFilmPageViewModel", e.message.toString())
    }
}