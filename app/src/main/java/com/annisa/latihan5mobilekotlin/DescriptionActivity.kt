package com.annisa.latihan5mobilekotlin

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.TextView

class DescriptionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        val animalName = intent.getStringExtra("animalName")
        val animalDescription = intent.getStringExtra("animalDescription")

        val titleTextView: TextView = findViewById(R.id.animalTitle)
        val descriptionTextView: TextView = findViewById(R.id.animalDescription)
        val backButton: Button = findViewById(R.id.backButton)

        titleTextView.text = animalName
        descriptionTextView.text = animalDescription

        backButton.setOnClickListener {
            finish() // Kembali ke aktivitas sebelumnya
        }
    }
}