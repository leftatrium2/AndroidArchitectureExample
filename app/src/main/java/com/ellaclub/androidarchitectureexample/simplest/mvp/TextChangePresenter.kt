package com.ellaclub.androidarchitectureexample.simplest.mvp

class TextChangePresenter(val textChange: ITextChange) {
    fun setTextView(currValue: String) {
        textChange.setText(currValue)
    }
}