package com.desafio.domain.pullrequests

interface PullRequestsCallback {
    fun onSuccess(pullRequests : List<PullRequest>, nextPage : Int)
    fun onFailure(throwable: Throwable)
}