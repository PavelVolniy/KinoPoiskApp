package com.example.kinopoiskcinemaapp.presentation.home.filmographypage

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.entity.staff.Actor

@Composable
fun FilmographyPreview(actor: Actor) {
    var isChecked by remember {
        mutableStateOf(actor.films[0].professionKey)
    }
    val professionKeys = actor.films.map { it.professionKey }.toSet()
    val filmList = actor.films.filter { it.professionKey == isChecked }
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(start = 10.dp)) {
        PersonNameText(actor.nameRu.ifEmpty { actor.nameEn.ifEmpty { "" } })
        Spacer(modifier = Modifier.height(20.dp))
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            content = {
                items(professionKeys.toList()) {
                    if (isChecked == it) {
                        Button(onClick = { isChecked = it }) {
                            ProfessionKeysText(it, filmList.size)
                        }
                    } else {
                        OutlinedButton(onClick = { isChecked = it }) {
                            ProfessionKeysText(it = it, listSize = filmList.size)
                        }
                    }
                }
            })
        Spacer(modifier = Modifier.height(20.dp))
        LazyColumn(content = {
            items(filmList) { filmItem ->
                FilmographyItem(filmItem = filmItem)
            }
        },
            verticalArrangement = Arrangement.spacedBy(10.dp))
    }
}


@Composable
private fun ProfessionKeysText(
    it: String,
    listSize: Int
) {
        Text(text = "$it $listSize")
}

@Composable
private fun PersonNameText(personName: String) {
    Text(
        text = personName,
        style = MaterialTheme.typography.titleLarge
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewFilmography() {
    val person = FakeData.actor
    FilmographyPreview(person)
}