package com.mariods.harrypotterapp.ui.mainscreen

import android.content.Context
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
import androidx.compose.ui.viewinterop.AndroidView
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import androidx.hilt.navigation.compose.hiltViewModel
import com.mariods.harrypotterapp.R
import com.mariods.harrypotterapp.ui.booksscreen.BooksFragment
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
        Box(modifier = Modifier.fillMaxSize()){
            val context = LocalContext.current
            when(selectedScreen){
                BottomNavScreen.Books -> {
                    //BooksFragment()
                    ShowFragment(context, BooksFragment::class.java)

                }
                BottomNavScreen.Characters -> CharactersScreen()
                BottomNavScreen.Movies -> MoviesScreen()
            }
        }
    }






}

@Composable
fun ShowFragment(context: Context, booksFragment: Class<BooksFragment>) {

    val fragmentActivity = context as FragmentActivity
    AndroidView(factory = {
        FragmentContainerView(it).apply {
            id = R.id.fragment_books_container
            fragmentActivity.supportFragmentManager.commit {
                replace(id, booksFragment.newInstance())
            }
        }
    },
        modifier = Modifier.fillMaxSize()
        )

}
