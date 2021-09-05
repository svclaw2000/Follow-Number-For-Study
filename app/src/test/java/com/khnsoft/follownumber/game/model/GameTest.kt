package com.khnsoft.follownumber.game.model

import org.junit.Assert.*
import org.junit.Before
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.*

class GameTest {
    private lateinit var game: Game

    @Mock
    private lateinit var pads: Pads

    @Before
    fun setup() {
        game = spy(Game())
        pads = mock(Pads::class.java)
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

    @Test
    fun onPadClick_clickCorrectPad_scoreIncrease() {
        `when`(game.curPads).thenReturn(pads)
        `when`(pads[0]).thenReturn(listOf(Pad(1), Pad(2), Pad(3)))

        val oldScore = game.score
        game.onPadClick(0, 0)
        val newScore = game.score
        assertTrue(newScore > oldScore)
    }

    @Test
    fun onPadClick_clickIncorrectPad_scoreFreeze() {
        `when`(game.curPads).thenReturn(pads)
        `when`(pads[0]).thenReturn(listOf(Pad(1), Pad(2), Pad(3)))

        val oldScore = game.score
        game.onPadClick(0, 1)
        val newScore = game.score
        assertEquals(oldScore, newScore)
    }
}