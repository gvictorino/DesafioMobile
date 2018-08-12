package com.desafio.data.user

import com.desafio.data.repositories.RepositoriesManager
import com.desafio.data.user.api.UserModel
import com.desafio.data.user.api.UserService
import com.desafio.domain.repositories.RepositoriesCallback
import com.desafio.domain.user.UserCallback
import com.desafio.domain.user.UserRepository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class UserManager : UserRepository {

    private val retrofit = Retrofit.Builder()
            .baseUrl(RepositoriesManager.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    private val service = retrofit.create(UserService::class.java)

    override fun getUser(callback: UserCallback, userLogin : String) {
        service.getUser(userLogin).enqueue(object : Callback<UserModel>{

            override fun onResponse(call: Call<UserModel>?, response: Response<UserModel>?) {
            }
            override fun onFailure(call: Call<UserModel>?, t: Throwable?) {
            }


        })

    }

    companion object {
        private const val BASE_URL = "https://api.github.com/"
    }
}