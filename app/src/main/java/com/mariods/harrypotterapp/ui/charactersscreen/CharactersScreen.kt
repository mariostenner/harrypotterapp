package com.mariods.harrypotterapp.ui.charactersscreen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun CharactersScreen(charactersViewModel: CharactersViewModel = hiltViewModel()) {

    val charactersList by charactersViewModel.charactersList.observeAsState(emptyList())
    charactersViewModel.onCreate()


    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .padding(8.dp)
    ) {

        items(charactersList) { item ->
            //CharactersItem(item, Modifier)
            Text(text = item.charactersAttributes.chName)
            Spacer(modifier = Modifier.size(10.dp))
        }

    }

}

