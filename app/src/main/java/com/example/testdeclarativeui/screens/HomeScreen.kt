package com.example.testdeclarativeui.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testdeclarativeui.R
import com.example.testdeclarativeui.composable.GlowText

@Preview
@Composable
fun HomeScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceEvenly
    ) {
        val textShadowModifier = Modifier
            .shadow(12.dp, spotColor = Color.Blue)
            .fillMaxWidth()
            .background(Color.LightGray)

        GlowText(text = "Sara")

        Button(modifier = Modifier.fillMaxWidth(),
            onClick = { /*TODO*/ }) {
            Text(text = "Click Me")

        }
        GlowText(
            text = "Sara Salah",
            modifier = Modifier.background(Color.Yellow)
        )

        Image(painter = painterResource(id = R.drawable.graff),
            contentDescription = null,
        Modifier.clip(RoundedCornerShape(24.dp)))

    }
}