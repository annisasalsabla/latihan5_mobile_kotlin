package com.annisa.latihan5mobilekotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class DiskonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_diskon)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etTotalBelanja = findViewById<EditText>(R.id.etTotalBelanja)
        val btnCalculate = findViewById<Button>(R.id.btnCalculate)
        val tvDiskon = findViewById<TextView>(R.id.tvDiskon)

        btnCalculate.setOnClickListener {
            val totalBelanja = etTotalBelanja.text.toString().toDouble()
            val diskon = when {
                totalBelanja < 100000 -> 0.0
                totalBelanja <= 500000 -> 0.10 * totalBelanja
                totalBelanja <= 1000000 -> 0.20 * totalBelanja
                else -> 0.30 * totalBelanja
            }

            tvDiskon.text = "Diskon yang didapatkan: Rp $diskon"
        }
    }
}
