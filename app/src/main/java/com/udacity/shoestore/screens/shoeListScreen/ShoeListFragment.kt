package com.udacity.shoestore.screens.shoeListScreen

import android.annotation.SuppressLint
import android.os.Bundle
import android.provider.CalendarContract.Colors
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.navigation.findNavController
import com.udacity.shoestore.R
import com.udacity.shoestore.databinding.FragmentShoeListBinding
import com.udacity.shoestore.databinding.ShoeListItimeLayBinding
import com.udacity.shoestore.models.Shoe
import com.udacity.shoestore.viewModel.MainViewModel


class ShoeListFragment : Fragment(R.layout.fragment_shoe_list) {
    private  var fragmentShoeListBinding:FragmentShoeListBinding ?=null

    private val sharedViewModel: MainViewModel by activityViewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }


    @SuppressLint("ResourceType")
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        createItem()
        super.onViewCreated(view, savedInstanceState)
        fragmentShoeListBinding= FragmentShoeListBinding.bind(view)
        fragmentShoeListBinding?.addShoeBtn?.setOnClickListener{
            //it.findNavController().navigate(R.id.action_shoeListFragment_to_shoeDetailsFragment)
            createItem()
        }


    }

   fun createItem(){

       val lay:LinearLayout=LinearLayout(context)
       val title:TextView=TextView(context)
       title.text="hhgggg"
       lay.addView(title)
       lay.orientation=LinearLayout.VERTICAL
       fragmentShoeListBinding?.shoeListLay?.addView(lay)


   }

    override fun onDestroyView() {
        super.onDestroyView()
        fragmentShoeListBinding=null
    }
}