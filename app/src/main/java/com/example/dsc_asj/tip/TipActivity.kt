package com.example.dsc_asj.tip

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dsc_asj.R
import kotlinx.android.synthetic.main.activity_tip.*

class TipActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tip)

        btn_hitung.setOnClickListener {
            val input = et_nominal.text.toString()
            val nominal = input.toInt()

            val tipPercentage = when (rg_pelayanan.checkedRadioButtonId) {
                R.id.rb_baik -> 0.20
                R.id.rb_cukup -> 0.15
                R.id.rb_biasa -> 0.10
                else -> 0.1
            }

            val result = nominal * tipPercentage

            tv_hasil.text = result.toString()
        }
    }
}