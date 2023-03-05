package com.example.wichacks

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.example.wichacks.databinding.ActivityScrollingBinding

class ScrollingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityScrollingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityScrollingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //This is the button press that will take you to the CycleTracking
        val cycleButtonClick = findViewById<Button>(R.id.button2)
        cycleButtonClick.setOnClickListener {
            val intent = Intent(this, CycleTracking::class.java)
            startActivity(intent)
        }

        //This is the button press that will take you to the SymptomTracking
        val symptButtonClick = findViewById<Button>(R.id.button3)
        symptButtonClick.setOnClickListener {
            val intent = Intent(this, SymptomsTracking::class.java)
            startActivity(intent)
        }
        //This is the button press that will take you to the MedicationTracking
        val medsButtonClick = findViewById<Button>(R.id.button4)
        medsButtonClick.setOnClickListener {
            val intent = Intent(this, MedicationTracking::class.java)
            startActivity(intent)
        }

        //This is the button press that will take you to the WaterTracking
        val waterButtonClick = findViewById<Button>(R.id.button5)
        waterButtonClick.setOnClickListener {
            val intent = Intent(this, WaterTracking::class.java)
            startActivity(intent)
        }

        //This is the button press that will take you to the Feedback page
        val feedButtonClick = findViewById<Button>(R.id.button6)
        feedButtonClick.setOnClickListener {
            val intent = Intent(this, Feedback::class.java)
            startActivity(intent)
        }
    }
}