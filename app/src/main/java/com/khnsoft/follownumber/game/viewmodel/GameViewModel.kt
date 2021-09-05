package com.khnsoft.follownumber.game.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khnsoft.follownumber.game.model.Game
import com.khnsoft.follownumber.game.model.Pads

class GameViewModel(val game: Game): ViewModel() {
    private val _pads = MutableLiveData(game.curPads)
    val pads: LiveData<Pads> get() = _pads

    private val _score = MutableLiveData(game.score)
    val score: LiveData<Int> get() = _score

    fun onPadClick(row: Int, col: Int) {
        game.process(row, col)
        _pads.value = game.curPads
        _score.value = game.score
    }
}