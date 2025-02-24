package com.ellaclub.androidarchitectureexample.simplest.mvi

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ellaclub.androidarchitectureexample.R

class MVIActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.simplest_activity_layout)
    }
}