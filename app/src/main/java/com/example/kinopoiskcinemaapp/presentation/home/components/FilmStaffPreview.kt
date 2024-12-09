package com.example.kinopoiskcinemaapp.presentation.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kinopoiskcinemaapp.entity.staff.StaffItem
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.ui.theme.MyTextStyle
import com.example.kinopoiskcinemaapp.ui.theme.SmBlueTitleColor

@Composable
fun FilmStaffPreview(
    nameGroupPerson: String,
    person: List<StaffItem>,
    total: Int,
    modifier: Modifier,
    onClickGroup: (list: List<StaffItem>) -> Unit,
    onClickStaffItem: (staffId: Int) -> Unit
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Row(
            modifier = modifier
                .fillMaxWidth()
                .padding(end = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            NameGroupPersonsText(nameGroupPerson)
            ClickableGroupText(total, onClickGroup, person)
        }
        LazyHorizontalGrid(rows = GridCells.Fixed(4),
            horizontalArrangement = Arrangement.spacedBy(20.dp),
            verticalArrangement = Arrangement.spacedBy(10.dp),
            modifier = modifier
                .height(250.dp),
            content = {
                items(person) { staffItem ->
                    ActorItemPreview(person = staffItem) { onClickStaffItem(staffItem.staffId) }
                }
            })

    }
}

@Composable
private fun ClickableGroupText(
    total: Int,
    onClickGroup: (list: List<StaffItem>) -> Unit,
    person: List<StaffItem>
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        if (total > 20) {
            ClickableText(text = AnnotatedString(total.toString()),
                style = MyTextStyle.bodyLargeSelected,
                onClick = {
                    onClickGroup(person)
                })
        }
        Icon(
            imageVector = Icons.AutoMirrored.Default.KeyboardArrowRight, contentDescription = null,
            tint = SmBlueTitleColor
        )
    }
}

@Composable
private fun NameGroupPersonsText(nameGroupPerson: String) {
    Text(
        text = nameGroupPerson,
        style = MyTextStyle.bodyLarge
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewFilmAwards() {
    val person = FakeData.personStaff
    FilmStaffPreview("The film was shot", person, person.size, Modifier, {}, {})
}