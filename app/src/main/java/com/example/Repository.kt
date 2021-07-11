package com.example

import ReposResponse
import kotlinx.coroutines.flow.flow

class Repository (private val endpoint: Endpoint){

    fun getRepos() = flow<ReposResponse>{endpoint.getPosts()}

}