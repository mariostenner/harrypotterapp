package com.mariods.harrypotterapp.data.network.model

import com.google.gson.annotations.SerializedName


data class CharactersModel(
    @SerializedName("data") val data: List<CharactersList>
)

data class CharactersList(
    @SerializedName("id") val id: String,
    @SerializedName("attributes") val charactersAttributes: CharactersAttributes
)

data class CharactersAttributes(
    @SerializedName("name") val chName: String,
    @SerializedName("blood_status") val chBlood: String,
    @SerializedName("gender") val chGender: String,
    @SerializedName("image") val chImage: String,
    @SerializedName("house") val chHouse: String,
    @SerializedName("nationality") val chNationality: String,
    @SerializedName("patronus") val chPatronus: String,
    @SerializedName("wiki") val chWiki: String

)