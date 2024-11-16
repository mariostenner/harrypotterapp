package com.mariods.harrypotterapp.ui.charactersscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyGridScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun CharactersScreen(charactersViewModel: CharactersViewModel = hiltViewModel()) {

    val charactersList by charactersViewModel.charactersList.observeAsState(emptyList())
    charactersViewModel.onCreate()

    Box(modifier = Modifier.background(Color.Black)) {

        LazyVerticalGrid(
            columns = GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            content = {
                items(charactersList) { item ->
                    CharactersItem(item.charactersAttributes, Modifier)
                    // Text(text = item.charactersAttributes.chName)
                    Spacer(modifier = Modifier.size(8.dp))
                }
            }
        )

    }


}

