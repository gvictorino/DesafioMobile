package com.desafio.domain.repositories

open class Repositoy (val repositoryName : String = "",
                      val repositoryDescription : String = "",
                      val repositoryIconUrl : String = "",
                      val repositoryUsername : String = "",
                      val repositoryFullUsername : String = "",
                      val repositoryNumberOfForks : Int = 0,
                      val repositoryNumberOfStars : Int = 0)