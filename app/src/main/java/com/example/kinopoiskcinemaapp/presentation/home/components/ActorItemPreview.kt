package com.example.kinopoiskcinemaapp.presentation.home.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.entity.staff.StaffItem

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun ActorItemPreview(person: StaffItem, onClickItem: () -> Unit) {
    Card(
        onClick = { onClickItem() },
        modifier = Modifier.size(180.dp, 80.dp)
    ) {
        Row(
            modifier = Modifier
                .padding(all = 10.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            GlideImage(
                model = painterResource(id = R.drawable.ic_default_person),
                contentDescription = null,
            ) {
                it.load(person.posterUrl).centerInside()
            }

            Spacer(modifier = Modifier.width(20.dp))
            Column() {
                PersonNameText(person.nameRu.ifEmpty { person.nameEn.ifEmpty { "" } })
                DescriptionText(person.description ?: "")
            }
        }
    }
}

@Composable
private fun DescriptionText(description: String) {
    Text(
        text = description,
        style = TextStyle(color = Color.Gray)
    )
}

@Composable
private fun PersonNameText(personName: String) {
    Text(
        text = personName,
        style = TextStyle(color = Color.Black)
    )
}

@Preview
@Composable
fun PreviewPersonItem() {
    val staff = FakeData.personStaff[0]

    ActorItemPreview(person = staff) {

    }
}
