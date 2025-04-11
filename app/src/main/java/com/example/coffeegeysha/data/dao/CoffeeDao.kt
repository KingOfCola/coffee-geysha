package com.example.coffeegeysha.data.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.coffeegeysha.data.entities.Coffee

@Dao
interface CoffeeDao {
    @Query("SELECT * FROM coffee")
    fun getAll(): List<Coffee>

    @Query("SELECT * FROM coffee WHERE uid = (:coffeeId) LIMIT 1")
    fun loadById(coffeeId: Int): Coffee

    @Query("SELECT * FROM coffee WHERE origin = (:origin)")
    fun findAllByOrigin(origin: String): List<Coffee>

    @Query("SELECT * FROM coffee WHERE brand = (:brand)")
    fun findAllByBrand(brand: String): List<Coffee>

    @Insert
    fun insertAll(vararg coffees: Coffee)

    @Delete
    fun delete(coffee: Coffee)
}