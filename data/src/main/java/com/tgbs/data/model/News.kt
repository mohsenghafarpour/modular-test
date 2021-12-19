package com.tgbs.data.model

import com.google.gson.annotations.SerializedName

data class News(
    @SerializedName("status")
    val status: String,
    @SerializedName("totalResults")
    val totalResult: Int,
    @SerializedName("articles")
    val articles: List<Article>
)
