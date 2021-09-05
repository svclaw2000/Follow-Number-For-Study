package com.khnsoft.follownumber.game.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.khnsoft.follownumber.game.model.Game
import com.khnsoft.follownumber.game.model.Pads

class GameViewModel: ViewModel() {
    private val game = Game()

    private val _pads = MutableLiveData(game.curPads)
    val pads: LiveData<Pads> get() = _pads
}