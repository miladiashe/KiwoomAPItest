package com.example.kiwoomapitest.api

import android.util.Log
import com.example.kiwoomapitest.BuildConfig
import com.example.kiwoomapitest.api.data.TokenRequest


suspend fun initKiwoomApi(){
    val appKey = BuildConfig.KIWOOM_APP_KEY
    val secretKey = BuildConfig.KIWOOM_SECRET_KEY


    Log.d("kalla",
        RetrofitInstance.api.getToken(TokenRequest(appKey = appKey, secretKey = secretKey)).toString()
    )

}