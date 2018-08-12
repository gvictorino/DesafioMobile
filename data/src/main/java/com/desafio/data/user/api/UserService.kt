package com.desafio.data.user.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface UserService {
    @GET("users")
    fun getUser(@Path("login") login : String) : Call<UserModel>
}