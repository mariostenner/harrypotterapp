package com.mariods.harrypotterapp.ui

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.runtime.Composable
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
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

    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        auth = Firebase.auth

        setContent {
            NavigationWrapper()
            //throw RuntimeException ("Test Crash")

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

//    public override fun onStart() {
//        super.onStart()
//
//        val currentUser = auth.currentUser
//
//        if(currentUser != null){
//            reload()
//        }
//
//    }
}