package com.ellaclub.androidarchitectureexample.mvp

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.widget.addTextChangedListener
import com.ellaclub.androidarchitectureexample.R

class MVPActivity : AppCompatActivity(), ITextChange {
    lateinit var tv1: TextView
    lateinit var et1: AppCompatEditText
    lateinit var presenter: TextChangePresenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mvp_activity_layout)
        presenter = TextChangePresenter(this)
        tv1 = findViewById(R.id.tv1)
        et1 = findViewById(R.id.et1)
        et1.addTextChangedListener {
            presenter.setTextView(it.toString())
        }
    }

    override fun setText(currValue: String) {
        tv1.text = currValue
    }
}