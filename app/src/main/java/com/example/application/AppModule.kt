package com.example.application

import com.example.network.Endpoint
import com.example.main.MainViewModel
import com.example.network.Repository
import com.example.display.SecondViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {
    factory { Repository(get()) }
    viewModel { MainViewModel(get()) }
    viewModel { SecondViewModel(get()) }
}

val netWorkModule = module {
    factory {
        Retrofit.Builder()
            .baseUrl("https://api.github.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
    factory { get<Retrofit>().create(Endpoint::class.java) }
}
