package com.ellaclub.androidarchitectureexample.simplest.mvvm

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.widget.addTextChangedListener
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.ellaclub.androidarchitectureexample.R

class MVVMActivity : AppCompatActivity() {
    lateinit var textChangeVM: TextChangeViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simplest_activity_layout)
        val et1 = findViewById<AppCompatEditText>(R.id.et1)
        val tv1 = findViewById<TextView>(R.id.tv1)
        textChangeVM = ViewModelProvider(this).get(TextChangeViewModel::class.java)
        textChangeVM.editValue.value = "Hello World!"
        textChangeVM.editValue.observe(this, Observer {
            tv1.text = it
        })
        et1.addTextChangedListener {
            textChangeVM.editValue.value = it.toString()
        }
    }
}