package com.example.display

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio_android.R
import com.example.display.model.ResponseItem
import com.example.display.model.SecondRequest
import org.koin.androidx.viewmodel.ext.android.viewModel

class SecondActivity : AppCompatActivity() {

    private val secondViewModel: SecondViewModel by viewModel()

    companion object {
        private const val EXTRA_KEY = "extra_key"
        fun newInstance(context: Context, login:String, name:String) : Intent{
            val intent = Intent(context, SecondActivity::class.java)
            intent.putExtra(EXTRA_KEY, SecondRequest(login, name))
            return intent
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        init()
    }

    private fun init() {
        secondViewModel.repos.observe(this) { setupList(it) }
        secondViewModel.fetchRepos(intent.extras?.getSerializable(EXTRA_KEY) as SecondRequest)
    }

    private fun setupList(reposResponse: List<ResponseItem>) {
        val recyclerView = findViewById<RecyclerView>(R.id.secondRecycler)
        recyclerView.adapter = SecondAdapter(reposResponse, this)
        recyclerView.addItemDecoration(
            DividerItemDecoration(this, DividerItemDecoration.VERTICAL)
        )
    }

}