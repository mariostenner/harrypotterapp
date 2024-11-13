package com.mariods.harrypotterapp.ui.booksscreen

import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mariods.harrypotterapp.R
import com.mariods.harrypotterapp.databinding.ItemBookBinding
import com.mariods.harrypotterapp.domain.models.BooksList


class BooksViewHolder(private val binding: ItemBookBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun renderBinding(books: BooksList) {
        binding.tvBookName.text = books.attributes.title
        binding.tvBookPages.text = books.attributes.pages.toString()
    }

}