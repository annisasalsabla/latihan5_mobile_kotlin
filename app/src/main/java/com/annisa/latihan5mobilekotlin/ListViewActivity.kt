package com.annisa.latihan5mobilekotlin

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ListViewActivity : AppCompatActivity() {
    private lateinit var lv_item: ListView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)
        lv_item = findViewById(R.id.btnlistview)


        //listview
        //listview widget -> Adapter -> Data Source (Array List)

        //bikin array list
        val namaHewan =
            listOf( "Gajah", "Kucing", "Kupu=kupu", "Beruang", "Kelinci", "Kambing", "Sapi")
        //kita masukkan data array hewan ke adapter
        //android layout ->
        lv_item.adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, namaHewan)

    }
}