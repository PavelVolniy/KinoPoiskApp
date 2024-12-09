package com.example.kinopoiskcinemaapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class App : Application() {
    companion object {
        const val SHARED_PREF_NAME = "sharedPrefName"
        const val IS_FIRST_START = "isFirstStart"
    }
}