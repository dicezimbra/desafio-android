package com.example

import Items
import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import com.example.desafio_android.R
import retrofit2.Call
import retrofit2.Callback
import kotlin.coroutines.coroutineContext

class NoteListAdapter(private val notes: List<Items>, private val context: Context) : Adapter<NoteViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NoteViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.main_line_view, parent, false)
        return NoteViewHolder(view)
    }

    override fun onBindViewHolder(holder: NoteViewHolder, position: Int) {
        val note = notes[position]
        holder.let {
            holder.bind(note)
        }
    }

    override fun getItemCount(): Int {
        return notes.size
    }

}