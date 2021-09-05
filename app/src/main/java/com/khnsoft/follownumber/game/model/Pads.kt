package com.khnsoft.follownumber.game.model

class Pads(startNum: Int) {
    val pads: List<List<Pad>> = (0..2).map { row -> (0..2).map { col -> Pad(startNum + row * 3 + col) } }

    operator fun get(idx: Int) = pads[idx]
}