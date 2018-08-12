package com.desafio.domain.user

interface UserCallback {
    fun onSuccess (user : User)
    fun onFailure (throwable: Throwable)
}