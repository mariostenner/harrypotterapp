package com.mariods.harrypotterapp.ui.splashscreen

import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.mariods.harrypotterapp.R
import com.mariods.harrypotterapp.ui.theme.YellowHP
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import androidx.compose.animation.core.Animatable

@Composable
fun SplashScreen(navigateToHome: ()-> Unit) {
    SplashScreenPreview()

    val fadeAnim = remember {
        Animatable(0f)
    }
    val coroutineScope = rememberCoroutineScope()
    LaunchedEffect(Unit) {
        coroutineScope.launch {
            fadeAnim.animateTo(1f, animationSpec = tween(1000))
            delay(1000)
            navigateToHome()
        }
    }

}

@Preview
@Composable
fun SplashScreenPreview() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.Black),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(R.drawable.howarts_logo),
            contentDescription = "BoxScore",
            modifier = Modifier.size(400.dp)
        )

        Text(
            text = "Harry Potter",
            color = YellowHP,
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            fontFamily = FontFamily.Cursive
        )
    }
}