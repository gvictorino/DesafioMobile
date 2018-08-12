package com.desafio.data.user.api

interface UserApiCallback {
    fun onResponse(user : UserModel)
    fun onFailure(throwable: Throwable)
}