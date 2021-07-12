package com.example

import kotlinx.coroutines.flow.flow

class Repository(private val endpoint: Endpoint) {

    fun getRepos() = flow { emit(endpoint.getPosts()) }

}