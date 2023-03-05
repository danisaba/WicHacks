package com.example.wichacks

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.CheckBox
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
    fun onCheckboxClicked(view: View) {
        if (view is CheckBox) {
            val checked: Boolean = view.isChecked

            when (view.id) {
                R.id.acne -> {
                    if (checked) {
                        SymptomEntry.acne = true;
                    }
                }
                R.id.anxiety -> {
                    if (checked) {
                        SymptomEntry.anxiety = true;
                    }
                }
                R.id.bloating -> {
                    if (checked) {
                        SymptomEntry.bloating = true;
                    }
                }
                R.id.bodyaches -> {
                    if (checked) {
                        SymptomEntry.bodyaches = true;
                    }
                }
                R.id.cramping -> {
                    if (checked) {
                        SymptomEntry.cramping = true;
                    }
                }
                R.id.depression -> {
                    if (checked) {
                        SymptomEntry.depression = true;
                    }
                }
                R.id.diarrhea -> {
                    if (checked) {
                        SymptomEntry.diarrhea = true;
                    }
                }
                R.id.fatigue -> {
                    if (checked) {
                        SymptomEntry.fatigue = true;
                    }
                }
                R.id.flashes -> {
                    if (checked) {
                        SymptomEntry.flashes = true;
                    }
                }
                R.id.headache -> {
                    if (checked) {
                        SymptomEntry.headache = true;
                    }
                }
                R.id.hunger -> {
                    if (checked) {
                        SymptomEntry.hunger = true;
                    }
                }
                R.id.irritable -> {
                    if (checked) {
                        SymptomEntry.irritable = true;
                    }
                }
                R.id.libido -> {
                    if (checked) {
                        SymptomEntry.libido = true;
                    }
                }
                R.id.mood -> {
                    if (checked) {
                        SymptomEntry.mood = true;
                    }
                }
                R.id.sleep -> {
                    if (checked) {
                        SymptomEntry.sleep = true;
                    }
                }
            }
        }
    }
}