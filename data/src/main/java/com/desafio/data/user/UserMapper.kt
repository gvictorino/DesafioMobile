package com.desafio.data.user

import com.desafio.data.user.api.UserModel
import com.desafio.domain.user.User

class UserMapper{
    companion object {
        fun from(userModel : UserModel) = User(
            userLogin = userModel.userLogin,
            userName = userModel.userName,
            userProfilePicUrl = userModel.userProfilePicUrl
        )
    }
}