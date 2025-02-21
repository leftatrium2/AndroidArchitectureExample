package com.ellaclub.androidarchitectureexample.network.retrofit.api

import com.ellaclub.androidarchitectureexample.network.retrofit.bean.Base
import com.ellaclub.androidarchitectureexample.network.retrofit.bean.Data
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST
import retrofit2.http.Path

interface SearchApi {
    @FormUrlEncoded
    @POST("/article/query/{page_id}/json")
    fun search(@Path("page_id") pageId: Int, @Field("k") keyword: String): Call<Base<Data>>
}