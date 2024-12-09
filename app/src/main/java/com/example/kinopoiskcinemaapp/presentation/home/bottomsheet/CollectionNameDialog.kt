package com.example.kinopoiskcinemaapp.presentation.home.bottomsheet

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kinopoiskcinemaapp.R

@Composable
fun CollectionNameDialog(
    isClose: () -> Unit,
    isSuccess: (text: String) -> Unit
) {
    var text by remember { mutableStateOf("") }
    val errMsg = stringResource(R.string.text_field_error_msg)
    var errorMessage by remember { mutableStateOf("") }
    Card(
        modifier = Modifier.size(300.dp)
    ) {
        Box(
            modifier = Modifier
                .padding(20.dp)
                .fillMaxSize()
        ) {
            IconButton(
                modifier = Modifier.align(Alignment.TopEnd),
                onClick = {
                    text = ""
                    isClose()
                }) {
                Image(
                    imageVector = Icons.Default.Close,
                    contentDescription = null
                )
            }
            Button(
                modifier = Modifier.align(Alignment.BottomEnd),
                onClick = {
                    if (text.isEmpty()) errorMessage = errMsg
                    else isSuccess(text)
                }) {
                Text(text = stringResource(R.string.success_name_button))
            }
            Column(
                modifier = Modifier.fillMaxSize(),
                verticalArrangement = Arrangement.Center
            ) {

                TextField(
                    value = text,
                    label = {
                        Text(
                            text = errorMessage.ifEmpty {
                                stringResource(R.string.collection_dialog_label)
                            }
                        )
                    },
                    onValueChange = {
                        errorMessage = ""
                        text = it
                    },
                    isError = errorMessage.isNotEmpty()
                )

            }
        }
    }
}

@Preview
@Composable
fun PreviewCollectionNameDialog() {
    CollectionNameDialog(isClose = {}, isSuccess = {})
}
