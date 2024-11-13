package com.mariods.harrypotterapp.ui.booksscreen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mariods.harrypotterapp.domain.model.Attributes
import com.mariods.harrypotterapp.domain.model.BooksList
import com.mariods.harrypotterapp.domain.usecases.GetAllBooks
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class BooksViewModel @Inject constructor(private val getAllBooks: GetAllBooks) : ViewModel() {

    private val _booksItems = MutableLiveData<List<BooksList>>()
    val booksItems: LiveData<List<BooksList>> get() = _booksItems

    init {
        getBooks()
    }

    private fun getBooks() {

        viewModelScope.launch {
            _booksItems.value = getAllBooks()
        }

        _booksItems.value = listOf(
            BooksList(
                "2",
                Attributes(
                    "Harry Potter and the secret of testing",
                    "Mario DS",
                    "https://avatars.githubusercontent.com/u/32556277?v=4",
                    123,
                    "today",
                    "This is about of the secret of testing"
                )
            ),
            BooksList(
                "2",
                Attributes(
                    "Harry Potter and the source legacy code",
                    "Mario DS",
                    "https://avatars.githubusercontent.com/u/32556277?v=4",
                    40,
                    "yesterday",
                    "This is about of the source of code"
                )
            )
        )

    }

}