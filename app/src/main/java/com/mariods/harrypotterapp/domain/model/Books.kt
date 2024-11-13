package com.mariods.harrypotterapp.domain.model


data class Books(
    val data: List<BooksList>
)

data class BooksList(
    val id: String,
    val attributes: Attributes
)

data class Attributes(
    val title: String,
    val author: String,
    val cover: String,
    val pages: Int,
    val releaseDate: String,
    val summary: String
)

fun com.mariods.harrypotterapp.data.network.model.Attributes.toDomain() =
    Attributes(title, author, cover, pages, releaseDate, summary)

fun com.mariods.harrypotterapp.data.network.model.BooksList.toDomain() = BooksList(
    id,
    attributes.toDomain()
)