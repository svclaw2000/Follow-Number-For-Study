package com.khnsoft.follownumber.game.model

class Game {
    private var step = 0

    private lateinit var _curPads: Pads
    val curPads get() = _curPads
    private lateinit var _nextPads: Pads
    val nextPads get() = _nextPads

    init {
        generateNextPads()
        assignNextPads()
    }

    private fun generateNextPads() {
        _nextPads = Pads(step++ * 9 + 1)
    }

    private fun assignNextPads() {
        _curPads = _nextPads
        generateNextPads()
    }
}