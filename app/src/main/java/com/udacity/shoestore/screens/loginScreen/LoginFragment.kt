package com.udacity.shoestore.screens.loginScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentLoginBinding
import com.udacity.shoestore.viewModel.MainViewModel


class LoginFragment : Fragment(R.layout.fragment_login) {

    private  var fragmentLoginBinding:FragmentLoginBinding?=null
    private val sharedViewModel: MainViewModel by activityViewModels()


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val binding=FragmentLoginBinding.bind(view)
        binding.LoginBtn.setOnClickListener {
            it.findNavController().navigate(R.id.action_loginFragment_to_onboardingFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        fragmentLoginBinding=null
    }
}