package com.mariods.harrypotterapp.domain.usecases

import com.mariods.harrypotterapp.data.Repository
import com.mariods.harrypotterapp.domain.model.BooksList
import com.mariods.harrypotterapp.domain.model.toDomain
import javax.inject.Inject

class GetAllBooks @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke() : List<BooksList> {
        val allBooks = repository.getAllBooksFromApi()
        return allBooks
    }
}