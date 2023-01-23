package com.udacity.shoestore.screens.instructionsScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.View
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentInstructionsBinding
import com.udacity.shoestore.viewModel.MainViewModel

class InstructionsFragment : Fragment(R.layout.fragment_instructions) {


    private  var fragmentInstructionsBinding: FragmentInstructionsBinding?=null
    private val sharedViewModel: MainViewModel by activityViewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentInstructionsBinding= FragmentInstructionsBinding.bind(view)
        fragmentInstructionsBinding?.getItBtn?.setOnClickListener {
            it.findNavController().navigate(R.id.action_instructionsFragment_to_shoeListFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        fragmentInstructionsBinding=null
    }


}