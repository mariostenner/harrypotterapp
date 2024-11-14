package com.mariods.harrypotterapp.domain.usecases

import com.mariods.harrypotterapp.data.Repository
import com.mariods.harrypotterapp.domain.model.CharactersList
import javax.inject.Inject

class GetAllCharacters @Inject constructor(private val repository: Repository) {

    suspend operator fun invoke(): List<CharactersList> {
        val response = repository.getAllCharactersFromApi()
        return response
    }

}