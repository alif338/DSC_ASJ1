package com.example.dsc_asj.food

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dsc_asj.R
import kotlinx.android.synthetic.main.activity_food.*

class FoodActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food)

        val listFood = DataSource.provideFoodList()
        val adapter = FoodAdapter()

        rv_food_list.adapter = adapter

        adapter.setData(listFood)

    }
}