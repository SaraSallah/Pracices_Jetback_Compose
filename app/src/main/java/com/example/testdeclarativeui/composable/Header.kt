package com.example.testdeclarativeui.composable

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.testdeclarativeui.ui.theme.PrimaryTextColor
import com.example.testdeclarativeui.ui.theme.Rubik
import com.example.testdeclarativeui.ui.theme.SecondaryTextColor

@Composable
fun Header(title: String, subtitle: String) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            text = title,
            color = PrimaryTextColor,
            fontFamily = Rubik,
            fontSize = 18.sp,
            fontWeight = FontWeight.Medium
        )
        Text(
            text = subtitle,
            color = SecondaryTextColor,
            fontFamily = Rubik,
            fontSize = 12.sp,
            fontWeight = FontWeight.Normal
        )
    }
}
@Preview(widthDp = 360)
@Composable
fun PreviewHeader(){
    Header("Title" , "SubTitle")
}
