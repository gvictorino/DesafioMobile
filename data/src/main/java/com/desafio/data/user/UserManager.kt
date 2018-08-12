package com.desafio.data.user
import com.desafio.data.user.api.UserApiCallback
import com.desafio.data.user.api.UserApiClient
import com.desafio.data.user.api.UserModel
import com.desafio.domain.user.UserCallback
import com.desafio.domain.user.UserRepository

class UserManager : UserRepository {

    private lateinit var client: UserApiClient
    private lateinit var mCallback: UserCallback

    fun UserManager(client: UserApiClient) {
        this.client = client
    }


    override fun getUser(callback: UserCallback, userLogin: String) {
        this.mCallback = callback

        client.getUser(userLogin, object : UserApiCallback {

            override fun onResponse(user: UserModel) {
                mCallback.onSuccess(UserMapper.from(user))
            }

            override fun onFailure(t: Throwable) {
                mCallback.onFailure(t)
            }
        })
    }

}