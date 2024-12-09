package com.example.kinopoiskcinemaapp.presentation.home.actorpage

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kinopoiskcinemaapp.data.retrofit.KinopoiskRepo
import com.example.kinopoiskcinemaapp.entity.staff.Actor
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
import javax.inject.Singleton

@HiltViewModel
class ActorPageViewModel @Inject constructor(
    val kinopoiskRepo: KinopoiskRepo
) : ViewModel() {
    private val _actor = MutableStateFlow<Actor?>(null)
    val actor get() = _actor.asStateFlow()

    fun getActorData(id: Int) {
        viewModelScope.launch {
            try {
                _actor.value = kinopoiskRepo.getActorByStaffId(id)
            } catch (e: Exception) {
                showErrorToLog(e)
            }
        }
    }

    private fun showErrorToLog(e: Exception) {
        Log.e("Error", e.message.toString())
    }
}