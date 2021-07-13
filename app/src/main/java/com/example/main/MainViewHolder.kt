package com.example.main

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio_android.R
import com.example.main.model.Items
import com.squareup.picasso.Picasso


class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val title = itemView.findViewById<TextView>(R.id.title)
    val description = itemView.findViewById<TextView>(R.id.description)
    val forks_count = itemView.findViewById<TextView>(R.id.forks_count)
    val stargazer_count = itemView.findViewById<TextView>(R.id.stargazer_count)
    val username = itemView.findViewById<TextView>(R.id.user)
    val avatar = itemView.findViewById<ImageView>(R.id.imageView2)
    val container = itemView.findViewById<View>(R.id.main_line_view)

    fun bind(item: Items, onCLick: (Items) -> Unit) {

        container.setOnClickListener { onCLick(item) }
        title.text = item.name
        description.text = item.description
        forks_count.text = item.forks_count.toString()
        stargazer_count.text = item.stargazers_count.toString()
        username.text = item.owner.login
        Picasso.get()
            .load(item.owner.avatar_url)
            .placeholder(R.drawable.avatar)
            .into(avatar)
    }
}