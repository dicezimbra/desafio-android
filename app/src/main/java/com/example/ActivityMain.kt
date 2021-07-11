package com.example

import Items
import android.content.Context
import android.content.ContextWrapper
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.desafio_android.R
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class ActivityMain : AppCompatActivity() {

    //Aplicação
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        notes()
    }

    //Listando manual para teste as string da tela
    private fun notes() : List<Items> {
        val aux:List<Items> = ArrayList()
        val retrofitClient =
            NetworkUtils.getRetrofitInstance("https://jsonplaceholder.typicode.com/")
        val endpoint = retrofitClient.create(Endpoint::class.java);
        val callback = endpoint.getPosts()

        callback.enqueue(object : Callback<List<Items>> {
            override fun onFailure(call: Call<List<Items>>, t: Throwable) {
                Toast.makeText(baseContext, t.message, Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<List<Items>>, response: Response<List<Items>>) {
                response.body()?.forEach {
                    val recyclerView =  findViewById<RecyclerView>(R.id.recycler_view_layout_recycler)
                    recyclerView.adapter = NoteListAdapter(notes(), baseContext)
                    val tv = findViewById<TextView>(R.id.y)//Adicionar o TextView (NullPointer exception))
                    tv.text.toString().plus(it)
                }
            }
        })
        return aux
    }
}
