package com.desafio.domain.pullrequests

import com.desafio.domain.UseCase

class PullRequestsUseCase(val repository: PullRequestsRepository): UseCase<Unit>(),PullRequestsCallback{
    private var page : Int = 0
    private var paginate : Boolean = false
    private lateinit var callback : PullRequestsCallback

    fun with(callback: PullRequestsCallback): PullRequestsUseCase {
        this.callback = callback
        return this
    }

    override fun execute() {
        repository.getListOfPullRequests(this,page)
    }

    override fun onSuccess(pullRequests: List<PullRequest>, nextPage : Int) {
        callback.onSuccess(pullRequests,nextPage)
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