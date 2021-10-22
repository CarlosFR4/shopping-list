package com.cfr4123.shoppinglist.di

import android.app.Application
import androidx.room.Room
import com.cfr4123.shoppinglist.data.db.ShoppingDao
import com.cfr4123.shoppinglist.data.db.ShoppingDatabase
import com.cfr4123.shoppinglist.ui.shopping_list.ShoppingViewModel
import org.koin.android.ext.koin.androidApplication
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    fun provideDatabase(application: Application): ShoppingDatabase {
        return Room.databaseBuilder(application, ShoppingDatabase::class.java, "shopping")
            .build()
    }

    fun provideShoppingDao(database: ShoppingDatabase): ShoppingDao {
        return database.getShoppingDao()
    }

    single { provideDatabase(androidApplication()) }
    single { provideShoppingDao(get()) }
    viewModel { ShoppingViewModel(get()) }
}