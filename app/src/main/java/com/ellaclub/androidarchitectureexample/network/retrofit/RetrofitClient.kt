package com.ellaclub.androidarchitectureexample.network.retrofit

import com.ellaclub.androidarchitectureexample.network.retrofit.api.SearchApi
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object RetrofitClient {
    val client: Retrofit.Builder by lazy {
        val okHttpClient = OkHttpClient.Builder().readTimeout(5, TimeUnit.SECONDS)
            .writeTimeout(5, TimeUnit.SECONDS).connectTimeout(5, TimeUnit.SECONDS).build()
        Retrofit.Builder().baseUrl("https://www.wanandroid.com").client(okHttpClient)
            .addConverterFactory(GsonConverterFactory.create())
    }

    val search: SearchApi by lazy {
        client.build().create(SearchApi::class.java)
    }
}