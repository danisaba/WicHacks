package com.example.wichacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Feedback : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_feedback)

        val backHome = findViewById<Button>(R.id.backToScrollFeed)
        backHome.setOnClickListener {
            val intent = Intent(this, ScrollingActivity::class.java)
            startActivity(intent)
        }
    }
}