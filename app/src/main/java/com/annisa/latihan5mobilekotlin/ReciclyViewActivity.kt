package com.annisa.latihan5mobilekotlin

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.annisa.latihan5mobilekotlin.adapter.BukuAdapter
import com.annisa.latihan5mobilekotlin.model.ModelBuku

class ReciclyViewActivity : AppCompatActivity() {
    //view group = bisa menampung data lebih cepat dn bnyk
    //recycle load data yg d layar aj

    private lateinit var rv_buku: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recicly_view)

        rv_buku = findViewById(R.id.rv_data)
        val listBuku = listOf(
            ModelBuku(title = "Buku Android kotlin 2024", penulis = "Rizki Syaputra"),
            ModelBuku(title = "Buku Satu Jam Ahli Pemograman", penulis = "Adam Saputra"),
            ModelBuku(title = "Buku The Psychology of Money", penulis = "Morgan Housel"),
            ModelBuku(title = "Buku Control Your Attitude", penulis = "Katla Malatika"),
            ModelBuku(title = "Buku Novel Dunia Sophie", penulis = "Jostein Gaarder"),
        )

        val nBukuAdapter = BukuAdapter(listBuku)
        rv_buku.apply {

                layoutManager = LinearLayoutManager(this@ReciclyViewActivity)
                adapter = nBukuAdapter
            }

            ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
                val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
                v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
                insets
            }
        }
    }
