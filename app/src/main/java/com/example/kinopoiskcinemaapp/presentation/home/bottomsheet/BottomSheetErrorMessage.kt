package com.example.kinopoiskcinemaapp.presentation.home.bottomsheet

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Close
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.ModalBottomSheet
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.rememberModalBottomSheetState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.domain.utils.ScreenState
import com.example.kinopoiskcinemaapp.presentation.ViewContainer

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun BottomSheetErrorMessage(
    title: String? = null,
    errorMessage: String = "",
    isClose: () -> Unit,
    padding: Int = 20,
    selectedScreen: (screen: ScreenState) -> Unit = {},
    screenState: ScreenState
) {


    val sheetState = rememberModalBottomSheetState()
    var showBottomSheet by remember { mutableStateOf(false) }

    ViewContainer(
        topBar = {},
        body = {
            ModalBottomSheet(
                onDismissRequest = { showBottomSheet = false },
                sheetState = sheetState
            ) {
                ErrorView(padding, title, isClose, errorMessage)
            }
        },
        selectedScreen = { selectedScreen(it) },
        screenState = screenState
    )


}

@Composable
private fun ErrorView(
    padding: Int,
    title: String?,
    isClose: () -> Unit,
    errorMessage: String
) {
    if (errorMessage.isEmpty()) stringResource(R.string.default_error_msg)
    Surface(shape = RoundedCornerShape(topStart = padding.dp, topEnd = padding.dp)) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                TitleText(title)
                IconButton(onClick = { isClose() }) {
                    Icon(imageVector = Icons.Default.Close, contentDescription = null)
                }
            }
            Spacer(modifier = Modifier.height(20.dp))
            ErrorMessage(errorMessage)
            Spacer(modifier = Modifier.height(60.dp))
        }
    }
}

@Composable
private fun ErrorMessage(errorMessage: String) {
    Text(text = errorMessage.ifBlank { stringResource(R.string.connection_default_error_message) })
}

@Composable
private fun TitleText(title: String?) {
    Text(
        text = title ?: stringResource(R.string.error_title),
        style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold)
    )
}

@Preview()
@Composable
fun PreviewErrorView() {
    ErrorView(padding = 20, title = "test", isClose = { }, errorMessage = "")
}