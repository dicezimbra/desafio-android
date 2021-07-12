package com.example

import Items
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio_android.R
import com.squareup.picasso.Picasso


class MainViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val title = itemView.findViewById<TextView>(R.id.title)
    val description = itemView.findViewById<TextView>(R.id.description)
    val forks_count = itemView.findViewById<TextView>(R.id.forks_count)
    val stargazer_count = itemView.findViewById<TextView>(R.id.stargazer_count)
    val username = itemView.findViewById<TextView>(R.id.user)
    val avatar = itemView.findViewById<ImageView>(R.id.imageView2)

    fun bind(item: Items) {

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