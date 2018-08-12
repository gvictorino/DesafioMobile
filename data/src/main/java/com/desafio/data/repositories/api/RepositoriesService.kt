package com.desafio.data.repositories.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface RepositoriesService {

    @GET("repositories")
     fun getRepositories(@Query("q") language : String,
                         @Query("sort") sortedBy : String,
                         @Query("page") page: Int): Call<RepositoriesResponse>
}