package com.example

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.desafio_android.R
import com.example.model.mainModel.Items

class MainAdapter(
    private val items: List<Items>,
    private val context: Context,
    private val onClick: (Items) -> Unit
) :
    Adapter<MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.main_line_view, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        val item = items[position]
        holder.bind(item, onClick)

    }

    override fun getItemCount(): Int {
        return items.size
    }

}