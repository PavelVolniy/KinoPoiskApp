package com.example.kinopoiskcinemaapp.presentation.search.settings

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun SettingsViewContainer(
    onBackPressed: () -> Unit,
    titleName: String,
    body: @Composable ColumnScope.() -> Unit
) {
    Scaffold(
        topBar = {
            Box(modifier = Modifier.fillMaxWidth()) {
                IconButton(
                    onClick = {onBackPressed()},
                    modifier = Modifier.align(alignment = Alignment.CenterStart)
                ) {
                    Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = null)
                }

                Text(
                    text = titleName,
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        },
        bottomBar = {}) {
        Column(modifier = Modifier.padding(it)) { body.invoke(this) }
    }
}