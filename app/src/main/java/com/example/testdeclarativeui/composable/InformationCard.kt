package com.example.testdeclarativeui.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.testdeclarativeui.ui.theme.CardBackgroundColor
import com.example.testdeclarativeui.ui.theme.PrimaryTextColor
import com.example.testdeclarativeui.ui.theme.Rubik
import com.example.testdeclarativeui.ui.theme.SecondaryTextColor

@Composable
fun InformationCard(title: String, information: String) {
    Card(
        shape = RoundedCornerShape(24.dp),
        modifier = Modifier.padding(vertical = 8.dp)
            .fillMaxWidth()
            .background(CardBackgroundColor),
    ) {
        Column(modifier = Modifier.padding(horizontal = 24.dp, vertical = 16.dp)) {
            Text(
                text = title,
                fontWeight = FontWeight.Normal,
                fontSize = 9.sp,
                fontFamily = Rubik,
                color = SecondaryTextColor
            )

            Text(
                text = information,
                fontWeight = FontWeight.Normal,
                fontSize = 14.sp,
                fontFamily = Rubik,
                color = PrimaryTextColor
            )
        }
    }

}