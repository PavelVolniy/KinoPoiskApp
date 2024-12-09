package com.example.kinopoiskcinemaapp.presentation.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.KeyboardArrowRight
import androidx.compose.material3.Card
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.bumptech.glide.integration.compose.ExperimentalGlideComposeApi
import com.bumptech.glide.integration.compose.GlideImage
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.entity.images.ItemFilmImages
import com.example.kinopoiskcinemaapp.fakedata.FakeData
import com.example.kinopoiskcinemaapp.ui.theme.MyTextStyle
import com.example.kinopoiskcinemaapp.ui.theme.SmBlueTitleColor

@OptIn(ExperimentalGlideComposeApi::class)
@Composable
fun GalleryPreview(
    nameGallery: String,
    galleryList: List<ItemFilmImages>,
    size: Int,
    modifier: Modifier,
    onClickGalleryGroup: () -> Unit
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
            GalleryNameText(nameGallery)
            Row(verticalAlignment = Alignment.CenterVertically) {
                ClickableGalleryText(size.toString()) { onClickGalleryGroup() }
            }
        }
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(10.dp),
            modifier = modifier
        ) {
            items(galleryList) { items ->
                Card(modifier = Modifier.size(200.dp, 150.dp)) {
                    GlideImage(
                        model = R.drawable.ic_default_frame, contentDescription = null,
                        modifier = Modifier.fillMaxSize()
                    ) {
                        it.load(items.previewUrl).centerCrop()
                    }
                }
            }
        }
    }
}

@Composable
private fun ClickableGalleryText(size: String, onClick: () -> Unit) {
    ClickableText(
        text = AnnotatedString(size),
        style = MyTextStyle.bodyLargeSelected,
        onClick = { onClick() }
    )
    Icon(
        imageVector = Icons.AutoMirrored.Default.KeyboardArrowRight,
        contentDescription = null,
        tint = SmBlueTitleColor
    )
}

@Composable
private fun GalleryNameText(nameGallery: String) {
    Text(
        text = nameGallery,
        style = MyTextStyle.bodyLarge
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewGallery() {
    val items = FakeData.galleryItems
    GalleryPreview("gallery", items, items.size, Modifier) {}
}