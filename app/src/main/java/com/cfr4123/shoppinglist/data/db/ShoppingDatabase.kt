package com.cfr4123.shoppinglist.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.cfr4123.shoppinglist.data.db.entities.ShoppingItem

@Database(entities = [ShoppingItem::class], version = 1)
abstract class ShoppingDatabase: RoomDatabase() {

    abstract fun getShoppingDao(): ShoppingDao
}