package com.example.android.semi_autochess.model

class Board(val size: Int) {
    val squares: HashMap<Pair<Int, Int>, Square> = HashMap(size * size)
    init {
        for (x in 0 until size) {
            for (y in 0 until size) {
                squares[Pair(x, y)] = Square(x, y)
            }
        }
    }

    fun setOfSquares(set: Set<Pair<Int, Int>>) : HashSet<Square> {
        val squareSet = hashSetOf<Square>()
        for (coordinates in set) {
            if (squares.containsKey(coordinates)) {
                squareSet.add(squares[coordinates]!!) // This square exists because of conditional block
            }
        }
        return squareSet
    }
}