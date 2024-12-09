package com.example.kinopoiskcinemaapp.presentation.home.homepage

import android.content.Context
import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo
import com.example.kinopoiskcinemaapp.data.room.RoomRepo
import com.example.kinopoiskcinemaapp.domain.dto.CollectionDTO
import com.example.kinopoiskcinemaapp.domain.dto.CollectionWithFilms
import com.example.kinopoiskcinemaapp.domain.utils.FilmType
import com.example.kinopoiskcinemaapp.domain.utils.HomePageRequestState
import com.example.kinopoiskcinemaapp.domain.utils.Sorting
import com.example.kinopoiskcinemaapp.entity.FilmGroup
import com.example.kinopoiskcinemaapp.entity.collections.CollectionsType
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomePageViewModel @Inject constructor(
    private val kinopoiskRepo: KinopoiskRepo,
    private val roomRepo: RoomRepo,
    @ApplicationContext private val context: Context
) : ViewModel() {
    private val _filmsGroupList =
        MutableStateFlow<HomePageRequestState>(HomePageRequestState.Loading)
    val filmGroupList get() = _filmsGroupList.asStateFlow()
    private val _collectionWithFilmsDTO = MutableStateFlow<List<CollectionWithFilms>>(emptyList())
    val collectionWithFilmsDTO get() = _collectionWithFilmsDTO.value

    init {
        viewModelScope.launch {
            addCollectionToBD(
                collectionName = context.getString(R.string.like_default_name_collection),
                icon = R.drawable.heart,
                isClosable = false
            )
            addCollectionToBD(
                collectionName = context.getString(R.string.viewed_default_name_collection),
                icon = R.drawable.viewed,
                isClosable = false
            )
            addCollectionToBD(
                collectionName = context.getString(R.string.want_to_see_collection_name),
                icon = R.drawable.frame_7299,
                isClosable = false
            )
        }
    }

    private suspend fun addCollectionToBD(
        collectionName: String,
        icon: Int = R.drawable.user_icon,
        isClosable: Boolean = true
    ) {
        roomRepo.addCollection(CollectionDTO(collectionName.trim(), icon, isClosable))
    }

    fun getFilms() {
        viewModelScope.launch {
            try {
                _filmsGroupList.value = HomePageRequestState.Loading
                val listFilmsGroup = mutableListOf<FilmGroup>()
                val premieres = kinopoiskRepo.getPremieres()
                listFilmsGroup.add(
                    FilmGroup(
                        FilmType.PREMIERES,
                        premieres.items,
                        premieres.total
                    )
                )
                val collections =
                    kinopoiskRepo.getCollections(CollectionsType.TOP_POPULAR_ALL.name, 1)
                listFilmsGroup.add(
                    FilmGroup(
                        CollectionsType.TOP_POPULAR_ALL,
                        collections.items,
                        collections.total
                    )
                )
                val tvSeries = kinopoiskRepo.getFilmsByParams(
                    1,
                    0,
                    Sorting.RATING.toString(),
                    FilmType.TV_SERIES.name,
                    4,
                    10,
                    2020,
                    2024,
                    "",
                    1
                )
                listFilmsGroup.add(
                    FilmGroup(
                        FilmType.TV_SERIES,
                        tvSeries.items,
                        tvSeries.total
                    )
                )
                val top250Movies =
                    kinopoiskRepo.getCollections(CollectionsType.TOP_250_MOVIES.name, 1)
                listFilmsGroup.add(
                    FilmGroup(
                        CollectionsType.TOP_250_MOVIES,
                        top250Movies.items,
                        total = top250Movies.total
                    )
                )

                getCollections()
                _filmsGroupList.value = HomePageRequestState.Success(listFilmsGroup)
            } catch (e: Exception) {
                showErrorToLog(e)
//                _filmsGroupList.value = listOf(FilmGroup(FilmType.TEST, TestData.filmItemList, 10))
                _filmsGroupList.value = HomePageRequestState.Error(e.message.toString())
            }

        }
    }

    private suspend fun getCollections() {
        _collectionWithFilmsDTO.value = roomRepo.getCollectionWithFilms()
    }


    private fun showErrorToLog(e: Exception) {
        Log.e("HomePageVMError", e.message.toString())
    }

    //for get lists country and genres
    fun getFilters() {
        viewModelScope.launch {
            kinopoiskRepo.getFilters().countries.forEach { Log.e("countries", it.toString()) }
            kinopoiskRepo.getFilters().genres.forEach { Log.e("genres", it.toString()) }
        }
    }
}
