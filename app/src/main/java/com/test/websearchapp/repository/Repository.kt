package com.test.websearchapp.repository

import com.test.websearchapp.api.RetrofitInstnace
import com.test.websearchapp.model.WebSearch
import retrofit2.Response

class Repository {
    suspend fun getWebSearch(
        query: String,
        pageNumber: Int,
        pageSize: Int,
        autoCorrect: Boolean
    ): Response<WebSearch> {
        return RetrofitInstnace.api.getWebSearch(query,pageNumber,pageSize,autoCorrect)
    }
}