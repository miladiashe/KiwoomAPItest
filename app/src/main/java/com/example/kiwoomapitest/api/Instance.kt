package com.example.kiwoomapitest.api

import com.example.kiwoomapitest.api.data.TokenRequest
import com.example.kiwoomapitest.api.data.TokenResponse
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.POST
import java.util.concurrent.TimeUnit

// 2. Retrofit 인스턴스
object RetrofitInstance {
    private const val BASE_URL = "https://api.kiwoom.com/"

    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        level = HttpLoggingInterceptor.Level.BODY
    }

    private val client = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .connectTimeout(30, TimeUnit.SECONDS)
        .build()

    val api: KiwoomApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .client(client)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(KiwoomApi::class.java)
    }
}

interface KiwoomApi {
    @POST("oauth2/token")
    suspend fun getToken(
        @Body request: TokenRequest
    ): Response<TokenResponse>
}