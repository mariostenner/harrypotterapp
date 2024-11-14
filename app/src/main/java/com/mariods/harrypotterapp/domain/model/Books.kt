package com.mariods.harrypotterapp.domain.model


data class Books(
    val data: List<BooksList>
)

data class BooksList(
    val id: String,
    val booksAttributes: BooksAttributes
)

data class BooksAttributes(
    val title: String,
    val author: String,
    val cover: String,
    val pages: Int,
    val releaseDate: String,
    val summary: String
)

fun com.mariods.harrypotterapp.data.network.model.BooksAttributes.toDomain() =
    BooksAttributes(bkTitle, bkAuthor, bkCover, bkPages, bkReleaseDate, bkSummary)

fun com.mariods.harrypotterapp.data.network.model.BooksList.toDomain() = BooksList(
    id,
    booksAttributes.toDomain()
)

