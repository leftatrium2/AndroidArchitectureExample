package com.ellaclub.androidarchitectureexample.simplest.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextChangeViewModel : ViewModel() {
    var editValue: MutableLiveData<String> = MutableLiveData()
}