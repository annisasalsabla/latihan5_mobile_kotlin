package com.annisa.latihan5mobilekotlin

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
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
        val btnHitungDiskon = findViewById<Button>(R.id.btnHitungDiskon)
        val tvHasilDiskon = findViewById<TextView>(R.id.tvHasilDiskon)

        btnHitungDiskon.setOnClickListener {
            val totalBelanjaStr = etTotalBelanja.text.toString()

            if (totalBelanjaStr.isEmpty()) {
                Toast.makeText(this, "Harap masukkan total belanja", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val totalBelanja = totalBelanjaStr.toDouble()
            val diskon = when {
                totalBelanja < 100000 -> 0.0
                totalBelanja in 100000.0..500000.0 -> 0.1
                totalBelanja in 500000.0..1000000.0 -> 0.2
                else -> 0.3
            }

            val jumlahDiskon = totalBelanja * diskon
            val totalPembayaran = totalBelanja - jumlahDiskon

            val hasil = """
                Total Belanja: Rp. ${"%,.2f".format(totalBelanja)}
                Diskon: ${diskon * 100}%
                Total Pembayaran: Rp. ${"%,.2f".format(totalPembayaran)}
            """.trimIndent()

            tvHasilDiskon.text = hasil
        }
    }
}

