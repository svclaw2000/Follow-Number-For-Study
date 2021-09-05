package com.khnsoft.follownumber.game.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.khnsoft.follownumber.R
import com.khnsoft.follownumber.databinding.ActivityGameBinding
import com.khnsoft.follownumber.game.model.Game
import com.khnsoft.follownumber.game.viewmodel.GameViewModel
import com.khnsoft.follownumber.game.viewmodel.GameViewModelFactory

class GameActivity : AppCompatActivity() {
    private lateinit var binding: ActivityGameBinding
    private val viewModel: GameViewModel by viewModels { GameViewModelFactory(Game()) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_game)
        binding.lifecycleOwner = this
        binding.viewModel = viewModel

        binding.tvPad00.setOnClickListener { viewModel.onPadClick(0, 0) }
        binding.tvPad01.setOnClickListener { viewModel.onPadClick(0, 1) }
        binding.tvPad02.setOnClickListener { viewModel.onPadClick(0, 2) }
        binding.tvPad10.setOnClickListener { viewModel.onPadClick(1, 0) }
        binding.tvPad11.setOnClickListener { viewModel.onPadClick(1, 1) }
        binding.tvPad12.setOnClickListener { viewModel.onPadClick(1, 2) }
        binding.tvPad20.setOnClickListener { viewModel.onPadClick(2, 0) }
        binding.tvPad21.setOnClickListener { viewModel.onPadClick(2, 1) }
        binding.tvPad22.setOnClickListener { viewModel.onPadClick(2, 2) }
    }
}