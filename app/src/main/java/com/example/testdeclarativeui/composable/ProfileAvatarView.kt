package com.example.testdeclarativeui.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp

@Composable
fun ProfileAvatar(painter: Painter,
                  size :Int =128) {
    Image(
        painter = painter,
        contentDescription = "Profile picture",
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .clip(RoundedCornerShape(24.dp))
            .size(size.dp)

    )

}