package com.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio_android.R

class ActivityMain : AppCompatActivity() {

    //Aplicação
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view_layout_recycler)
        recyclerView.adapter = NoteListAdapter(notes(), this)
        recyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )
        notes()
    }

    //Listando manual para teste as string da tela
    private fun notes(): List<Note> {
        return listOf(
            Note(
                "Aplicativo android",
                "Aplicativo criado como desafio para meu conhecimento",
                "AlessandrePorta",
                "Alessandre Luis Porta Junior",
                1,
                2
            ),
            Note(
                "Aplicativo android",
                "Aplicativo criado como desafio para meu conhecimento",
                "AlessandrePorta",
                "Alessandre Luis Porta Junior",
                1,
                2
            ),
            Note(
                "Aplicativo android",
                "Aplicativo criado como desafio para meu conhecimento",
                "AlessandrePorta",
                "Alessandre Luis Porta Junior",
                1,
                2
            ),
            Note(
                "Aplicativo android",
                "Aplicativo criado como desafio para meu conhecimento",
                "AlessandrePorta",
                "Alessandre Luis Porta Junior",
                1,
                2
            ),
            Note(
                "Aplicativo android",
                "Aplicativo criado como desafio para meu conhecimento",
                "AlessandrePorta",
                "Alessandre Luis Porta Junior",
                1,
                2
            ),
            Note(
                "Aplicativo android",
                "Aplicativo criado como desafio para meu conhecimento",
                "AlessandrePorta",
                "Alessandre Luis Porta Junior",
                1,
                2
            ),
            Note(
                "Aplicativo android",
                "Aplicativo criado como desafio para meu conhecimento",
                "AlessandrePorta",
                "Alessandre Luis Porta Junior",
                1,
                2
            ),
            Note(
                "Aplicativo android",
                "Aplicativo criado como desafio para meu conhecimento",
                "AlessandrePorta",
                "Alessandre Luis Porta Junior",
                1,
                2
            ),
            Note(
                "Aplicativo android",
                "Aplicativo criado como desafio para meu conhecimento",
                "AlessandrePorta",
                "Alessandre Luis Porta Junior",
                1,
                2
            ),
            Note(
                "Aplicativo android",
                "Aplicativo criado como desafio para meu conhecimento",
                "AlessandrePorta",
                "Alessandre Luis Porta Junior",
                1,
                2
            ),
            Note(
                "Aplicativo android",
                "Aplicativo criado como desafio para meu conhecimento",
                "AlessandrePorta",
                "Alessandre Luis Porta Junior",
                1,
                2
            )

        )
    }
}