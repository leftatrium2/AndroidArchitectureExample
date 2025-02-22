package com.ellaclub.androidarchitectureexample.network.mvp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import com.ellaclub.androidarchitectureexample.R
import com.ellaclub.androidarchitectureexample.retrofit.bean.Base
import com.ellaclub.androidarchitectureexample.retrofit.bean.Data

class MVPActivity : AppCompatActivity(), ISearchView {
    lateinit var searchPresenter: SearchPresenter
    lateinit var tv1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.network_activity_layout)
        val btn1 = findViewById<Button>(R.id.btn_search)
        val et1 = findViewById<AppCompatEditText>(R.id.et1)
        tv1 = findViewById<TextView>(R.id.tv1)
        searchPresenter = SearchPresenter(this)
        btn1.setOnClickListener {
            if (et1.text.isNullOrEmpty()) {
                return@setOnClickListener
            }
            val keyword = et1.text.toString()
            searchPresenter.search(0, keyword)
        }
    }

    override fun onSearch(searchResult: Base<Data>) {
        tv1.text = searchResult.data.datas[0].title
    }
}