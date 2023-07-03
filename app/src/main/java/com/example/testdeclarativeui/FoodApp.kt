@file:OptIn(ExperimentalMaterial3Api::class)

package com.example.testdeclarativeui

import android.annotation.SuppressLint
import androidx.compose.foundation.background
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.example.testdeclarativeui.composable.HelloView

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable

fun FoodAPP() {
    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(
                    text = "Title",
                color = Color.Red)
            },Modifier.background(Color.Black))
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
            }

        }
    ) {
        HelloView(name = "Sara")
    }
}