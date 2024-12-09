package com.example.kinopoiskcinemaapp.presentation.home.listpage

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kinopoiskcinemaapp.R

@SuppressLint("CoroutineCreationDuringComposition")
@Composable
fun LoaderPage() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .padding(20.dp)
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(modifier = Modifier.fillMaxWidth()) {
                TitleText(stringResource(id = R.string.app_name))
            }

            Spacer(modifier = Modifier.height(100.dp))

            CircularProgressIndicator()

            Image(
                painter = painterResource(id = R.drawable.wfh_4_1),
                contentDescription = null
            )

        }
    }

}

@Composable
private fun TitleText(title: String) {
    Text(
        text = title,
        style = TextStyle(
            fontSize = 23.sp
        )
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewLoaderPage() {
    LoaderPage()
}
