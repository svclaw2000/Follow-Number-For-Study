package com.khnsoft.follownumber.game.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.khnsoft.follownumber.game.model.Game

class GameViewModelFactory(private val game: Game): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T = GameViewModel(game) as T
}