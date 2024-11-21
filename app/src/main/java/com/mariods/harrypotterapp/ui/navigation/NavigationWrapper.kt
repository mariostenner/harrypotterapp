package com.mariods.harrypotterapp.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.mariods.harrypotterapp.ui.authscreen.AuthScreen
import com.mariods.harrypotterapp.ui.booksscreen.BooksFragment
import com.mariods.harrypotterapp.ui.mainscreen.MainScreen
import com.mariods.harrypotterapp.ui.splashscreen.SplashScreen

@Composable
fun NavigationWrapper() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = Splash){
        composable<Splash> {
            SplashScreen{
                navController.navigate(Auth){
                    popUpTo<Splash>{inclusive = true}
                }
            }
        }
//        composable<Main> {
//            MainScreen()
//        }
        composable<Auth> {
            AuthScreen()
        }
    }

}