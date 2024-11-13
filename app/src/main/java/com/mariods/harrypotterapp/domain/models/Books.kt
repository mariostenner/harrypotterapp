package com.mariods.harrypotterapp.domain.models

import com.mariods.harrypotterapp.data.network.model.BooksList
import com.mariods.harrypotterapp.data.network.model.BooksModel


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


fun BooksModel.toDomain() = Books(data)
