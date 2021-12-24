package com.example.week03day04_hm

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter( val array:ArrayList<Mobile>):RecyclerView.Adapter<CustomAdapter.DataHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataHolder {
    var dataHoder:DataHolder =DataHolder(LayoutInflater.from(parent.context)
        .inflate(R.layout.custom_layout,parent,false))
        return dataHoder
    }

    override fun onBindViewHolder(holder: DataHolder, position: Int) {
    val mobile:Mobile =array.get(position)
    holder.imageView.setImageResource(mobile.img)
    holder.textName.setText(mobile.name)
    holder.textDec.setText(mobile.Dec)

    }

    override fun getItemCount(): Int {
    return array.size
    }
class DataHolder(view: View):RecyclerView.ViewHolder(view){
    var imageView: ImageView = view.findViewById(R.id.imageMobile)
    var textName: TextView = view.findViewById(R.id.tvName)
    var textDec: TextView = view.findViewById(R.id.tvDec)
}
}