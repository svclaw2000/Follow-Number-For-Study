package com.khnsoft.follownumber.game.model

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class GameTest {
    private lateinit var game: Game

    @Before
    fun setup() {
        game = Game()
    }

    @Test
    fun currentPads_afterInitialize_containsOneToNine() {
        val pads = (0..2).flatMap { row -> (0..2).map { col -> game.curPads[row][col] } }
        (1..9).forEach {
            assertTrue(pads.contains(Pad(it)))
        }
    }

    @Test
    fun nextPads_afterInitialize_containsTenToEighteen() {
        val pads = (0..2).flatMap { row -> (0..2).map { col -> game.nextPads[row][col] } }
        (10..18).forEach {
            assertTrue(pads.contains(Pad(it)))
        }
    }
}