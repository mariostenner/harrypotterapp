package com.mariods.harrypotterapp.data

import com.mariods.harrypotterapp.data.network.BooksService
import com.mariods.harrypotterapp.domain.model.BooksList
import com.mariods.harrypotterapp.domain.model.toDomain

import javax.inject.Inject

class Repository @Inject constructor(private val booksService: BooksService) {

    suspend fun getAllBooksFromApi(): List<BooksList> {
        val response = booksService.getAllBooks()
        return response.data.map {
            it.toDomain()
        }
    }

}