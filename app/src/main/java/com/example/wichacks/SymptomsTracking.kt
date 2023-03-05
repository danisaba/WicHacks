package com.example.wichacks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class SymptomsTracking : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_symptoms_tracking)

        val subButtonClick = findViewById<Button>(R.id.submitButton)
        subButtonClick.setOnClickListener {
            Toast.makeText(
                applicationContext,
                "Your response has been recorded", Toast.LENGTH_LONG).show()
        }
    }
}