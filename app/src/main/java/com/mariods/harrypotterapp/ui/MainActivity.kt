package com.mariods.harrypotterapp.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import com.mariods.harrypotterapp.R
import com.mariods.harrypotterapp.databinding.ActivityMainBinding
import com.mariods.harrypotterapp.ui.booksscreen.BooksFragment
import com.mariods.harrypotterapp.ui.mainscreen.MainViewModel
import com.mariods.harrypotterapp.ui.navigation.NavigationWrapper
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity(R.layout.activity_main) {

    private val mainViewModel: MainViewModel by viewModels()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            NavigationWrapper()
        }

        //binding = ActivityMainBinding.inflate(layoutInflater)
        //setContentView(binding.root)

//        if (savedInstanceState == null) {
//            supportFragmentManager
//                .beginTransaction()
//                .replace(binding.fragmentMainContainer.id, BooksFragment())
//                .commit()
//        }

    }

}