package com.desafio.domain.repositories

interface RepositoriesCallback {
    fun onSuccess(repositories : List<Repositoy> , nextPage : Int)
    fun onFailure(throwable: Throwable)
}