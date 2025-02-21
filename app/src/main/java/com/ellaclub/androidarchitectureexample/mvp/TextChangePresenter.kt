package com.ellaclub.androidarchitectureexample.mvp

class TextChangePresenter(val textChange: ITextChange) {
    fun setTextView(currValue: String) {
        textChange.setText(currValue)
    }
}