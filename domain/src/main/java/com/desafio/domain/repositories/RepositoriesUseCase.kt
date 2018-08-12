package com.desafio.domain.repositories

import com.desafio.domain.UseCase

class RepositoriesUseCase(val mRepository : RepositoriesRepository) : UseCase<Unit>(),RepositoriesCallback {
    private var page : Int  = 1
    private var paginate : Boolean = false
    private lateinit var callback : RepositoriesCallback

    fun with(callback: RepositoriesCallback): RepositoriesUseCase {
        this.callback = callback
        return this
    }

    override fun execute() {
        mRepository.getListOfRepositories(this,page)
    }

    override fun onSuccess(repositories: List<Repository>, nextPage : Int) {
        callback.onSuccess(repositories,nextPage)
    }

    override fun onFailure(throwable: Throwable) {
        callback.onFailure(throwable)
    }

    fun paginate(){
        paginate = true
        page++
        execute()
    }

}