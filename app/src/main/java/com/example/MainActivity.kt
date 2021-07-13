package com.example

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio_android.R
import com.example.model.mainModel.Items
import com.example.model.mainModel.MainReposResponse
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val mainViewModel: MainViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init() {
        mainViewModel.repos.observe(this) { setupList(it) }
        mainViewModel.fetchRepos()
    }

    private fun setupList(reposResponse: MainReposResponse) {
        val recyclerView = findViewById<RecyclerView>(R.id.mainRecycler)
        recyclerView.adapter = MainAdapter(reposResponse.items, this, ::onItemClick)
        recyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )
    }

    fun onItemClick(item : Items){
        startActivity(SecondActivity.newInstance(this, item.owner.login, item.name))
    }

}
