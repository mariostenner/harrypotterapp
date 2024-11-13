package com.mariods.harrypotterapp.data

import com.mariods.harrypotterapp.data.network.BooksService
import com.mariods.harrypotterapp.data.network.model.BooksModel
import javax.inject.Inject

class Repository @Inject constructor(private val booksService: BooksService) {

    suspend fun getAllBooksFromApi(): BooksModel{
        return booksService.getAllBooks()
    }

}