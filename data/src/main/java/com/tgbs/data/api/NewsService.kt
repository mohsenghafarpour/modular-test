package com.tgbs.data.api

import com.tgbs.data.model.News
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {
    @GET("top-headlines")
    suspend fun getNews(
        @Query("sources") sources: String = "techcrunch",
        @Query("apiKey") apiKey: String = "95a7a91b22f74929b6159a2a4ea22cee"
    ): News
}