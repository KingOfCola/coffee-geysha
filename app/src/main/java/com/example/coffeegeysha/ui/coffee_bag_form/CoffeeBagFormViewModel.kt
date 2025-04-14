package com.example.coffeegeysha.ui.coffee_bag_form

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import timber.log.Timber

class CoffeeBagFormViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Pouet"
    }
    val text: LiveData<String> = _text

    val brand = MutableLiveData<String>()
    val name = MutableLiveData<String>()
    val origin = MutableLiveData<String>()
    val flavors = MutableLiveData<String>()

    val message = MutableLiveData<String>().apply { value = "Coffee Coffee." }

    fun updateMessageRegex() {
        val flavorsMatches = FLAVOR_REGEX.findAll(flavors.value?:"")
        val flavorsCount = flavorsMatches.count()
        message.value = "This coffee contains $flavorsCount flavor(s)."
    }
    fun updateMessage() {
        Timber.d("Updating message")
        message.value = "This coffee contains ${flavors.value?.count()?:0} flavor(s)."
    }

    companion object {
        val FLAVOR_REGEX = Regex("(?<flavor>[\\w\\s]+)[,$]")
    }
}