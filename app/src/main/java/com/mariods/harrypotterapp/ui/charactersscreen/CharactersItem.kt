package com.mariods.harrypotterapp.ui.charactersscreen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.mariods.harrypotterapp.R
import com.mariods.harrypotterapp.domain.model.CharactersAttributes
import com.mariods.harrypotterapp.ui.theme.GrayHP
import com.mariods.harrypotterapp.ui.theme.WhiteHP
import com.mariods.harrypotterapp.ui.theme.YellowHP

@Composable
fun CharactersItem(
    data: CharactersAttributes,
    modifier: Modifier = Modifier
) {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
        modifier = Modifier
            .fillMaxSize()
            .padding(1.dp,20.dp)
            .background(Color.Black, RoundedCornerShape(16.dp))

    ) {
        AsyncImage(
            model = data.chImage,
            contentDescription = "Image",
            modifier = Modifier
                .size(100.dp)
                .padding(4.dp)
                .clip(CircleShape)
                .background(color = Color.Black, shape = CircleShape),
            contentScale = ContentScale.Crop,
            placeholder = painterResource(id = R.drawable.howarts_logo),
            error = painterResource(R.drawable.howarts_logo)
        )
        Column {
            Text(
                color = YellowHP,

                text = data.chName
            )
//            Text(text = data.chGender)
//            Text(text = data.chHouse)
//            Text(text = data.chNationality)
        }

    }

}