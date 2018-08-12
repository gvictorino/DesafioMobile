package com.desafio.data.repositories

import com.desafio.data.repositories.api.RepositoryModel
import com.desafio.domain.repositories.Repository

class RepositoriesMapper {
    companion object {
        fun from(repositoryModel: RepositoryModel) = Repository(
                repositoryName = repositoryModel.repositoryName,
                repositoryDescription = repositoryModel.repositoryDescription,
                repositoryNumberOfForks = repositoryModel.repositoryNumberOfForks,
                repositoryNumberOfStars = repositoryModel.repositoryNumberOfStars
        )
    }
}