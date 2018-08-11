package com.desafio.domain.repositories

interface RepositoriesRepository {
    fun getListOfRepositories(callback: RepositoriesCallback, page : Int)
}