package com.mariods.harrypotterapp.ui.mainscreen

import androidx.lifecycle.ViewModel
import com.mariods.harrypotterapp.domain.usecases.GetAllBooks
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val getAllBooks: GetAllBooks) : ViewModel() {


}