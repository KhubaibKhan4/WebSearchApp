package com.test.websearchapp.api

import com.test.websearchapp.util.Constant.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitInstnace {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: WebSearchApi by lazy {
        retrofit.create(WebSearchApi::class.java)
    }
}