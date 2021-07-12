package com.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio_android.R
import com.example.model.secondModel.SecondResponse
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondActivity :AppCompatActivity() {

    private val secondViewModel: SecondViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        init()
    }

    private fun init() {
        secondViewModel.repos.observe(this) { setupList(it) }
        secondViewModel.fetchRepos()
    }

    private fun setupList(reposResponse: SecondResponse) {
        val recyclerView = findViewById<RecyclerView>(R.id.secondRecycler)
        recyclerView.adapter = SecondAdapter(reposResponse.items, this)
        recyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )
    }

}