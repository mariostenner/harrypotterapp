package com.mariods.harrypotterapp.ui.mainscreen

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.vectorResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.mariods.harrypotterapp.ui.booksscreen.BooksFragment
import com.mariods.harrypotterapp.ui.booksscreen.BooksFragmentScreen
import com.mariods.harrypotterapp.ui.charactersscreen.CharactersScreen
import com.mariods.harrypotterapp.ui.moviesscreen.MoviesScreen
import com.mariods.harrypotterapp.ui.navigation.BottomNavScreen
import com.mariods.harrypotterapp.ui.navigation.itemsBottom


@Composable
fun MainScreen(viewModel: MainViewModel = hiltViewModel()) {

    val selectedScreen by viewModel.selectedScreen

    Scaffold(
        bottomBar = {
            NavigationBar {
                itemsBottom.forEach { screen ->
                    NavigationBarItem(
                        selected = selectedScreen == screen,
                        onClick = { viewModel.selectScreen(screen) },
                        icon = {
                            Icon(
                                ImageVector.vectorResource(id = screen.icon),
                                contentDescription = screen.title
                            )
                        })
                }
            }
        }
    ) {
        Box(modifier = Modifier.fillMaxSize()) {
            val context = LocalContext.current
            when (selectedScreen) {
                BottomNavScreen.Books -> {
                    //BooksFragment()
                    BooksFragmentScreen(context, BooksFragment::class.java)
                }
                BottomNavScreen.Characters -> CharactersScreen()
                BottomNavScreen.Movies -> MoviesScreen()
            }
        }
    }


}


