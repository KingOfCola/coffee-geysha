package com.example.coffeegeysha.datasources

import android.content.Context
import com.example.coffeegeysha.data.Coffee

class CoffeeSource(val context: Context) {
    fun getCoffeeList(): List<Coffee> {
        // Returns the coffee list from a static list of coffees
        return listOf(
            Coffee("Boreal", "Huye Mountain", "Rwanda"),
            Coffee("Boreal", "San Isidro - Monge Family", "Costa Rica"),
            Coffee("Blackmass", "Anointed in Astral Luminescence", "El Salvador")
        )
    }
}