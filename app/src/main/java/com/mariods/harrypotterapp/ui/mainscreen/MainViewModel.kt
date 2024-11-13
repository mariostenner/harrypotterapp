package com.mariods.harrypotterapp.ui.mainscreen

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import com.mariods.harrypotterapp.domain.usecases.GetAllBooks
import com.mariods.harrypotterapp.ui.navigation.BottomNavScreen
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor() : ViewModel() {

    private val _selectedScreen = mutableStateOf<BottomNavScreen>(BottomNavScreen.Books)
    val selectedScreen : State<BottomNavScreen> = _selectedScreen

    fun selectScreen(screen: BottomNavScreen){
        _selectedScreen.value = screen
    }

}