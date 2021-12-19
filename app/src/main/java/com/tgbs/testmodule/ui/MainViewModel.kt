package com.tgbs.testmodule.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.tgbs.domain.ResultCall
import com.tgbs.domain.repository.NewsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private val repo: NewsRepository) : ViewModel() {

    fun getData() {
        viewModelScope.launch {
            when (val result = repo.getNews()) {
                is ResultCall.Success -> {
                    Log.d("xxx", "success: $result")
                }
                is ResultCall.Error -> {
                    Log.d("xxx", "error: $result")
                }
            }
        }
    }

}