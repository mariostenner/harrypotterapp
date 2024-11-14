package com.mariods.harrypotterapp.data.network

import com.mariods.harrypotterapp.data.network.model.BooksModel
import com.mariods.harrypotterapp.data.network.model.CharactersModel
import retrofit2.Response
import retrofit2.http.GET

interface HarryPotterApiClient {
    @GET("v1/books")
    suspend fun getAllBooks(): Response<BooksModel>

    @GET("v1/characters")
    suspend fun getAllCharacters(): Response<CharactersModel>

}