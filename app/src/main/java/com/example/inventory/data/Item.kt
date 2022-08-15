package com.example.inventory.data

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import java.text.NumberFormat

@Entity(tableName = "item")
data class Item(
    @PrimaryKey(autoGenerate = true) val id: Int = 0,
    @NonNull @ColumnInfo(name = "name") val itemName: String,
    @NonNull @ColumnInfo(name = "price") val itemPrice: Double,
    @ColumnInfo(name = "quantity") val quantityInStock: Int
)


fun Item.getFormattedPrice(): String =
    NumberFormat.getCurrencyInstance().format(itemPrice)