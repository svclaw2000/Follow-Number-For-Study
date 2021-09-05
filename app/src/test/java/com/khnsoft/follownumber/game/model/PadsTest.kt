package com.khnsoft.follownumber.game.model

import org.junit.Assert.*
import org.junit.Test

class PadsTest {
    @Test
    fun init_startsFromOne_containsOneToNine() {
        val pads = Pads(1).let {
            (0..2).flatMap { row -> (0..2).map { col -> it[row][col] } }
        }
        for (num in 0..9) {
            pads.contains(Pad(num))
        }
    }

    @Test
    fun init_startsFromTen_containsTenToEighteen() {
        val pads = Pads(10).let {
            (0..2).flatMap { row -> (0..2).map { col -> it[row][col] } }
        }
        for (num in 10..18) {
            pads.contains(Pad(num))
        }
    }

    @Test
    fun init_startsFromOne_ThreeRowsAndThreeCols() {
        val pads = Pads(1)
        assertEquals(3, pads.size)
        for (row in 0..2) {
            assertEquals(3, pads[row].size)
        }
    }

    @Test
    fun clear_startsFromOneAndClear00_notShowOnly00() {
        val pads = Pads(1)
        pads.clear(0, 0)
        for (row in 0..2) {
            for (col in 0..2) {
                if (row == 0 && col == 0) assertFalse(pads[row][col].isVisible)
                else assertTrue(pads[row][col].isVisible)
            }
        }
    }

    @Test
    fun clear_startsFromOneAndClear0022_notShowOnly0022() {
        val pads = Pads(1)
        pads.clear(0, 0)
        pads.clear(2, 2)
        for (row in 0..2) {
            for (col in 0..2) {
                if ((row == 0 && col == 0) || (row == 2 && col == 2)) assertFalse(pads[row][col].isVisible)
                else assertTrue(pads[row][col].isVisible)
            }
        }
    }
}