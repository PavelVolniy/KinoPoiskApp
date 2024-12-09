package com.example.kinopoiskcinemaapp.presentation.home.season

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowLeft
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.kinopoiskcinemaapp.domain.utils.ScreenState
import com.example.kinopoiskcinemaapp.presentation.ViewContainer

@SuppressLint("RememberReturnType")
@Composable
fun SeasonPage(
    screenState: ScreenState, seasonId: Int,
    seasonViewModel: SeasonViewModel = hiltViewModel(),
    onBackPressedButton: () -> Unit
) {
    remember { seasonViewModel.getSeasonDats(seasonId) }
    val seasonList = seasonViewModel.seasonData.collectAsState().value

    ViewContainer(
        topBar = {
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = 20.dp)
            ) {
                IconButton(
                    onClick = { onBackPressedButton() },
                    modifier = Modifier.align(Alignment.CenterStart)
                ) {
                    Icon(
                        imageVector = Icons.AutoMirrored.Default.KeyboardArrowLeft,
                        contentDescription = null
                    )
                }
                Text(
                    text = "Title",
                    modifier = Modifier.align(Alignment.Center)
                )
            }
        },
        body = {
            Spacer(Modifier.height(20.dp))
            SeasonView(
                modifier = Modifier.padding(horizontal = 20.dp),
                listSeasons = seasonList?.items
            )
        },
        selectedScreen = {},
        screenState = screenState
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewSeasonPage() {
//    SeasonPage(screenState = ScreenState.HomeScreen,
//        seasonId = 0)
}