package com.khnsoft.follownumber.game.model

import org.junit.Assert.*
import org.junit.Test

class PadsTest {
    @Test
    fun init_startsFromOne_containsOneToNine() {
        val pads = Pads(1).pads.flatten()
        for (num in 0..9) {
            pads.contains(Pad(num))
        }
    }

    @Test
    fun init_startsFromTen_containsTenToEighteen() {
        val pads = Pads(10).pads.flatten()
        for (num in 10..18) {
            pads.contains(Pad(num))
        }
    }

    @Test
    fun init_startsFromOne_ThreeRowsAndThreeCols() {
        val pads = Pads(1).pads
        assertEquals(3, pads.size)
        for (row in 0..2) {
            assertEquals(3, pads[row].size)
        }
    }
}