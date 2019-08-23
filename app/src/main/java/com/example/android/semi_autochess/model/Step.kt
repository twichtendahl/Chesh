package com.example.android.semi_autochess.model

class Step(val direction: Int, val distance: Int) {

    fun subStep(distance: Int) : Step {
        return Step(this.direction, distance)
    }

    fun inverse() : Step {
        return Step((direction + 4) % 8, distance)
    }
}