package com.example.testdeclarativeui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.testdeclarativeui.R
import com.example.testdeclarativeui.composable.DefaultButton
import com.example.testdeclarativeui.composable.Header
import com.example.testdeclarativeui.composable.InformationCard
import com.example.testdeclarativeui.composable.ProfileAvatar
import com.example.testdeclarativeui.composable.SpacerHorizontal16
import com.example.testdeclarativeui.composable.SpacerVertical24
import com.example.testdeclarativeui.composable.SpacerVertical32
import com.example.testdeclarativeui.composable.TextButton

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp, vertical = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Header(title = "Account", subtitle = "Edit or manage your account")

        SpacerVertical32()
        ProfileAvatar(painter = painterResource(id = R.drawable.graff))
        SpacerVertical24()
        TextButton(text = "Change profile picture") {

        }
        SpacerVertical32()
        Row(modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.weight(1f)) {
                InformationCard(title = "First name ", information = " Sara")
            }
            SpacerHorizontal16()
            Box(modifier = Modifier.weight(1f)) {
                InformationCard(title = "Last name ", information = "Salah")

            }
        }
        InformationCard(title = "Location ", information = "Cairo, Egypt")
        InformationCard(title = "Email ", information = "sarasallah165091@gmail.com")
        InformationCard(title = "Phone ", information = "0123456789")
        Spacer(modifier = Modifier.weight(1f))
        DefaultButton(text = "Save", onClick = { /*TODO*/ })


    }
}


@Preview(showBackground = true)
@Composable
fun PreviewProfileScreen() {
    ProfileScreen()
}
