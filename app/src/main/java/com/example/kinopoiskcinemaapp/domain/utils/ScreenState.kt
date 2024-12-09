package com.example.kinopoiskcinemaapp.domain.utils

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBox
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector

enum class ScreenState(val image: ImageVector) {
    HomeScreen(Icons.Default.Home),
    SearchScreen(Icons.Default.Search),
    ProfileScreen(Icons.Default.AccountBox)
}
