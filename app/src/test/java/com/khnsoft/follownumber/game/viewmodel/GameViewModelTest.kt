package com.khnsoft.follownumber.game.viewmodel

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.khnsoft.follownumber.game.model.Game
import com.khnsoft.follownumber.game.model.Pad
import com.khnsoft.follownumber.game.model.Pads
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.mockito.Mock
import org.mockito.Mockito.*

class GameViewModelTest {
    private lateinit var viewModel: GameViewModel

    @get:Rule
    var instantExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var game: Game

    @Mock
    private lateinit var pads: Pads

    @Before
    fun setup() {
        game = mock(Game::class.java)
        pads = mock(Pads::class.java)
        viewModel = GameViewModel(game)
    }

    @Test
    fun onPadClick_correctPad_doProcess() {
        `when`(game.curPads).thenReturn(pads)
        `when`(pads.get(0)).thenReturn(listOf(Pad(1)))
        viewModel.onPadClick(0, 0)
        verify(game).onPadClick(0, 0)
    }
}