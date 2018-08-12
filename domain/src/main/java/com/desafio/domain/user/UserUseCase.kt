package com.desafio.domain.user

import com.desafio.domain.UseCase

class UserUseCase(val mRepository: UserRepository) : UseCase<Unit>(),UserCallback {

    private lateinit var callback: UserCallback

    fun with(callback: UserCallback): UserUseCase {
        this.callback = callback
        return this
    }

    override fun execute() {
        mRepository.getUser(this)
    }

    override fun onSuccess(user: User) {
        callback.onSuccess(user)
    }

    override fun onFailure(throwable: Throwable) {
        callback.onFailure(throwable)
    }

}