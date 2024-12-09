package com.example.kinopoiskcinemaapp.presentation.search.settings

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.RangeSlider
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringArrayResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.domain.utils.FilmType
import com.example.kinopoiskcinemaapp.domain.utils.Sorting
import com.example.kinopoiskcinemaapp.ui.theme.SmBlackColor
import com.example.kinopoiskcinemaapp.ui.theme.SmBlueColor
import com.example.kinopoiskcinemaapp.ui.theme.SmGrayColor
import com.example.kinopoiskcinemaapp.ui.theme.SmLightGrayColor
import com.example.kinopoiskcinemaapp.ui.theme.SmWhiteColor

@Composable
fun SearchSettingsPage(
    onPressCountry: () -> Unit,
    onPressGenre: () -> Unit,
    onPressYear: () -> Unit,
    changedRatingFrom: (from: Int) -> Unit,
    changedRatingTo: (to: Int) -> Unit,
    filmType: (filmType: FilmType) -> Unit,
    sorting: (order: Sorting) -> Unit,
    countryValue: String,
    genre: String,
    years: String,
    hideViewedFilms: (value: Boolean) -> Unit
) {
    val arrShowButtons = listOf(
        Pair(FilmType.ALL, stringArrayResource(R.array.shows_film_buttons)[0]),
        Pair(FilmType.FILM, stringArrayResource(R.array.shows_film_buttons)[1]),
        Pair(FilmType.TV_SERIES, stringArrayResource(R.array.shows_film_buttons)[2])
    )
    val arrSortingButtons = listOf(Sorting.YEAR, Sorting.NUM_VOTE, Sorting.RATING)

    var showButton by rememberSaveable { mutableStateOf(arrShowButtons.first()) }
    val sortingButton = rememberSaveable { mutableStateOf(arrSortingButtons.first()) }
    var ratingFrom by rememberSaveable { mutableIntStateOf(0) }
    var ratingTo by rememberSaveable { mutableIntStateOf(10) }
    var toHideViewedFilms by remember { mutableStateOf(false) }


    Column(
        modifier = Modifier.padding(start = 20.dp, end = 20.dp),
        verticalArrangement = Arrangement.spacedBy(20.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        FilmTypeButtonGroup(arrShowButtons, showButton, filmType)

        TextSettingsRow(
            stringResource(R.string.country_settings_page),
            countryValue
        ) { onPressCountry() }
        HorizontalDivider(modifier = Modifier.fillMaxWidth())
        TextSettingsRow(stringResource(R.string.genre_settings_page), genre) { onPressGenre() }
        HorizontalDivider(modifier = Modifier.fillMaxWidth())
        TextSettingsRow(stringResource(R.string.year_settings_page), years) { onPressYear() }
        HorizontalDivider(modifier = Modifier.fillMaxWidth())
        RatingGroup(changedRatingFrom, changedRatingTo)

        SortingButtonsGroup(arrSortingButtons, sortingButton, sorting)

        HideOrNotViewedFilms(toHide = toHideViewedFilms,
            onClickRow = { value ->
                toHideViewedFilms = value
                hideViewedFilms(toHideViewedFilms)
            })
    }

}

@Composable
private fun HideOrNotViewedFilms(toHide: Boolean, onClickRow: (value: Boolean) -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .clickable { onClickRow(!toHide) },
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start
    ) {
        Icon(
            painter = painterResource(if (toHide) R.drawable.not_viewed else R.drawable.viewed),
            contentDescription = null
        )
        Spacer(modifier = Modifier.width(40.dp))
        Text(
            text = stringResource(R.string.not_looked_setting_page),
            color = SmBlackColor
        )
    }
}

@Composable
private fun SortingButtonsGroup(
    arrSortingButtons: List<Sorting>,
    sortingButton: MutableState<Sorting>,
    sorting: (order: Sorting) -> Unit
) {
    Column {
        HorizontalDivider(modifier = Modifier.fillMaxWidth())
        Spacer(Modifier.height(20.dp))
        ButtonGroupTitle(stringResource(R.string.title_sorting_settings))
        Spacer(Modifier.height(10.dp))
        ButtonsRow(
            listButtons = arrSortingButtons.map { it.order },
            selectedButton = sortingButton.value.order,
            selectButton = { order ->
                sortingButton.value =
                    arrSortingButtons.find { it.order == order } ?: Sorting.YEAR
                sorting(sortingButton.value)
            })
        Spacer(Modifier.height(30.dp))
        HorizontalDivider(modifier = Modifier.fillMaxWidth())
    }
}

@Composable
private fun RatingGroup(
    changedRatingFrom: (from: Int) -> Unit,
    changedRatingTo: (to: Int) -> Unit
) {
    var ratingFrom by rememberSaveable { mutableIntStateOf(0) }
    var ratingTo by rememberSaveable { mutableIntStateOf(10) }
    Column {
        TextSettingsRow(
            name = stringResource(R.string.rating_title_row),
            text = if (ratingFrom == 0 && ratingTo == 10) stringResource(R.string.all_show_type)
            else "from $ratingFrom to $ratingTo"
        ) {}

        RangeSlider(
            modifier = Modifier.fillMaxWidth(),
            value = ratingFrom.toFloat()..ratingTo.toFloat(),
            onValueChange = {
                ratingTo = it.endInclusive.toInt()
                ratingFrom = it.start.toInt()
                changedRatingFrom(ratingFrom)
                changedRatingTo(ratingTo)
            },
            valueRange = 0f..10f
        )
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 5.dp, end = 5.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = stringResource(R.string.min_value_rating))
            Text(text = stringResource(R.string.max_value_rating))
        }
    }
}

@Composable
private fun FilmTypeButtonGroup(
    arrShowButtons: List<Pair<FilmType, String>>,
    showButton: Pair<FilmType, String>,
    filmType: (filmType: FilmType) -> Unit
) {
    var checkedButton by remember { mutableStateOf(showButton) }
    Column(verticalArrangement = Arrangement.spacedBy(20.dp)) {
        ButtonGroupTitle(stringResource(R.string.title_shows_films_settings))
        ButtonsRow(listButtons = arrShowButtons.map { it.second },
            selectedButton = checkedButton.second,
            selectButton = { nameGroup ->
                checkedButton = arrShowButtons.find { it.second == nameGroup } ?: arrShowButtons[0]
                filmType(checkedButton.first)
            })
    }
}

@Composable
private fun ButtonGroupTitle(title: String) {
    Text(
        text = title,
        color = SmGrayColor
    )
}

@Composable
private fun ButtonsRow(
    listButtons: List<String>,
    selectedButton: String,
    selectButton: (nameButton: String) -> Unit
) {
    Surface(
        shape = RoundedCornerShape(40.dp),
        border = BorderStroke(width = 1.dp, color = Color.Black),
        color = Color.Gray
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            listButtons.forEach { nameButton ->
                CheckButton(modifier = Modifier.weight(1f),
                    isChecked = nameButton == selectedButton,
                    nameButton = nameButton,
                    onClick = { selectButton(nameButton) })
            }
        }
    }
}

@Composable
private fun TextSettingsRow(name: String, text: String, onClickRow: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 10.dp, bottom = 10.dp)
            .clickable { onClickRow() },
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = name,
            color = SmBlackColor
        )
        Text(
            text = text,
            color = SmLightGrayColor
        )
    }
}

@Composable
private fun CheckButton(
    modifier: Modifier,
    isChecked: Boolean,
    nameButton: String,
    onClick: (text: String) -> Unit
) {
    IconButton(
        onClick = { onClick(nameButton) },
        modifier = if (isChecked) modifier
            .background(SmBlueColor)
            .border(1.dp, color = SmBlackColor)
        else {
            modifier
                .background(SmWhiteColor)
                .border(1.dp, color = SmBlackColor)
        }
    ) {
        Text(text = nameButton, color = if (isChecked) SmWhiteColor else SmBlackColor)
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainSettingsView() {
    SearchSettingsPage(
        onPressCountry = {},
        onPressGenre = {},
        onPressYear = {},
        countryValue = "Russia",
        genre = "Camedy",
        years = "from 1998 to 2017",
        changedRatingFrom = {},
        changedRatingTo = {},
        filmType = {},
        sorting = {},
        hideViewedFilms = {}
    )
}