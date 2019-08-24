package com.example.android.semi_autochess.model

class Board(val size: Int) {
    val squares: HashMap<Pair<Int, Int>, Square> = HashMap(size * (size + 2))
    init {
        for (x in 0 until size) {
            for (y in -1..size) {
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

    // Assigns the squares on the ends facing a player to that player, forming an "endzone"
    fun createEndzone(players: Pair<Player, Player>) {
        for (square in squares) {
            if (square.key.second == -1) {
                square.value.ownedBy = players.first
            } else if (square.key.second == size) {
                square.value.ownedBy = players.second
            }
        }
    }
}