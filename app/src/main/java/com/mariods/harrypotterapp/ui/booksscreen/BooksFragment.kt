package com.mariods.harrypotterapp.ui.booksscreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import com.mariods.harrypotterapp.R
import com.mariods.harrypotterapp.databinding.FragmentBooksBinding
import dagger.hilt.android.AndroidEntryPoint


@AndroidEntryPoint
class BooksFragment : Fragment(R.layout.fragment_books) {

    private var _binding: FragmentBooksBinding? = null
    private val binding get() = _binding!!
    private lateinit var adapter : BooksAdapter

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        _binding = FragmentBooksBinding.bind(view)



    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}