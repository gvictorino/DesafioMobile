package com.desafio.data.repositories

import com.desafio.data.repositories.api.RepositoriesResponse
import com.desafio.data.repositories.api.RepositoriesService
import com.desafio.domain.repositories.RepositoriesCallback
import com.desafio.domain.repositories.RepositoriesRepository
import com.desafio.domain.repositories.Repository
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RepositoriesManager() : RepositoriesRepository {

    private val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

    private val service = retrofit.create(RepositoriesService::class.java)

    override fun getListOfRepositories(callback: RepositoriesCallback, page: Int) {
        service.getRepositories("java", "stars", page).enqueue(object : Callback<RepositoriesResponse> {

            override fun onResponse(call: Call<RepositoriesResponse>, response: Response<RepositoriesResponse>) {
                if (response.isSuccessful) {
                    callback.onSuccess((response.body() as RepositoriesResponse).repositoryItems.map { RepositoriesMapper.from(it) }, page)
                } else
                    callback.onFailure(Throwable("Não completou requisição ou body nulo"))
            }

            override fun onFailure(call: Call<RepositoriesResponse>?, t: Throwable) {
                    callback.onFailure(t)
            }
        })
    }

    companion object {
        private const val BASE_URL = "https://api.github.com/search/"
    }
}
