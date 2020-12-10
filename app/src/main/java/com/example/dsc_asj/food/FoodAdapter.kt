package com.example.dsc_asj.food

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.dsc_asj.R
import kotlinx.android.synthetic.main.item_food.view.*

class FoodAdapter: RecyclerView.Adapter<FoodAdapter.ViewHolder>() {

    private val list = mutableListOf<Food>()

    fun setData(newData: List<Food>) {
        list.addAll(newData)
        notifyDataSetChanged()
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bindItem(food: Food) {
            itemView.iv_food.setImageResource(food.resourceId)
            itemView.tv_food.text = food.name
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.item_food, parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val food = list[position]
        holder.bindItem(food)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}