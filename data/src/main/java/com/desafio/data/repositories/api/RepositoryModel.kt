package com.desafio.data.repositories.api

import com.google.gson.annotations.SerializedName

class RepositoryModel(@SerializedName ("name")
                 val repositoryName : String = "",

                      @SerializedName("description")
                 val repositoryDescription : String ="",

                      @SerializedName("forks_count")
                 val repositoryNumberOfForks : Int = 0,

                      @SerializedName("stargazers_count")
                 val repositoryNumberOfStars : Int = 0)