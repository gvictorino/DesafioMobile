package com.desafio.data.user.api

import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UserApiClient {

    private val BASE_URL = "https://api.github.com/"
    private lateinit var service: UserService

    fun UserApiClient(){

        val retrofit = Retrofit.Builder().baseUrl(BASE_URL).addConverterFactory(GsonConverterFactory.create()).build()
        this.service = retrofit.create<UserService>(UserService::class.java)
    }

    fun getUser(userLogin: String, callback: UserApiCallback) {
        service.getUser(userLogin).enqueue(object : Callback<UserModel> {
            override fun onResponse(call: Call<UserModel>, response: Response<UserModel>) {
                if (response.isSuccessful && response.body() != null)
                    callback.onResponse(response.body() as UserModel)
                else
                    callback.onFailure(Throwable("Não completou requisição ou body nulo"))
            }

            override fun onFailure(call: Call<UserModel>, t: Throwable) {
                callback.onFailure(t)
            }
        })

    }
}