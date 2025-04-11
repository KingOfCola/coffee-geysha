package com.example.coffeegeysha.datasources

import android.content.Context
import com.example.coffeegeysha.data.entities.Coffee

class CoffeeSource(val context: Context) {
    fun getCoffeeList(): List<Coffee> {
        // Returns the coffee list from a static list of coffees
        return listOf(
            Coffee(uid=0, brand="Boreal", name="Huye Mountain", origin="Rwanda"),
            Coffee(uid=1, brand="Boreal", name="San Isidro - Monge Family", origin="Costa Rica"),
            Coffee(uid=2, brand="Blackmass", name="Anointed in Astral Luminescence", origin="El Salvador")
        )
    }
}