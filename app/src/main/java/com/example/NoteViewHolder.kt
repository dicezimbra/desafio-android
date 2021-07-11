package com.example

import Items
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
    val forks = itemView.findViewById<TextView>(R.id.x)
    val stargazers_count = itemView.findViewById<TextView>(R.id.y)

    fun bind(note:Items){
        user.text = note.name
        name.text = note.full_name
        description.text = note.description
        title.text = note.title
        forks.text = Integer.parseInt(note.forks.toString()).toString()
        stargazers_count.text = Integer.parseInt(note.stargazers_count.toString()).toString()

    }
}