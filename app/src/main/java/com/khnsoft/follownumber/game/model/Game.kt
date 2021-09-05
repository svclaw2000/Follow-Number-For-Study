package com.khnsoft.follownumber.game.model

class Game {
    private var step = 0

    private lateinit var _curPads: Pads
    val curPads get() = _curPads
    private lateinit var _nextPads: Pads
    val nextPads get() = _nextPads

    private var _score = 0
    val score get() = _score

    private var nextNum = 1

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

    fun onPadClick(row: Int, col: Int) {
        if (curPads[row][col].num == nextNum) {
            curPads.clear(row, col)
            _score++
            nextNum++
            if (nextNum % 9 == 1) {
                assignNextPads()
            }
        } else {

        }
    }

    enum class Status {
        READY,
        RUNNING,
        PAUSE,
        GAME_OVER
    }
}