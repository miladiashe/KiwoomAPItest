package com.example.kiwoomapitest.api.data

import com.google.gson.annotations.SerializedName


data class TokenRequest(
    @SerializedName("grant_type")
    val grantType: String = "client_credentials",

    @SerializedName("appkey")
    val appKey: String,

    @SerializedName("secretkey")
    val secretKey: String
)


data class TokenResponse(
    @SerializedName("expires_dt")
    val expiredDate: String,

    @SerializedName("token_type")
    val tokenType: String,

    @SerializedName("token")
    val token: String
)