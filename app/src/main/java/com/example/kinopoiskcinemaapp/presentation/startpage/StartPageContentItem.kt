package com.example.kinopoiskcinemaapp.presentation.startpage

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kinopoiskcinemaapp.R

@Composable
fun StartPageContentItem(imageId: Int, sloganId: String, isLoading: Boolean) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceAround,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Spacer(modifier = Modifier.height(20.dp))
        if (isLoading) CircularProgressIndicator()
        Image(
            painter = painterResource(id = imageId), contentDescription = null,
        )
        if (!isLoading) SloganText(sloganId)

    }
}

@Composable
private fun SloganText(slogan: String) {
    Text(
        text = slogan,
        style = TextStyle(
            color = Color.Black,
            fontSize = 32.sp
        )
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewStartPageContent() {

    StartPageContentItem(
        R.drawable.wfh_4_1,
        stringArrayResource(R.array.start_page_data)[0],
        false
    )
}
