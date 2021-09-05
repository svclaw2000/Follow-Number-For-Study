package com.khnsoft.follownumber.game.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.khnsoft.follownumber.R
import com.khnsoft.follownumber.databinding.ActivityGameBinding
import com.khnsoft.follownumber.game.GameContract

class GameActivity : AppCompatActivity(), GameContract.View {
    private lateinit var binding: ActivityGameBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_game)
    }
}