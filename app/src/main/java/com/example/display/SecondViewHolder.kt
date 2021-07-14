package com.example.display

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio_android.R
import com.example.display.model.ResponseItem
import com.squareup.picasso.Picasso

class SecondViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    val title = itemView.findViewById<TextView>(R.id.second_title)
    val description = itemView.findViewById<TextView>(R.id.second_description)
    val user = itemView.findViewById<TextView>(R.id.second_username)
    val avatar = itemView.findViewById<ImageView>(R.id.second_avatar)

    fun secondBind(item: ResponseItem) {
        title.text = item.title
        description.text = item.base?.repo?.description
        user.text = item.user?.login
        Picasso.get()
            .load(item.user?.avatarUrl)
            .placeholder(R.drawable.avatar)
            .into(avatar)
    }
}