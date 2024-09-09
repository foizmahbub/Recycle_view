package com.example.recycleview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import com.example.recycleview.databinding.ItemBinding

class Adapter(val itemData:ItemData):ListAdapter<ItemData,ItemHolder>(compare) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemHolder {
return ItemHolder(ItemBinding.inflate(
    LayoutInflater.from(parent.context),parent,false
))
    }

    override fun onBindViewHolder(holder: ItemHolder, position: Int) {
        getItem(position).let {
            holder.binding.imageView.setImageResource(getItem(position).image)
            holder.binding.NameOfPerson.text = getItem(position).name



        }
    }
    companion object {
        val compare = object : DiffUtil.ItemCallback<ItemData>() {
            override fun areItemsTheSame(oldItem: ItemData, newItem: ItemData): Boolean {
                return oldItem == newItem
            }

            override fun areContentsTheSame(oldItem: ItemData, newItem: ItemData): Boolean {
                return oldItem == newItem
            }

        }
    }
    }


