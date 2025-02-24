package com.ellaclub.androidarchitectureexample.simplest.mvi

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.ellaclub.androidarchitectureexample.R

class MVIActivity : AppCompatActivity() {
    private lateinit var viewModel: TextChangeViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simplest_activity_layout)
        val et1 = findViewById<AppCompatEditText>(R.id.et1)
        val tv1 = findViewById<TextView>(R.id.tv1)
        et1.addTextChangedListener {
            viewModel.onTextChanged(it.toString())
        }
        viewModel = ViewModelProvider(this).get(TextChangeViewModel::class.java)
        viewModel.state.observe(this, Observer {
            tv1.text = it.editText
        })
    }
}