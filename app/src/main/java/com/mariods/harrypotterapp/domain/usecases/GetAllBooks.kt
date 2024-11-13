package com.mariods.harrypotterapp.domain.usecases

import com.mariods.harrypotterapp.data.Repository
import com.mariods.harrypotterapp.data.network.model.BooksModel
import javax.inject.Inject

class GetAllBooks @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke() : BooksModel {
        val allBooks = repository.getAllBooksFromApi()
        return allBooks
    }
}