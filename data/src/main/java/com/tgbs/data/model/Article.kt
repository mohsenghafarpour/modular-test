package com.tgbs.data.model

import com.google.gson.annotations.SerializedName

data class Article(
    @SerializedName("author")
    val author: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("url")
    val link: String,
    @SerializedName("urlToImage")
    val image: String,
    @SerializedName("publishedAt")
    val date: String,
    @SerializedName("content")
    val content: String
)
