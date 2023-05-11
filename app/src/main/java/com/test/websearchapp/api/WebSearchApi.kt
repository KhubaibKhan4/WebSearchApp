package com.test.websearchapp.api

import com.test.websearchapp.model.Value
import com.test.websearchapp.model.WebSearch
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.Query

interface WebSearchApi {
    @Headers("Add your Api Headers"
    )
    @GET("WebSearchAPI")
    suspend fun getWebSearch(
        @Query("q") query: String,
        @Query("pageNumber") pNumber: Int,
        @Query("pageSize") pSize: Int,
        @Query("autoCorrect") autoCorrect: Boolean

    ): Response<WebSearch>
}