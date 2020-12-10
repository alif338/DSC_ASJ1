package com.example.dsc_asj.food

import com.example.dsc_asj.R

object DataSource {

    fun provideFoodList(): List<Food> {
        val list = mutableListOf<Food>()
        list.add(Food(R.drawable.ayamgoreng, "Ayam Goreng"))
        list.add(Food(R.drawable.bakmi, "Bakmi"))
        list.add(Food(R.drawable.bakmoy, "Bakmoy"))
        list.add(Food(R.drawable.bakso, "Bakso"))
        list.add(Food(R.drawable.nasgor, "Nasi Goreng"))
        list.add(Food(R.drawable.tahutek, "Tahu Tek"))
        return list
    }
}