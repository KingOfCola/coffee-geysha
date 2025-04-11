package com.example.coffeegeysha.data.databases

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.coffeegeysha.data.dao.CoffeeDao
import com.example.coffeegeysha.data.entities.Coffee

@Database(entities = [Coffee::class], version = 1)
abstract class AppDatabase : RoomDatabase(){
    abstract fun coffeeDao(): CoffeeDao
}