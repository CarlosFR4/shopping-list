package com.cfr4123.shoppinglist.data.repository

import com.cfr4123.shoppinglist.data.db.ShoppingDatabase
import com.cfr4123.shoppinglist.data.db.entities.ShoppingItem

class ShoppingRepository(private val database: ShoppingDatabase) {

    suspend fun upsert(item: ShoppingItem) = database.getShoppingDao().upsert(item)

    suspend fun delete(item: ShoppingItem) = database.getShoppingDao().delete(item)

    fun getAllShoppingItems() = database.getShoppingDao().getAllShoppingItems()
}