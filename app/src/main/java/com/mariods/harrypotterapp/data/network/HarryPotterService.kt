package com.mariods.harrypotterapp.data.network

import com.mariods.harrypotterapp.data.network.model.BooksModel
import com.mariods.harrypotterapp.data.network.model.CharactersModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class HarryPotterService @Inject constructor(
    private val harryPotterApiClient: HarryPotterApiClient
) {


    suspend fun getAllBooks(): BooksModel {
        return withContext(Dispatchers.IO) {
            val response = harryPotterApiClient.getAllBooks()
            response.body() ?: BooksModel(emptyList())

        }
    }

    suspend fun getAllCharacters(): CharactersModel {
        return withContext(Dispatchers.IO) {
            val response = harryPotterApiClient.getAllCharacters()
            response.body() ?: CharactersModel(emptyList())
        }
    }

}