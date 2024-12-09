package com.example.kinopoiskcinemaapp.presentation.startpage

import android.util.Log
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.fakedata.FakeData

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun Onboarding(contentList: List<Pair<Int, String>>, isLoading: Boolean, onClickSkip: () -> Unit) {
    val pagerState = rememberPagerState(pageCount = { 3 })
    Scaffold(
        modifier = Modifier.padding(20.dp), topBar = {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TitleText(stringResource(id = R.string.app_name))
                if (!isLoading) {
                    ClickableText(text = AnnotatedString(stringResource(R.string.skip_clickable_text)),
                        style = TextStyle(
                            color = Color.Gray,
                            fontSize = 23.sp
                        ),
                        onClick = { onClickSkip() })
                }
            }
        },
        bottomBar = {
            if (!isLoading) {
                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.frame_24),
                        contentDescription = null,
                    )
                }
            }
        }) { paddingValues ->
        val positionList = mutableListOf<Int>()
        for (i in 0..contentList.lastIndex) {
            positionList.add(i)
        }

        HorizontalPager(
            state = pagerState,
            modifier = Modifier.padding(paddingValues)
        ) { page ->
            StartPageContentItem(
                imageId = contentList[page].first,
                sloganId = contentList[page].second,
                isLoading = false
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
fun PreviewStartPage() {
    Onboarding(
        FakeData.startPairs,
        false
    ) { Log.e("ClickSkipPreview", "Click skip") }
}