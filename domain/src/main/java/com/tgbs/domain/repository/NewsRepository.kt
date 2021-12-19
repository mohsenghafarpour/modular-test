package com.tgbs.domain.repository

import com.tgbs.domain.ResultCall
import com.tgbs.domain.model.News

interface NewsRepository {

    suspend fun getNews(): ResultCall<List<News>>
}