package com.example.coffeegeysha.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Coffee(
    @PrimaryKey val uid: Int,
    @ColumnInfo(name = "brand") val brand: String?,
    @ColumnInfo(name = "name") val name: String?,
    @ColumnInfo(name = "origin") val origin: String?
)