package com.khnsoft.follownumber.main.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.khnsoft.follownumber.R
import com.khnsoft.follownumber.game.view.GameActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<TextView>(R.id.tvStartGame).setOnClickListener {
            startActivity(Intent(this, GameActivity::class.java))
        }
    }
}