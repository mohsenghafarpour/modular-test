package com.tgbs.data

import android.util.Log
import com.tgbs.domain.ResultCall
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

suspend fun <T : Any> safeApiCall(
    call: suspend () -> ResultCall<T>
): ResultCall<T> {
    return withContext(Dispatchers.Main) {
        try {
            withContext(Dispatchers.IO) {
                call()
            }
        } catch (e: Exception) {
            Log.e("Error Tag", "safeApiCall: $e ")
            ResultCall.Error("error", 0)
        }
    }
}