package com.example

import com.example.model.mainModel.MainReposResponse
import com.example.model.secondModel.ResponseItem
import retrofit2.http.GET
import retrofit2.http.Path

interface Endpoint {

    @GET("search/repositories?q=language:Java&sort=stars&page=1")
    suspend fun getPosts(): MainReposResponse

    @GET("repos/{login}/{name}/pulls")
    suspend fun getMerge(
        @Path("login") login: String,
        @Path("name") repoName: String
    ): List<ResponseItem>

}