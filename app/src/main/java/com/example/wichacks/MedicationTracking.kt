package com.example.wichacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MedicationTracking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medication_tracking)


        val medAddition = findViewById<Button>(R.id.medButton)
        medAddition.setOnClickListener {
            val intent = Intent(this, MedicationAdding::class.java)
            startActivity(intent)
        }

        val backHome = findViewById<Button>(R.id.medButton)
        backHome.setOnClickListener {
            val intent = Intent(this, ScrollingActivity::class.java)
            startActivity(intent)
        }
    }
}