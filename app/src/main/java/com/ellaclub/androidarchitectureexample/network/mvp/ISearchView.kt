package com.ellaclub.androidarchitectureexample.network.mvp

import com.ellaclub.androidarchitectureexample.retrofit.bean.Base
import com.ellaclub.androidarchitectureexample.retrofit.bean.Data

interface ISearchView {
    fun onSearch(searchResult: Base<Data>)
}