package com.mariods.harrypotterapp.ui.charactersscreen

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import coil.Coil
import com.mariods.harrypotterapp.domain.model.CharactersAttributes

@Composable
fun CharactersItem(
    data: CharactersAttributes,
    modifier: Modifier = Modifier
) {

    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier.fillMaxSize()
            .padding(10.dp)
    ) {
       // Coil.imageLoader(this,)
    }

}