package com.example.testdeclarativeui.composable

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun HelloView(name: String) {
    Text(
        "hello $name",
        color = Color.Blue
    )
}
@Preview(name = "arabic", locale = "ar")
@Preview(name = "english", locale = "en")
@Composable
fun Preview() {
    HelloView(name = "Sara")

}