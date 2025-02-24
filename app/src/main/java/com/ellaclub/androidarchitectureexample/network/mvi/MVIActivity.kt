package com.ellaclub.androidarchitectureexample.network.mvi

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.lifecycle.ViewModelProvider
import com.ellaclub.androidarchitectureexample.R

class MVIActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MVIActivity"
    }

    private lateinit var viewModel: SearchViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.network_activity_layout)
        viewModel = ViewModelProvider(this).get(SearchViewModel::class.java)
        val tv1 = findViewById<TextView>(R.id.tv1)
        val btn_search = findViewById<Button>(R.id.btn_search)
        val et1 = findViewById<AppCompatEditText>(R.id.et1)
        btn_search.setOnClickListener {
            if (et1.text.isNullOrEmpty()) {
                Log.e(TAG, "keyword is empty")
                return@setOnClickListener
            }
            viewModel.searchNow(et1.text.toString())
        }
        viewModel.state.observe(this) {
            tv1.text = it.result.data.datas[0].title
        }
    }
}