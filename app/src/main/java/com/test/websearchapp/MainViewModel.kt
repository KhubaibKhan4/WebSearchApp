package com.test.websearchapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.websearchapp.model.Value
import com.test.websearchapp.model.WebSearch
import com.test.websearchapp.repository.Repository
import kotlinx.coroutines.launch
import retrofit2.Response


class MainViewModel(private val repository: Repository) : ViewModel() {
    val myResponse: MutableLiveData<Response<WebSearch>> = MutableLiveData()

    fun getWebSearch(query: String, pNumber: Int, pSize: Int, autoCorrect: Boolean) {
        viewModelScope.launch {
            val response: Response<WebSearch> =
                repository.getWebSearch(query, pNumber, pSize, autoCorrect)
            myResponse.value = response
        }
    }
}