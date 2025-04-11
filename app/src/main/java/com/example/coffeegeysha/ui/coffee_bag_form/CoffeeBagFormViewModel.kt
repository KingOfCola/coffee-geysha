package com.example.coffeegeysha.ui.coffee_bag_form

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CoffeeBagFormViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Pouet"
    }
    val text: LiveData<String> = _text
}