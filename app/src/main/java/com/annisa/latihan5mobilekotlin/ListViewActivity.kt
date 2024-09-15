package com.annisa.latihan5mobilekotlin



import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {

    // Daftar hewan, deskripsi, dan gambar
    private val animals = arrayOf("Kucing", "Gajah", "Kupu-kupu", "Beruang", "Kelinci", "Kambing", "Sapi")
    private val animalDescriptions = mapOf(
        "Kucing" to "Kucing adalah mamalia karnivora yang termasuk dalam keluarga Felidae.",
        "Gajah" to "Gajah adalah hewan darat terbesar dengan belalai panjang.",
        "Kupu-kupu" to "Kupu-kupu adalah serangga yang memiliki sayap berwarna indah.",
        "Beruang" to "Beruang adalah hewan besar dengan bulu tebal, hidup di berbagai habitat.",
        "Kelinci" to "Kelinci adalah hewan kecil dengan telinga panjang, hidup di daratan.",
        "Kambing" to "Kambing adalah hewan ternak yang banyak dipelihara untuk daging dan susunya.",
        "Sapi" to "Sapi adalah hewan besar yang dipelihara untuk daging, susu, dan tenaga."
    )

    private val animalImages = mapOf(
        "Kucing" to R.drawable.kucing,
        "Gajah" to R.drawable.gajah,
        "Kupu-kupu" to R.drawable.kupu_kupu,
        "Beruang" to R.drawable.beruang,
        "Kelinci" to R.drawable.kelinci,
        "Kambing" to R.drawable.kambing,
        "Sapi" to R.drawable.sapi
    )



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_view)

        val listView: ListView = findViewById(R.id.animalListView)
        val adapter = ArrayAdapter(this, android.R.layout.simple_list_item_1, animals)
        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val selectedAnimal = animals[position]
            val description = animalDescriptions[selectedAnimal]
            val imageResId = animalImages[selectedAnimal]

            val intent = Intent(this, DescriptionActivity::class.java).apply {
                putExtra("animalName", selectedAnimal)
                putExtra("animalDescription", description)
                putExtra("animalImageResId", imageResId)
            }
            startActivity(intent)
        }
    }
}