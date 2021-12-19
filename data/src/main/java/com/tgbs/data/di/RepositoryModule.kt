package com.tgbs.data.di

import com.tgbs.data.api.NewsService
import com.tgbs.data.repository.NewsRepositoryImpl
import com.tgbs.domain.repository.NewsRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun subscribeRepository(service: NewsService): NewsRepository {
        return NewsRepositoryImpl(service)
    }
}