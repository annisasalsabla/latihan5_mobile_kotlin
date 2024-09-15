package com.annisa.latihan5mobilekotlin

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val animal = intent.getStringExtra("animal")
        val descriptionTextView: TextView = findViewById(R.id.descriptionTextView)
        val backButton: Button = findViewById(R.id.backButton)

        // Set the description based on the selected animal
        descriptionTextView.text = " $animal Deskripsi ."

        backButton.setOnClickListener {
            finish() // Closes the current activity and goes back to the previous one
        }
    }
}
