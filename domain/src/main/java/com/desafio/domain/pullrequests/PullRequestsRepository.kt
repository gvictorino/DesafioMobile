package com.desafio.domain.pullrequests

interface PullRequestsRepository {
    fun getListOfPullRequests(callback : PullRequestsCallback, page : Int)
}