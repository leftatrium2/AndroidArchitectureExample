package com.ellaclub.androidarchitectureexample.simplest.mvc

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.widget.addTextChangedListener
import com.ellaclub.androidarchitectureexample.R

class MVCActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simplest_activity_layout)
        val tv1 = findViewById<TextView>(R.id.tv1)
        val et1 = findViewById<AppCompatEditText>(R.id.et1)
        et1.addTextChangedListener {
            tv1.text = it.toString()
        }
    }
}