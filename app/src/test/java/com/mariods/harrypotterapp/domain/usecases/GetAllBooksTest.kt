package com.mariods.harrypotterapp.domain.usecases

import com.mariods.harrypotterapp.data.Repository
import com.mariods.harrypotterapp.domain.model.BooksAttributes
import com.mariods.harrypotterapp.domain.model.BooksList
import dagger.hilt.android.testing.HiltAndroidRule
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.MockK
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import javax.inject.Inject

class GetAllBooksTest {

    //@Inject
    @RelaxedMockK
    private lateinit var repository: Repository
    lateinit var getAllBooks: GetAllBooks


    @Before
    fun setup() {
        //hiltRule.inject()
        MockKAnnotations.init(this)
        getAllBooks = GetAllBooks(repository)

    }

    //@get:Rule
    //var hiltRule = HiltAndroidRule(this)

    @Test
    fun whenTheApiReturnSomethingThenGetValuesFromApi() = runBlocking {

        //Given

        val listBooksDummy: List<BooksList> =
            listOf(
                BooksList(
                    id = "1",
                    BooksAttributes(
                        "Harry Potter and the big bug",
                        "JMD Stenner",
                        "https://www.image.com",
                        777,
                        "Today",
                        "This is the story of a big bug in my code"
                    )
                )
            )
        coEvery { repository.getAllBooksFromApi() } returns listBooksDummy

        //When
        val response = getAllBooks()

        //Then
        assert(listBooksDummy == response)

    }

}