package com.desafio.data.user.api

import com.google.gson.annotations.SerializedName

class UserModel(@SerializedName("login")
                val userLogin : String = "",

                @SerializedName("name")
                val userName : String = "",

                @SerializedName("avatar_url")
                val userProfilePicUrl : String)