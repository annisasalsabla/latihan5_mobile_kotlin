package com.annisa.latihan5mobilekotlin.adapter

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.annisa.latihan5mobilekotlin.CustomImageRecycleView
import com.annisa.latihan5mobilekotlin.PhotoDetailActivity
import com.annisa.latihan5mobilekotlin.R
import com.annisa.latihan5mobilekotlin.model.ModelBuah

class BuahAdapter(val itemList: ArrayList<ModelBuah>) :
  RecyclerView.Adapter<BuahAdapter.ModelViewHolder>(){
      class ModelViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
          lateinit var ItemImage : ImageView
          lateinit var  ItemText : TextView

          init {
              ItemImage = itemView.findViewById(R.id.gridView) as ImageView
              ItemText = itemView.findViewById(R.id.nama) as TextView
          }
      }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ModelViewHolder {
        val nView = LayoutInflater.from(parent.context)
            .inflate(
                R.layout.item_custom_image, parent, false
            )
        return ModelViewHolder(nView)
    }

    override fun getItemCount(): Int {
        return itemList.size
    }

    override fun onBindViewHolder(holder: ModelViewHolder, position: Int) {
      holder.ItemImage.setImageResource(itemList[position].image)
        holder.ItemText.setText(itemList[position].deskripsi)
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val intent = Intent(context, PhotoDetailActivity::class.java)
            intent.putExtra("imageResId", itemList[position].image)
            intent.putExtra("deskripsi", itemList[position].deskripsi)
            context.startActivity(intent)


        }

    }

}

