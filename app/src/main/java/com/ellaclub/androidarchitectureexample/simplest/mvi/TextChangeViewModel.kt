package com.ellaclub.androidarchitectureexample.simplest.mvi

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextChangeViewModel : ViewModel() {
    private var _state: MutableLiveData<TextState> = MutableLiveData()
    val state: LiveData<TextState> get() = _state

    init {
        _state.value = TextState("Hello World!")
    }

    fun onTextChanged(newValue: String) {
        _state.value = _state.value?.copy(editText = newValue)
    }
}

data class TextState(val editText: String)