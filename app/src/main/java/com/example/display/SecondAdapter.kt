package com.example.display

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.desafio_android.R
import com.example.display.model.ResponseItem

class SecondAdapter(private val items: List<ResponseItem>, private val context: Context) :
    Adapter<SecondViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SecondViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.second_line_view, parent, false)
        return SecondViewHolder(view)
    }

    override fun onBindViewHolder(holder: SecondViewHolder, position: Int) {
        val item = items[position]
        holder.let {
            holder.secondBind(item)
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }
}