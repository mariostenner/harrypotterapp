package com.mariods.harrypotterapp.data.network

import com.mariods.harrypotterapp.data.network.model.BooksModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class BooksService @Inject constructor(private val booksApiClient: BooksApiClient) {


    suspend fun getAllBooks(): BooksModel{
        return withContext(Dispatchers.IO){
            val response = booksApiClient.getAllBooks()
            response.body()?: BooksModel(emptyList())

        }
    }

}