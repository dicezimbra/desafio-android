package com.example

import ReposResponse
import retrofit2.http.GET

interface Endpoint {

    @GET("search/repositories?q=language:Java&sort=stars&page=1")
    suspend fun getPosts(): ReposResponse

}