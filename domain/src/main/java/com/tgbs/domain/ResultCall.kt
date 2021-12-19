package com.tgbs.domain

sealed class ResultCall<out T : Any> {

    data class Success<out T : Any>(val data: T) : ResultCall<T>()
    data class Error(val stringRes: String, val errorCode: Int) : ResultCall<Nothing>()
}