package com.annisa.latihan5mobilekotlin

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DescriptionActivity : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_description)

        val animalName = intent.getStringExtra("animalName")
        val animalDescription = intent.getStringExtra("animalDescription")
        val animalImageResId = intent.getIntExtra("animalImageResId", -1)

        val titleTextView: TextView = findViewById(R.id.animalTitle)
        val descriptionTextView: TextView = findViewById(R.id.animalDescription)
        val animalImageView: ImageView = findViewById(R.id.animalImageView)
        val backButton: Button = findViewById(R.id.backButton)

        titleTextView.text = animalName
        descriptionTextView.text = animalDescription

        // Set the image if the resource ID is valid
        if (animalImageResId != -1) {
            animalImageView.setImageResource(animalImageResId)
        }

        backButton.setOnClickListener {
            finish()
        }
    }
}