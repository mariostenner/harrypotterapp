package com.mariods.harrypotterapp.ui.authscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.Coil
import com.mariods.harrypotterapp.R
import com.mariods.harrypotterapp.ui.theme.GrayHP
import com.mariods.harrypotterapp.ui.theme.YellowHP

@Composable
fun AuthScreen() {

    LoginScreen()


}

@Preview
@Composable
fun LoginScreen() {

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(YellowHP)
            .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(
            textAlign = TextAlign.Center,
            text = "Bienvenido a Hogwarts\nIngresa tus datos para acceder",
            fontSize = 25.sp
        )
        Spacer(modifier = Modifier.weight(1f))
        Image(painter = painterResource(R.drawable.image_hat), contentDescription = "")
        Spacer(modifier = Modifier.weight(1f))
        TextField(
            value = email,
            label = { Text(text = "Usuario") },
            onValueChange = { email = it },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = YellowHP,
                unfocusedContainerColor = YellowHP,
                focusedTextColor = Color.Black,
                unfocusedTextColor = GrayHP

            )
        )
        TextField(
            value = password,
            label = { Text(text = "Contraseña") },
            onValueChange = { password = it },
            modifier = Modifier.fillMaxWidth(),
            colors = TextFieldDefaults.colors(
                focusedContainerColor = YellowHP,
                unfocusedContainerColor = YellowHP,
                focusedTextColor = Color.Black,
                unfocusedTextColor = GrayHP

            )
        )
        Spacer(modifier = Modifier.weight(1f))
    }

}

@Preview
@Composable
fun SignupScreen() {

}