package com.example.kinopoiskcinemaapp.presentation.home.season

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo
import com.example.kinopoiskcinemaapp.entity.season.SeasonFilm
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SeasonViewModel @Inject constructor(
    private val kinopoiskRepo: KinopoiskRepo
) : ViewModel() {
    private val _seasonData = MutableStateFlow<SeasonFilm?>(null)
    val seasonData get() = _seasonData.asStateFlow()

    fun getSeasonDats(seasonId: Int) {
        viewModelScope.launch {
            try {
                Log.e("seasonId", seasonId.toString())
                _seasonData.value = kinopoiskRepo.getSeasons(seasonId)
                Log.e("SeasonViewModel", _seasonData.value.toString())
            } catch (e: Exception) {
                Log.e("SeasonViewModel", e.message.toString())
            }
        }
    }
}