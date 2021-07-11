package com.example

import Items
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.desafio_android.R

class MainAdapter(private val notes: List<Items>, private val context: Context) : Adapter<MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.main_line_view, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val note = notes[position]
        holder.let {
            holder.bind(note)
        }
    }

    override fun getItemCount(): Int {
        return notes.size
    }

}