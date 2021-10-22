package com.cfr4123.shoppinglist.ui.shopping_list

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.cfr4123.shoppinglist.data.db.entities.ShoppingItem
import com.cfr4123.shoppinglist.databinding.ShoppingItemBinding

class ShoppingItemAdapter(private var list: List<ShoppingItem>, private val viewModel: ShoppingViewModel) :
    RecyclerView.Adapter<ShoppingItemAdapter.ShoppingViewHolder>() {

    inner class ShoppingViewHolder(private val binding: ShoppingItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(item: ShoppingItem) {
            binding.apply {
                nameTv.text = item.name
                amountTv.text = "$" + item.amount
                deleteIv.setOnClickListener { viewModel.delete(item) }
                plusIv.setOnClickListener { item.amount++; viewModel.upsert(item) }
                minusIv.setOnClickListener {
                    if (item.amount > 0) {
                        item.amount--
                        viewModel.upsert(item)
                    }
                }

            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ShoppingViewHolder =
        ShoppingViewHolder(ShoppingItemBinding.inflate(LayoutInflater.from(parent.context)))

    override fun onBindViewHolder(holder: ShoppingViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int = list.size
}