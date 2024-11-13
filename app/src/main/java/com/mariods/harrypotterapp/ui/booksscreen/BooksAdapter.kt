package com.mariods.harrypotterapp.ui.booksscreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mariods.harrypotterapp.R
import com.mariods.harrypotterapp.domain.models.BooksList

class BooksAdapter(private val listBooks: List<BooksList>) : RecyclerView.Adapter<BooksViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return BooksViewHolder(layoutInflater.inflate(R.layout.item_book, parent, false))
    }

    override fun getItemCount(): Int = listBooks.size

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {

        val item = listBooks[position]
        holder.render(item)

    }
}