package com.mariods.harrypotterapp.domain.usecases

import com.mariods.harrypotterapp.data.Repository
import io.mockk.impl.annotations.RelaxedMockK
import org.junit.Before
import org.junit.jupiter.api.Assertions.*

class GetAllBooksTest{

    @RelaxedMockK
    private lateinit var repository: Repository

    lateinit var getAllBooks: GetAllBooks

    @Before
    fun onBefore(){
       // MockAn
    }

}