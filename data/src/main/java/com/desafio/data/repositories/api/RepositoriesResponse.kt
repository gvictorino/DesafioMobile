package com.desafio.data.repositories.api

import com.google.gson.annotations.SerializedName

data class RepositoriesResponse(@SerializedName("total_count")
                                val repositoryTotalCount : Int = 0,

                                @SerializedName("imcomplete_results")
                                val repositoryImcompleteResults : Boolean = false,

                                @SerializedName("items")
                                val repositoryItems : List<RepositoryModel>)