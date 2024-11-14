package com.example.profileapp

import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val profileImage = findViewById<ImageView>(R.id.profileImage)
        val nameText = findViewById<TextView>(R.id.nameText)
        val descriptionText = findViewById<TextView>(R.id.descriptionText)
        val currentJobText = findViewById<TextView>(R.id.currentJobText)
        val experienceLayout = findViewById<LinearLayout>(R.id.experienceLayout)

        profileImage.setOnClickListener {
            Toast.makeText(this, "Foto de perfil de Gustavo Erick", Toast.LENGTH_SHORT).show()
        }

        nameText.text = "Gustavo Erick"
        descriptionText.text = "Graduando em Sistemas de Informação."
        currentJobText.text = "Emprego Atual: Tutor Fundação Demócrito Rocha"

        val experiencias = listOf(
            "Tutor - Fundação Demócrito Rocha 2023.2",
            "Tutor - Fundação Demócrito Rocha 2024.1"
        )

        for (experiencia in experiencias) {
            val textView = TextView(this)
            textView.text = experiencia
            textView.textSize = 16f
            experienceLayout.addView(textView)
        }
    }

}