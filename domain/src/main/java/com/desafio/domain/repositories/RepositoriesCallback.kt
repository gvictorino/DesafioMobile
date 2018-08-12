package com.desafio.domain.repositories

interface RepositoriesCallback {
    fun onSuccess(repositories : List<Repository>, nextPage : Int)
    fun onFailure(throwable: Throwable)
}