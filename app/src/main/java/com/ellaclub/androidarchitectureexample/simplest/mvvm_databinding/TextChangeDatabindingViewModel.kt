package com.ellaclub.androidarchitectureexample.simplest.mvvm_databinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextChangeDataBindingViewModel : ViewModel() {
    var editValue: MutableLiveData<String> = MutableLiveData()
    fun changeText() {
        val currTS = System.currentTimeMillis()
        editValue.value = currTS.toString()
    }

}