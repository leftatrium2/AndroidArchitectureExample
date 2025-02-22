package com.ellaclub.androidarchitectureexample.retrofit.bean

data class Base<T>(
    val errorCode: Int = 0,
    val errorMsg: String = "",
    val data: T,
)