package com.example.android.semi_autochess.model

class Move(val steps: ArrayList<Step>) {
    fun inverse() : Move {
        val inverseSteps: ArrayList<Step> = arrayListOf()
        for (i in steps.size - 1..0) {
            inverseSteps.add(steps[i].inverse())
        }
        return Move(inverseSteps)
    }
}