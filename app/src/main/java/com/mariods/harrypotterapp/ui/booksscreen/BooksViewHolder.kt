package com.mariods.harrypotterapp.ui.booksscreen

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mariods.harrypotterapp.R
import com.mariods.harrypotterapp.domain.models.BooksList


class BooksViewHolder(view : View) : RecyclerView.ViewHolder(view)  {

    val tvBookName = view.findViewById<TextView>(R.id.tv_book_name)
    val tvBookPages = view.findViewById<TextView>(R.id.tv_book_pages)


    fun render(books: BooksList){
        tvBookName.text = books.attributes.title
        tvBookPages.text = books.attributes.pages.toString()
    }

}