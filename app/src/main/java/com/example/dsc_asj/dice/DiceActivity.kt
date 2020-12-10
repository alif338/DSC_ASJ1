package com.example.dsc_asj.dice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.example.dsc_asj.R

class DiceActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dice)
        val btnRoll = findViewById<Button>(R.id.btn_roll)
        val ivDice = findViewById<ImageView>(R.id.iv_dice)

        btnRoll.setOnClickListener {
            val dice = Dice(sides = 6)
            val resourceId = when (dice.roll()) {
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.dice_6
            }

            ivDice.setImageResource(resourceId)
        }

    }
}