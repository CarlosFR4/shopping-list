package com.cfr4123.shoppinglist.ui.shopping_list

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.cfr4123.shoppinglist.data.db.entities.ShoppingItem

class ShoppingItemAdapter(var list: List<ShoppingItem>, private val viewModel: ShoppingViewModel) : RecyclerView.Adapter<ShoppingItemAdapter.ShoppingViewHolder> {

    inner class ShoppingViewHolder(view: View) : RecyclerView.ViewHolder(view){

    }
}