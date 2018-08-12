package com.desafio.domain.user

import com.desafio.domain.UseCase

class UserUseCase(val mRepository: UserRepository) : UseCase<Unit>(),UserCallback {

    private lateinit var callback: UserCallback
    private var user : User = User()
    private var userLogin : String = ""

    fun with(callback: UserCallback, user : User ): UserUseCase {
        this.callback = callback
        this.user = user
        return this
    }

    override fun execute() {
        userLogin = user.userLogin
        mRepository.getUser(this,userLogin)
    }

    override fun onSuccess(user: User) {
        callback.onSuccess(user)
    }

    override fun onFailure(throwable: Throwable) {
        callback.onFailure(throwable)
    }

}