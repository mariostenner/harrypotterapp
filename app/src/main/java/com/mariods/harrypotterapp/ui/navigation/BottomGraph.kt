package com.mariods.harrypotterapp.ui.navigation

import androidx.compose.ui.res.integerResource
import com.mariods.harrypotterapp.R

sealed class BottomNavScreen(val title: String, val icon: Int){
    data object Characters: BottomNavScreen("Characters", R.drawable.icons_mcgonagall )
    data object Books: BottomNavScreen("Books", R.drawable.icons_144)
    data object Movies: BottomNavScreen("Movies", R.drawable.icon_howarts_bar)
}


var itemsBottom = listOf(
    BottomNavScreen.Characters,
    BottomNavScreen.Books,
    BottomNavScreen.Movies
)