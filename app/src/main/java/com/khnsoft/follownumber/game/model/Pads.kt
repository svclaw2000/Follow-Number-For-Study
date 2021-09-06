package com.khnsoft.follownumber.game.model

class Pads(startNum: Int) {
    private val pads: MutableList<Pad> = (0 until 9).map { Pad(startNum + it) }.shuffled().toMutableList()

    val size: Int get() = pads.size

    operator fun get(idx: Int) = pads.subList(idx*3, (idx+1)*3).toList()

    fun clear(row: Int, col: Int) {
        pads[row * 3 + col] = pads[row * 3 + col].copy(isVisible = false)
    }
}