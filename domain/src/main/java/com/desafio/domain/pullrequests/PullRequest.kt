package com.desafio.domain.pullrequests

open class PullRequest (val pullRequestUrl : String = "",
                        val pullRequestOpened : Int = 0,
                        val pullRequestClosed : Int = 0,
                        val pullRequestTitle : String = "",
                        val pullRequestDescription : String = "",
                        val pullRequestUsername : String = "",
                        val pullRequestFullUsername : String = "",
                        val pullRequestIconUrl : String = "")