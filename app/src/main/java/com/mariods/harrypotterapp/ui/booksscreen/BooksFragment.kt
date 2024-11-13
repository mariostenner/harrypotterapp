package com.mariods.harrypotterapp.ui.booksscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView.HORIZONTAL
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import androidx.recyclerview.widget.RecyclerView.VERTICAL
import com.mariods.harrypotterapp.R
import com.mariods.harrypotterapp.databinding.FragmentBooksBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class BooksFragment : Fragment(R.layout.fragment_books) {

    private var _binding: FragmentBooksBinding? = null
    private val binding get() = _binding!!
    private val booksViewModel: BooksViewModel by viewModels()
    private lateinit var adapter : BooksAdapter


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        _binding = FragmentBooksBinding.bind(view)

        adapter = BooksAdapter()
        binding.rvBooks.layoutManager = LinearLayoutManager(requireContext(), HORIZONTAL, false)
        binding.rvBooks.adapter = adapter

        booksViewModel.booksItems.observe(viewLifecycleOwner){
            booksItem ->
            adapter.setItems(booksItem)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}