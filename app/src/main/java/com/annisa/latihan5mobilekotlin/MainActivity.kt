package com.annisa.latihan5mobilekotlin

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var btnPassing: Button
    private lateinit var btnListview: Button
    private lateinit var btnRvBuku: Button
    private lateinit var btnRecycleView: Button


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val btnKonversiSuhu = findViewById<Button>(R.id.btnKonversiSuhu)
        val btnDiskon = findViewById<Button>(R.id.btnDiskon)
        val btnLuasVolume = findViewById<Button>(R.id.btnLuasVolume)
        val btnGanjilGenap = findViewById<Button>(R.id.btnGanjilGenap)
        val btnPassingData = findViewById<Button>(R.id.btnPassingData)
        val btnListView = findViewById<Button>(R.id.btnListView)
        val btnRvBuku = findViewById<Button>(R.id.btnReciclyView)
        val btnRecycleView= findViewById<Button>(R.id.btnReciclyBuah)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        btnKonversiSuhu.setOnClickListener {
            startActivity(Intent(this, KonversiSuhuActivity::class.java))
        }

        btnDiskon.setOnClickListener {
            startActivity(Intent(this, DiskonActivity::class.java))
        }

        btnLuasVolume.setOnClickListener {
            startActivity(Intent(this, LuasVolumeActivity::class.java))
        }

        btnGanjilGenap.setOnClickListener {
            startActivity(Intent(this, GanjilGenapActivity::class.java))
        }
        btnPassingData.setOnClickListener {
            startActivity(Intent(this, PassingDataActivity::class.java))
        }
        btnListView.setOnClickListener {
            startActivity(Intent(this, ListViewActivity::class.java))
        }
        btnRvBuku.setOnClickListener() {
            startActivity(Intent(this, ReciclyViewActivity::class.java))

        }
        btnRecycleView.setOnClickListener() {
            startActivity(Intent(this, CustomImageRecycleView::class.java))

        }
    }
}


