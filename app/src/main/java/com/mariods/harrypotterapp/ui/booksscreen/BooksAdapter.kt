package com.mariods.harrypotterapp.ui.booksscreen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.mariods.harrypotterapp.R
import com.mariods.harrypotterapp.databinding.ItemBookBinding
import com.mariods.harrypotterapp.domain.models.BooksList

class BooksAdapter() : RecyclerView.Adapter<BooksViewHolder>() {

    private val listBooks = mutableListOf<BooksList>()

    fun setItems(newItems: List<BooksList>){

        listBooks.clear()
        listBooks.addAll(newItems)
        notifyDataSetChanged()

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BooksViewHolder {
        val binding = ItemBookBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return BooksViewHolder(binding)
    }

    override fun getItemCount(): Int = listBooks.size

    override fun onBindViewHolder(holder: BooksViewHolder, position: Int) {

        holder.renderBinding(listBooks[position])

    }

}