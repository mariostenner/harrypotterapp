package com.mariods.harrypotterapp.ui.charactersscreen

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.mariods.harrypotterapp.ui.theme.HarryPotterAppTheme

@Preview
@Composable
fun CharactersScreen(){
    Box(modifier = Modifier.fillMaxSize().background(Color.Red)) {
       Text(text = "Characters view")
    }
}