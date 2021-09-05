package com.khnsoft.follownumber.game.model

class Pads(startNum: Int) {
    val pads: MutableList<MutableList<Pad>> =
        (0..2).map { row -> (0..2).map { col -> Pad(startNum + row * 3 + col) }.toMutableList() }.toMutableList()

    operator fun get(idx: Int) = pads[idx]

    fun clear(row: Int, col: Int) {
        pads[row][col] = pads[row][col].copy(isVisible = false)
    }
}