package com.ellaclub.androidarchitectureexample.network.mvc

import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import com.ellaclub.androidarchitectureexample.R
import com.ellaclub.androidarchitectureexample.retrofit.RetrofitClient
import com.ellaclub.androidarchitectureexample.retrofit.bean.Base
import com.ellaclub.androidarchitectureexample.retrofit.bean.Data
import com.ellaclub.androidarchitectureexample.retrofit.const.Const
import retrofit2.Call
import retrofit2.Response

class MVCActivity : AppCompatActivity() {
    companion object {
        const val TAG = "network.mvc.MVCActivity"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.network_activity_layout)
        val btn1 = findViewById<Button>(R.id.btn_search)
        val et1 = findViewById<AppCompatEditText>(R.id.et1)
        val tv1 = findViewById<TextView>(R.id.tv1)
        btn1.setOnClickListener {
            if (et1.text.isNullOrEmpty()) {
                return@setOnClickListener
            }
            val keyword = et1.text.toString()
            RetrofitClient.search.search(0, keyword)
                .enqueue(object : retrofit2.Callback<Base<Data>> {
                    override fun onResponse(
                        call: Call<Base<Data>>,
                        response: Response<Base<Data>>,
                    ) {
                        Log.d(TAG, response.body().toString())
                        val response = response.body()
                        if (response?.errorCode == Const.Success) {
                            val data = response.data
                            if (data.datas.isEmpty()) return
                            tv1.text = data.datas[0].title
                        }
                    }

                    override fun onFailure(call: Call<Base<Data>>, t: Throwable) {
                        Log.e(TAG, t.message.toString())
                    }

                })
        }
    }
}