package com.example.android.semi_autochess.model

class Boardstate(val board: Board, val players: Pair<Player, Player>, val pieces: HashSet<Piece>, val piecePosition: HashMap<Square, Piece>) {
    init {
        // Create "endzones" to be defended by each player using the Board's built-in method
        board.createEndzone(players)
    }
}