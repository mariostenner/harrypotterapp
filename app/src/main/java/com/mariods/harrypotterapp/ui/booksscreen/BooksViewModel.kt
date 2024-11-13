package com.mariods.harrypotterapp.ui.booksscreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mariods.harrypotterapp.domain.models.BooksList
import com.mariods.harrypotterapp.domain.usecases.GetAllBooks
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class BooksViewModel @Inject constructor(getAllBooks: GetAllBooks) : ViewModel() {

    private val _dataTest = MutableLiveData<List<BooksList>>()
    val dataTest: LiveData<List<BooksList>> get() = _dataTest


    fun getBooks() {


    }

}