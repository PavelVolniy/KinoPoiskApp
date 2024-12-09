package com.example.kinopoiskcinemaapp.presentation.home.season

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.entity.season.SeasonItem
import com.example.kinopoiskcinemaapp.ui.theme.MyTextStyle
import com.example.kinopoiskcinemaapp.ui.theme.SmBlackColor
import com.example.kinopoiskcinemaapp.ui.theme.SmBlueTitleColor
import com.example.kinopoiskcinemaapp.ui.theme.SmWhiteColor


@Composable
fun SeasonView(modifier: Modifier, listSeasons: List<SeasonItem>?) {
    var selectedSeason by remember { mutableIntStateOf(1) }

    if (listSeasons != null) {
        Column(
            modifier = modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start,
            verticalArrangement = Arrangement.spacedBy(20.dp)
        ) {
            SeasonButtonRow(
                selectedSeason = selectedSeason,
                onCheckButton = { selectedSeason = it },
                listButtons = listSeasons.map { it.number }
            )
            LazyColumn(
                verticalArrangement = Arrangement.spacedBy(20.dp),
                horizontalAlignment = Alignment.Start
            ) {
                item {
                    Text(
                        text = stringResource(
                            R.string.season_series_title_list,
                            selectedSeason,
                            listSeasons[selectedSeason - 1].episodes.size
                        ),
                        style = MyTextStyle.bodySmallGray
                    )
                }
                items(listSeasons[selectedSeason - 1].episodes) { item ->
                    EpisodeItem(
                        numberSeries = item.episodeNumber,
                        nameSeries = item.nameRu ?: item.nameEn?:"not name",
                        dateRealise = item.releaseDate?:" not date"
                    )
                }

            }
        }
    }

}

@Composable
private fun SeasonButtonRow(
    selectedSeason: Int,
    onCheckButton: (numButton: Int) -> Unit,
    listButtons: List<Int>
) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Text(text = stringResource(R.string.season_botton_row))
        Spacer(Modifier.width(20.dp))
        LazyRow(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
            items(listButtons) { item ->
                SeasonButton(
                    num = item,
                    isChecked = item == selectedSeason,
                    onCheck = { numButton -> onCheckButton(numButton) }
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSeasonView() {
    SeasonView(
        modifier = Modifier.padding(horizontal = 20.dp),
        listSeasons = FakeData.seasons.items
    )
}

@Composable
private fun SeasonButton(num: Int, isChecked: Boolean, onCheck: (numButton: Int) -> Unit) {
    Surface(
        shape = RoundedCornerShape(20.dp),
        color = if (isChecked) SmBlueTitleColor else SmWhiteColor,
        border = if (isChecked) null else BorderStroke(1.dp, color = SmBlackColor),
        modifier = Modifier.clickable {
            onCheck(num)
        }
    ) {
        Text(
            text = num.toString(),
            style = TextStyle(
                color = if (isChecked) SmWhiteColor else SmBlackColor,
                fontSize = 20.sp
            ),
            modifier = Modifier.padding(horizontal = 15.dp, vertical = 2.dp)
        )
    }
}

@Composable
private fun EpisodeItem(numberSeries: Int, nameSeries: String, dateRealise: String) {
    val series = stringResource(R.string.series_episode_item)
    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.spacedBy(5.dp)
    ) {
        Text(
            text = "$numberSeries $series, $nameSeries",
            style = MyTextStyle.bodyMedium
        )
        Text(
            text = dateRealise,
            style = MyTextStyle.bodySmallGray
        )
    }
}