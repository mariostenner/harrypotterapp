package com.mariods.harrypotterapp.ui.booksscreen

import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.size.Scale
import com.mariods.harrypotterapp.databinding.ItemBookBinding
import com.mariods.harrypotterapp.domain.model.BooksList


class BooksViewHolder(private val binding: ItemBookBinding) :
    RecyclerView.ViewHolder(binding.root) {

    fun renderBinding(books: BooksList) {
        binding.tvBookName.text = books.booksAttributes.title
        binding.tvBookPages.text = "${books.booksAttributes.pages.toString()} pages"
        binding.ivBookCover.load(books.booksAttributes.cover){
            scale(Scale.FILL)
        }
    }

}