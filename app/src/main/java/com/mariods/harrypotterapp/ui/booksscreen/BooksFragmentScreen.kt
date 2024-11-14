package com.mariods.harrypotterapp.ui.booksscreen

import android.content.Context
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.fragment.app.FragmentActivity
import androidx.fragment.app.FragmentContainerView
import androidx.fragment.app.commit
import com.mariods.harrypotterapp.R

@Composable
fun BooksFragmentScreen(context: Context, booksFragment: Class<BooksFragment>) {

    val fragmentActivity = context as FragmentActivity
    AndroidView(
        factory = {
            FragmentContainerView(it).apply {
                id = R.id.fragment_books_container
                fragmentActivity.supportFragmentManager.commit {
                    replace(id, booksFragment.newInstance())
                }
            }
        },
        modifier = Modifier.fillMaxSize()
    )

}