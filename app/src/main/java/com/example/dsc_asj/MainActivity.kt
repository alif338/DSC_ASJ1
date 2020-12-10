package com.example.dsc_asj

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.dsc_asj.birthdaycard.BirthdayCardActivity
import com.example.dsc_asj.dice.DiceActivity
import com.example.dsc_asj.food.FoodActivity
import com.example.dsc_asj.tip.TipActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnBirthdayCard = findViewById<Button>(R.id.btn_birthday_card)
        val btnDice = findViewById<Button>(R.id.btn_dice)
        val btnTip = findViewById<Button>(R.id.btn_tip)
        val btnFood = findViewById<Button>(R.id.btn_food)

        btnBirthdayCard.setOnClickListener {
            startActivity(Intent(this@MainActivity, BirthdayCardActivity::class.java))
        }

        btnDice.setOnClickListener {
            startActivity(Intent(this@MainActivity, DiceActivity::class.java))
        }

        btnTip.setOnClickListener {
            startActivity(Intent(this@MainActivity, TipActivity::class.java))
        }

        btnFood.setOnClickListener {
            startActivity(Intent(this@MainActivity, FoodActivity::class.java))
        }


    }
}