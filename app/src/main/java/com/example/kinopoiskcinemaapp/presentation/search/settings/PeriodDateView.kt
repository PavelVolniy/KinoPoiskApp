package com.example.kinopoiskcinemaapp.presentation.search.settings

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.ui.theme.SmBlackColor
import com.example.kinopoiskcinemaapp.ui.theme.SmBlueColor
import com.example.kinopoiskcinemaapp.ui.theme.SmBlueTitleColor
import com.example.kinopoiskcinemaapp.ui.theme.SmGrayColor
import com.example.kinopoiskcinemaapp.ui.theme.SmLightGrayColor
import com.example.kinopoiskcinemaapp.ui.theme.SmWhiteColor
import java.util.Calendar

@Composable
fun PeriodDateView(
    onBackPressed: () -> Unit,
    onSuccessPressed: (yearFrom: Int, yearTo: Int) -> Unit
) {
    val currentYear = Calendar.getInstance().get(Calendar.YEAR)
    val startYear = 1997
    var selectedYearFrom by remember { mutableIntStateOf(0) }
    var selectedYearTo by remember { mutableIntStateOf(0) }
    var startYearFrom by remember { mutableIntStateOf(startYear) }
    var startYearTo by remember { mutableIntStateOf(startYear) }

    val listFrom = getYearsList(startYearFrom, currentYear)
    val listTo =
        getYearsList(
            if (selectedYearFrom != 0 && startYearTo == startYear) {
                startYearTo = selectedYearFrom
                selectedYearFrom
            } else startYearTo, currentYear
        )


    SettingsViewContainer(
        onBackPressed = { onBackPressed() },
        titleName = stringResource(R.string.period_page_title),
        body = {
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(20.dp),
                verticalArrangement = Arrangement.SpaceBetween,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Spacer(Modifier.height(30.dp))

                DatePickerBlock(
                    title = "Search in period from",
                    selectYear = { selectedYearFrom = it },
                    yearsList = listFrom,
                    onClickNext = { if ((listFrom.first() + 12) <= currentYear) startYearFrom += 12 },
                    onClickPreview = { startYearFrom -= 12 }
                )
                DatePickerBlock(
                    title = "Search in period to",
                    selectYear = { selectedYearTo = it },
                    yearsList = listTo,
                    onClickNext = { if ((listTo.first() + 12) <= currentYear) startYearTo += 12 },
                    onClickPreview = { startYearTo -= 12 }
                )

                FilledTonalButton(
                    onClick = {
                        if (selectedYearFrom != 0) {
                            onSuccessPressed(
                                selectedYearFrom,
                                if (selectedYearTo != 0) selectedYearTo else currentYear
                            )
                        } else {
                            onSuccessPressed(startYear, currentYear)
                        }
                    },
                    colors = ButtonColors(
                        containerColor = SmBlueTitleColor,
                        contentColor = SmWhiteColor,
                        disabledContentColor = SmGrayColor,
                        disabledContainerColor = SmLightGrayColor
                    )
                ) {
                    Text(text = stringResource(R.string.select_period_button))
                }
            }
        }

    )

}

@Composable
private fun DatePickerBlock(
    title: String,
    selectYear: (selectedYear: Int) -> Unit,
    yearsList: List<Int>,
    onClickNext: () -> Unit,
    onClickPreview: () -> Unit
) {
    var selectedYear by remember { mutableIntStateOf(0) }

    Column(
        horizontalAlignment = Alignment.Start,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = title,
            color = SmLightGrayColor
        )
        Spacer(Modifier.height(10.dp))

        YearPicker(
            yearsList = yearsList,
            selectedYear = {
                selectYear(it)
                selectedYear = it
            },
            isChecked = selectedYear,
            onClickNext = { onClickNext() },
            onClickPreview = { onClickPreview() }
        )
    }

}

private fun getYearsList(startYear: Int, currentYear: Int): List<Int> {
    val list = mutableListOf<Int>()
    for (i in 1..12) {
        if ((startYear + i) <= currentYear) list.add(startYear + i)
    }
    return list.toList()
}

@Composable
private fun YearPicker(
    selectedYear: (year: Int) -> Unit,
    yearsList: List<Int>,
    isChecked: Int = 0,
    onClickNext: () -> Unit,
    onClickPreview: () -> Unit
) {
    Surface(
        shape = RoundedCornerShape(10.dp),
        border = BorderStroke(1.dp, color = SmBlackColor),
        modifier = Modifier.fillMaxWidth()
    ) {
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            TitleRow("${yearsList.first()} - ${yearsList.last()}",
                onClickNext = { onClickNext() },
                onClickPreview = { onClickPreview() })
            LazyVerticalGrid(
                columns = GridCells.Fixed(3),
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.spacedBy(15.dp),
                horizontalArrangement = Arrangement.spacedBy(30.dp)
            ) {
                items(yearsList) { listItem ->
                    ClickableText(
                        text = AnnotatedString(listItem.toString()),
                        style = TextStyle(
                            textAlign = TextAlign.Center,
                            color = if (listItem == isChecked) SmBlueColor else SmBlackColor
                        ),
                        onClick = { selectedYear(listItem) },
                    )
                }
            }
            Spacer(Modifier.height(20.dp))
        }
    }
}

@Composable
private fun TitleRow(title: String, onClickNext: () -> Unit, onClickPreview: () -> Unit) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Text(
            text = title,
            color = SmBlueTitleColor,
            modifier = Modifier.weight(2f),
            style = MaterialTheme.typography.bodyLarge
        )

        IconButton(onClick = { onClickPreview() }, modifier = Modifier.weight(0.2f)) {
            Icon(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = null)
        }
        IconButton(onClick = { onClickNext() }, modifier = Modifier.weight(0.2f)) {
            Icon(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null)
        }

    }
}

@Preview(showBackground = true)
@Composable
fun PreviewPeriodDateView() {
    PeriodDateView(onBackPressed = {}, onSuccessPressed = { yearFrom: Int, yearTo: Int -> })
}