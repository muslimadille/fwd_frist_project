package com.udacity.shoestore.viewModel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.udacity.shoestore.models.Shoe

class MainViewModel : ViewModel() {
    private var shoeListLive: MutableLiveData<MutableList<Shoe>> = MutableLiveData()

    fun setList(){
        for (I in 0..5){
            shoeListLive.value?.add(Shoe(
                "name",
                1.3,
                "company",
                "description"
            ))
        }
    }


}