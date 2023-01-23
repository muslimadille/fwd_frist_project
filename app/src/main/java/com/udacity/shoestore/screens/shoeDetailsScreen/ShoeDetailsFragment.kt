package com.udacity.shoestore.screens.shoeDetailsScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding
import com.udacity.shoestore.databinding.FragmentShoeDetailsBinding
import com.udacity.shoestore.viewModel.MainViewModel


class ShoeDetailsFragment : Fragment(R.layout.fragment_shoe_details) {
    private  var shoeDetailsFragment: ShoeDetailsFragment?=null
    private val sharedViewModel: MainViewModel by activityViewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding= FragmentShoeDetailsBinding.bind(view)

    }

    override fun onDestroyView() {
        super.onDestroyView()
        shoeDetailsFragment=null
    }
}