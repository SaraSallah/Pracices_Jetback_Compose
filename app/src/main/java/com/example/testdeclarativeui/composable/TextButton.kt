package com.example.testdeclarativeui.composable

import androidx.compose.foundation.clickable
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.testdeclarativeui.ui.theme.Orange
import com.example.testdeclarativeui.ui.theme.Rubik

@Composable
fun TextButton(
    text: String,
    onClick:() -> Unit,
) {
    Text(
        text = text,
        color = Orange,
        fontWeight = FontWeight.Medium,
        fontFamily = Rubik,
        fontSize = 14.sp,
        modifier = Modifier.clickable { onClick }
    )

}