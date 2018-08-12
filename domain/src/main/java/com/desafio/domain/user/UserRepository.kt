package com.desafio.domain.user

interface UserRepository {
    fun getUser(callback: UserCallback,userLogin : String)
}