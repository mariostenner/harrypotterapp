package com.mariods.harrypotterapp.domain.model

data class CharactersModel(
    val data: List<CharactersList>
)

data class CharactersList(
    val id: String,
    val charactersAttributes: CharactersAttributes
)

data class CharactersAttributes(
    val chName: String,
    val chBlood: String,
    val chGender: String,
    val chImage: String,
    val chHouse: String,
    val chNationality: String,
    val chPatronus: String,
    val chWiki: String

)


fun com.mariods.harrypotterapp.data.network.model.CharactersAttributes.toDomain() =
    CharactersAttributes(
        chName = chName ?: "",
        chBlood = chBlood ?: "",
        chGender = chGender ?: "",
        chImage = chImage ?: "",
        chHouse = chHouse ?: "",
        chNationality = chNationality ?: "",
        chPatronus = chPatronus ?: "",
        chWiki = chWiki ?: ""
    )


fun com.mariods.harrypotterapp.data.network.model.CharactersList.toDomain() =
    CharactersList(id, charactersAttributes.toDomain())