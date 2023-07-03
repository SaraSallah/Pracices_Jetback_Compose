package com.example.testdeclarativeui.composable

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testdeclarativeui.modifiers.blueLight

@Composable
fun GlowText(
    text:String,
    modifier: Modifier = Modifier // to can use modifier add in compose
){
    Text(
        text = text,
        modifier =  modifier
            .fillMaxWidth()
            .blueLight()
            .padding(16.dp)
        ,
        fontSize = 24.sp
    )

}