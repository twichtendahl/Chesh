package com.example.android.semi_autochess.model

class Piece(val moves: HashSet<Move>, val targets: HashSet<Move>, val strength: Int, val health: Int) {
}