package com.ellaclub.androidarchitectureexample.network.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ellaclub.androidarchitectureexample.retrofit.bean.Base
import com.ellaclub.androidarchitectureexample.retrofit.bean.Data

class SearchViewModel : ViewModel() {
    var searchText: MutableLiveData<Base<Data>> = MutableLiveData()
}