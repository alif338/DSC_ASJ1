package com.example.dsc_asj.dice

class Dice(val sides: Int) {

    fun roll(): Int{
        return (1..sides).random()
    }

}