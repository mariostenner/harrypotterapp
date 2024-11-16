package com.mariods.harrypotterapp.ui.mainscreen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.hilt.navigation.compose.hiltViewModel
import com.mariods.harrypotterapp.ui.booksscreen.BooksFragment
import com.mariods.harrypotterapp.ui.booksscreen.BooksFragmentScreen
import com.mariods.harrypotterapp.ui.charactersscreen.CharactersScreen
import com.mariods.harrypotterapp.ui.moviesscreen.MoviesScreen
import com.mariods.harrypotterapp.ui.navigation.BottomNavScreen
import com.mariods.harrypotterapp.ui.navigation.BottomNavigationWrapper


@SuppressLint(
    "UnusedMaterial3ScaffoldPaddingParameter", "UnusedContentLambdaTargetStateParameter",
    "UnusedCrossfadeTargetStateParameter"
)
@Composable
fun MainScreen(viewModel: MainViewModel = hiltViewModel()) {

    val selectedScreen by viewModel.selectedScreen

    Scaffold(
        bottomBar = {
            BottomNavigationWrapper(selectedScreen, viewModel)
            //AnimatedBottomNavBar()
        }
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            val context = LocalContext.current
            when (selectedScreen) {
                BottomNavScreen.Characters -> CharactersScreen()
                BottomNavScreen.Books -> {
                    BooksFragmentScreen(context, BooksFragment::class.java)
                }
                BottomNavScreen.Movies -> MoviesScreen()
            }
        }
    }


}


