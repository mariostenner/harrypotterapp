package com.mariods.harrypotterapp.domain.usecases

import com.mariods.harrypotterapp.data.Repository
import com.mariods.harrypotterapp.domain.model.CharactersAttributes
import com.mariods.harrypotterapp.domain.model.CharactersList
import dagger.hilt.android.testing.HiltAndroidTest
import io.mockk.MockKAnnotations
import io.mockk.coEvery
import io.mockk.impl.annotations.RelaxedMockK
import kotlinx.coroutines.runBlocking
import org.junit.Before
import org.junit.Test

@HiltAndroidTest
class GetAllCharactersTest {

    //@get:Rule
    //val hiltRule = HiltAndroidRule(this)

    //@Inject
    @RelaxedMockK
    lateinit var repository: Repository
    lateinit var getAllCharacters: GetAllCharacters

    @Before
    fun setUp() {
        MockKAnnotations.init(this)
        getAllCharacters = GetAllCharacters(repository)
        //hiltRule.inject()
    }

    @Test
    fun whenTheApiReturnSomethingThenGetValuesFromApi() = runBlocking {

        val listCharactersDummy: List<CharactersList> =
            listOf(
                CharactersList(
                    id = "1",
                    CharactersAttributes(
                        "Harry Potter and the big bug",
                        "JMD Stenner",
                        "https://www.image.com",
                        "777",
                        "Today",
                        "This is the story of a big bug in my code",
                        "",
                        ""
                    )
                )
            )

        coEvery { repository.getAllCharactersFromApi() } returns listCharactersDummy

        val response = getAllCharacters()

        assert(listCharactersDummy == response)


    }

}