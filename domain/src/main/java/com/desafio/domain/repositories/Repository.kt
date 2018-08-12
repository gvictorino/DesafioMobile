package com.desafio.domain.repositories

open class Repository (val repositoryName : String = "",
                       val repositoryDescription : String = "",
                       val repositoryNumberOfForks : Int = 0,
                       val repositoryNumberOfStars : Int = 0)