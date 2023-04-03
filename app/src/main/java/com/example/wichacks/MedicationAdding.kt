package com.example.wichacks

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MedicationAdding : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_medication_adding)

        val backMed = findViewById<Button>(R.id.backToMed)
        backMed.setOnClickListener {
            val intent = Intent(this, MedicationTracking::class.java)
            startActivity(intent)
        }
    }
}