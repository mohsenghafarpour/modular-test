package com.tgbs.data.repository

import com.tgbs.data.api.NewsService
import com.tgbs.data.safeApiCall
import com.tgbs.domain.ResultCall
import com.tgbs.domain.model.News
import com.tgbs.domain.repository.NewsRepository

class NewsRepositoryImpl(private val service: NewsService) : NewsRepository {

    override suspend fun getNews(): ResultCall<List<News>> = safeApiCall {
        val data = service.getNews().articles.map {
            News(it.title, it.description, it.image)
        }
        return@safeApiCall ResultCall.Success(data)
    }
}