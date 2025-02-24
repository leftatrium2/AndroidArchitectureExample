package com.ellaclub.androidarchitectureexample.network.mvi

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ellaclub.androidarchitectureexample.retrofit.RetrofitClient
import com.ellaclub.androidarchitectureexample.retrofit.bean.Base
import com.ellaclub.androidarchitectureexample.retrofit.bean.Data
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SearchViewModel : ViewModel() {
    companion object {
        const val TAG = "SearchViewModel"
    }

    val _state = MutableLiveData<SearchState>()
    val state: LiveData<SearchState> get() = _state

    fun searchNow(keyword: String) {
        RetrofitClient.search.search(0, keyword).enqueue(object : Callback<Base<Data>> {
            override fun onResponse(call: Call<Base<Data>>, response: Response<Base<Data>>) {
                Log.d(TAG, response.body().toString())
                val result = response.body()
                if (result == null || result.errorCode != 0) {
                    Log.e(TAG, "result is null or errorCode is not 0")
                    return
                }
                _state.value = SearchState(result)
            }

            override fun onFailure(call: Call<Base<Data>>, t: Throwable) {
                Log.e(TAG, t.message.toString())
            }

        })
    }
}

data class SearchState(val result: Base<Data>)