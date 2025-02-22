package com.ellaclub.androidarchitectureexample.network.mvp

import android.util.Log
import com.ellaclub.androidarchitectureexample.retrofit.RetrofitClient
import com.ellaclub.androidarchitectureexample.retrofit.bean.Base
import com.ellaclub.androidarchitectureexample.retrofit.bean.Data
import retrofit2.Call
import retrofit2.Response

class SearchPresenter(val view: ISearchView) {
    companion object {
        const val TAG = "SearchPresenter"
    }

    fun search(pageNo: Int, keyword: String) {
        RetrofitClient.search.search(pageNo, keyword)
            .enqueue(object : retrofit2.Callback<Base<Data>> {
                override fun onResponse(call: Call<Base<Data>>, response: Response<Base<Data>>) {
                    val content = response.body()
                    if (content != null && content.errorCode == 0) {
                        view.onSearch(content)
                    }
                }

                override fun onFailure(call: Call<Base<Data>>, t: Throwable) {
                    Log.e(TAG, "onFailure: ${t.message}")
                }

            })
    }
}