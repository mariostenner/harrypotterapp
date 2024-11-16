package com.mariods.harrypotterapp.ui.navigation

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemColors
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.mariods.harrypotterapp.ui.mainscreen.MainViewModel
import com.mariods.harrypotterapp.ui.theme.BrownHP
import com.mariods.harrypotterapp.ui.theme.RedHP
import com.mariods.harrypotterapp.ui.theme.WhiteHP
import com.mariods.harrypotterapp.ui.theme.YellowHP

@Composable
fun  BottomNavigationWrapper(selectedScreen: BottomNavScreen, viewModel: MainViewModel) {

    NavigationBar(containerColor = WhiteHP) {
        itemsBottom.forEach { screen ->
            NavigationBarItem(
                selected = selectedScreen == screen,
                onClick = { viewModel.selectScreen(screen) },
                icon = {
                    Icon(
                        painter = painterResource(id = screen.icon),
                        contentDescription = screen.title,
                    )
                },
                colors = NavigationBarItemColors(
                    selectedIconColor = YellowHP,
                    selectedTextColor = BrownHP,
                    selectedIndicatorColor = RedHP,
                    unselectedIconColor = RedHP,
                    unselectedTextColor = Color.Green,
                    disabledIconColor = Color.Blue,
                    disabledTextColor = Color.Green
                ),
                modifier = Modifier
                    .clip(RoundedCornerShape(2.dp)),
                //.background(WhiteHP),
                alwaysShowLabel = true,
                label = { screen.title }
            )
        }
    }

}