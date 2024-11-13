package com.mariods.harrypotterapp.data.network

import com.mariods.harrypotterapp.data.network.model.BooksModel
import retrofit2.Response
import retrofit2.http.GET

interface BooksApiClient {
    @GET("v1/books")
    suspend fun getAllBooks(): Response<BooksModel>
}