package com.example.android.semi_autochess.model

data class Square(val file: Int, val rank: Int) {
    var ownedBy: Player? = null

    fun behindMe() : Square {
        return Square(file,rank - 1)
    }

    fun inFrontOfMe() : Square {
        return Square(file, rank + 1)
    }

    fun toMyLeft() : Square {
        return Square(file - 1, rank)
    }

    fun toMyRight() : Square {
        return Square(file + 1, rank)
    }

    fun translatedBy(rightward:Int, upward:Int) : Square {
        return Square(file + rightward, rank + upward)
    }

    fun isRightOf(square:Square) : Boolean {
        return file == square.file + 1 && rank == square.rank
    }

    fun isLeftOf(square:Square) : Boolean {
        return square.isRightOf(this)
    }

    fun isInFrontOf(square:Square) : Boolean {
        return file == square.file && rank == square.rank + 1
    }

    fun isBehind(square:Square) : Boolean {
        return square.isInFrontOf(this)
    }
}