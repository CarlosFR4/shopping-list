package com.cfr4123.shoppinglist.data.db.entities

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName="shopping_items")
data class ShoppingItem(
    var name: String,
    var amount: String
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
