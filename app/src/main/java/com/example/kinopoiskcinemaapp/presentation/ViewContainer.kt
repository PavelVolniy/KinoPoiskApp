package com.example.kinopoiskcinemaapp.presentation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.ColumnScope
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.kinopoiskcinemaapp.R
import com.example.kinopoiskcinemaapp.domain.utils.ScreenState

@Composable
fun ViewContainer(
    topBar: @Composable RowScope.() -> Unit,
    body: @Composable ColumnScope.() -> Unit,
    selectedScreen: (screen: ScreenState) -> Unit,
    screenState: ScreenState
) {


    val isChecked = remember { mutableStateOf(screenState) }
    val listScreens = ScreenState.values()
    Scaffold(modifier = Modifier.fillMaxSize(),
        topBar = {
            Row(modifier = Modifier.fillMaxWidth()) {
                topBar.invoke(this)
            }
        },
        bottomBar = {
            NavigationBar {
                listScreens.forEach { item ->
                    NavigationBarItem(
                        selected = isChecked.value == item,
                        onClick = {
                            isChecked.value = item
                            selectedScreen(item)
                        },
                        icon = { Icon(imageVector = item.image, contentDescription = item.name) })
                }
            }
        }

    ) {
        Column(modifier = Modifier.padding(it)) {
            body.invoke(this)
        }


    }

}

@Preview(showBackground = true)
@Composable
fun PreviewViewContainer() {
    ViewContainer(
        topBar = {
            Text(
                modifier = Modifier.padding(20.dp),
                style = TextStyle(fontSize = 20.sp),
                text = stringResource(id = R.string.app_name)
            )
        },
        body = {},
        selectedScreen = {},
        screenState = ScreenState.SearchScreen

    )
}
