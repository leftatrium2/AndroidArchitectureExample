package com.ellaclub.androidarchitectureexample.network.mvp

import com.ellaclub.androidarchitectureexample.network.retrofit.bean.Base
import com.ellaclub.androidarchitectureexample.network.retrofit.bean.Data

interface ISearchView {
    fun onSearch(searchResult: Base<Data>)
}