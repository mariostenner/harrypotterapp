package com.mariods.harrypotterapp.ui.navigation

import com.mariods.harrypotterapp.R

sealed class BottomNavScreen(val title: String, val icon: Int){
    data object Books: BottomNavScreen("Books", R.drawable.ic_launcher_foreground)
    data object Characters: BottomNavScreen("Characters", R.drawable.ic_launcher_foreground)
    data object Movies: BottomNavScreen("Movies", R.drawable.ic_launcher_foreground)
}


var itemsBottom = listOf(
    BottomNavScreen.Books,
    BottomNavScreen.Characters,
    BottomNavScreen.Movies
)