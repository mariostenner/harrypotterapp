package com.mariods.harrypotterapp.data

import com.mariods.harrypotterapp.data.network.HarryPotterService

import com.mariods.harrypotterapp.domain.model.BooksList
import com.mariods.harrypotterapp.domain.model.CharactersAttributes
import com.mariods.harrypotterapp.domain.model.CharactersList
import com.mariods.harrypotterapp.domain.model.toDomain

import javax.inject.Inject

class Repository @Inject constructor(private val harryPotterService: HarryPotterService) {

    suspend fun getAllBooksFromApi(): List<BooksList> {
        val response = harryPotterService.getAllBooks()
        return response.data.map {
            it.toDomain()
        }
    }

    suspend fun getAllCharactersFromApi(): List<CharactersList>{
        val response = harryPotterService.getAllCharacters()
        return response.data.map {
            it.toDomain()
        }
    }

}