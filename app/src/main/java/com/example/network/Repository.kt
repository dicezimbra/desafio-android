package com.example.network

import com.example.display.model.SecondRequest
import kotlinx.coroutines.flow.flow

class Repository(private val endpoint: Endpoint) {

    fun getRepos() = flow { emit(endpoint.getPosts()) }

    fun getMerges(secondRequest: SecondRequest) = flow { emit(endpoint.getMerge(secondRequest.login, secondRequest.name)) }
}

