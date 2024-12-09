package com.example.kinopoiskcinemaapp.presentation

import android.annotation.SuppressLint
import android.content.SharedPreferences
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.kinopoiskcinemaapp.ui.theme.KinopoiskCinemaAppTheme
import com.example.kinopoiskcinemaapp.presentation.MainNavGraph
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var sharedPref: SharedPreferences

    @SuppressLint(
        "CoroutineCreationDuringComposition", "StateFlowValueCalledInComposition",
        "RememberReturnType"
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
            KinopoiskCinemaAppTheme() {
                MainNavGraph(sharedPreferences = sharedPref)
            }
        }
    }
}
