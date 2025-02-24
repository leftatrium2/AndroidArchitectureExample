package com.ellaclub.androidarchitectureexample.simplest.mvvm_databinding

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatEditText
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.ellaclub.androidarchitectureexample.R
import com.ellaclub.androidarchitectureexample.databinding.SimplestDatabindingActivityLayoutBinding

/**
 * An example of using DataBinding
 * DataBinding is rarely used in actual projects due to its lack of flexibility
 */
class MVVMDataBindingActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MVVMDataBindingActivity"
    }

    private lateinit var viewModel: TextChangeDataBindingViewModel
    private lateinit var databinding: SimplestDatabindingActivityLayoutBinding
    private lateinit var editText: AppCompatEditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        databinding =
            DataBindingUtil.setContentView(this, R.layout.simplest_databinding_activity_layout)
        viewModel = ViewModelProvider(this).get(TextChangeDataBindingViewModel::class.java)
        viewModel.editValue.value = "Hello World!"
        databinding.lifecycleOwner = this
        databinding.textChanging = viewModel
        editText = findViewById(R.id.et1)
        editText.addTextChangedListener {
            Log.d(TAG, "onCreate: ${it.toString()}")
            viewModel.editValue.value = it.toString()
        }
    }
}