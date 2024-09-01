package com.annisa.latihan5mobilekotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class GanjilGenapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_ganjil_genap)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val etInputAngka = findViewById<EditText>(R.id.etInputAngka)
        val btnCekGanjilGenap = findViewById<Button>(R.id.btnCekGanjilGenap)
        val tvHasilGanjilGenap = findViewById<TextView>(R.id.tvHasilGanjilGenap)

        btnCekGanjilGenap.setOnClickListener {
            val angka = etInputAngka.text.toString().toInt()
            val hasil = if (angka % 2 == 0) {
                "$angka adalah bilangan genap"
            } else {
                "$angka adalah bilangan ganjil"
            }
            tvHasilGanjilGenap.text = hasil
        }
    }
    }
