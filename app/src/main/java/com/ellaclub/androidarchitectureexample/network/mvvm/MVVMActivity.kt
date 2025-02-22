package com.ellaclub.androidarchitectureexample.network.mvvm

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.ellaclub.androidarchitectureexample.R
import com.ellaclub.androidarchitectureexample.network.retrofit.RetrofitClient
import com.ellaclub.androidarchitectureexample.network.retrofit.bean.Base
import com.ellaclub.androidarchitectureexample.network.retrofit.bean.Data
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MVVMActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MVVMActivity"
    }

    lateinit var searchVM: SearchViewModel
    lateinit var tv1: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
        setContentView(R.layout.network_activity_layout)
        tv1 = findViewById(R.id.tv1)
        val btn1 = findViewById<Button>(R.id.btn_search)
        val et1 = findViewById<AppCompatEditText>(R.id.et1)
        btn1.setOnClickListener {
            RetrofitClient.search.search(0, et1.text.toString())
                .enqueue(object : Callback<Base<Data>> {
                    override fun onResponse(
                        call: Call<Base<Data>>,
                        response: Response<Base<Data>>,
                    ) {
                        val result = response.body()
                        if (result != null && result.errorCode == 0) {
                            searchVM.searchText.value = result
                        }
                    }

                    override fun onFailure(call: Call<Base<Data>>, t: Throwable) {
                        Log.e(TAG, t.message.toString())
                    }
                })
        }
    }

    private fun initViewModel() {
        searchVM = ViewModelProvider(this).get(SearchViewModel::class.java)
        searchVM.searchText.observe(this, Observer {
            tv1.text = it.data.datas[0].title
        })
    }
}