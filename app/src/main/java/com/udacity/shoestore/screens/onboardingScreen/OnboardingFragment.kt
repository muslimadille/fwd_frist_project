package com.udacity.shoestore.screens.onboardingScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding
import com.udacity.shoestore.databinding.FragmentOnboardingBinding
import com.udacity.shoestore.viewModel.MainViewModel


class OnboardingFragment : Fragment(R.layout.fragment_onboarding) {
    private  var fragmentOnboardingBinding: FragmentOnboardingBinding?=null
    private val sharedViewModel: MainViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        fragmentOnboardingBinding= FragmentOnboardingBinding.bind(view)
        fragmentOnboardingBinding?.startBtn?.setOnClickListener {
            it.findNavController().navigate(R.id.action_onboardingFragment_to_instructionsFragment)
        }


    }

    override fun onDestroyView() {
        super.onDestroyView()
        fragmentOnboardingBinding=null
    }
}