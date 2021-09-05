package com.khnsoft.follownumber.main.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import com.khnsoft.follownumber.R
import com.khnsoft.follownumber.databinding.ActivityMainBinding
import com.khnsoft.follownumber.game.view.GameActivity

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        binding.tvStartGame.setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }
    }
}