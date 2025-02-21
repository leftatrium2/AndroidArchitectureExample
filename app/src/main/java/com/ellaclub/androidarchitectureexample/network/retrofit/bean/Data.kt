package com.ellaclub.androidarchitectureexample.network.retrofit.bean

data class Data(
    val curPage: Int,
    val datas: List<Article>,
    val offset: Int,
    val over: Boolean,
    val pageCount: Int,
    val size: Int,
    val total: Int,
)
