package com.example

import com.example.model.mainModel.MainReposResponse
import com.example.model.secondModel.SecondResponse
import retrofit2.http.GET

interface Endpoint {

    @GET("search/repositories?q=language:Java&sort=stars&page=1")
    suspend fun getPosts(): MainReposResponse

    @GET("repos/kdn251/interviews/pulls")
    suspend fun getMerge(): SecondResponse

}