package com.example

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio_android.R

class NoteViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    //Declarando os itens de cada linha
    val title = itemView.findViewById<TextView>(R.id.title)
    val description = itemView.findViewById<TextView>(R.id.description)
    val user = itemView.findViewById<TextView>(R.id.user)
    val name = itemView.findViewById<TextView>(R.id.name)
    val x = itemView.findViewById<TextView>(R.id.x)
    val y = itemView.findViewById<TextView>(R.id.y)

    fun bind(note:Note){
        title.text = note.title
        description.text = note.description
        user.text = note.user
        name.text = note.name
        x.text = note.x.toString()
        y.text = note.y.toString()
    }
}