package com.ellaclub.androidarchitectureexample.mvvm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextChangeViewModel : ViewModel() {
    var editValue: MutableLiveData<String> = MutableLiveData()
}