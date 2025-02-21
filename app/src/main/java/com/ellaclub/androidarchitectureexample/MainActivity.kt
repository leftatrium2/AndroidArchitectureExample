package com.ellaclub.androidarchitectureexample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.ellaclub.androidarchitectureexample.compose.ComposeActivity
import com.ellaclub.androidarchitectureexample.mvc.MVCActivity
import com.ellaclub.androidarchitectureexample.mvi.MVIActivity
import com.ellaclub.androidarchitectureexample.mvp.MVPActivity
import com.ellaclub.androidarchitectureexample.mvvm.MVVMActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_layout)
        // mvc example
        val gotoMVCButton = findViewById<Button>(R.id.go_to_mvc)
        gotoMVCButton.setOnClickListener {
            val intent = Intent(this@MainActivity, MVCActivity::class.java)
            startActivity(intent)
        }
        val gotoMVPButton = findViewById<Button>(R.id.go_to_mvp)
        gotoMVPButton.setOnClickListener {
            val intent = Intent(this@MainActivity, MVPActivity::class.java)
            startActivity(intent)
        }
        val gotoMVVMButton = findViewById<Button>(R.id.go_to_mvvm)
        gotoMVVMButton.setOnClickListener {
            val intent = Intent(this@MainActivity, MVVMActivity::class.java)
            startActivity(intent)
        }
        val gotoMVIButton = findViewById<Button>(R.id.go_to_mvi)
        gotoMVIButton.setOnClickListener {
            val intent = Intent(this@MainActivity, MVIActivity::class.java)
            startActivity(intent)
        }
        val gotoComposeButton = findViewById<Button>(R.id.go_to_compose)
        gotoComposeButton.setOnClickListener {
            val intent = Intent(this@MainActivity, ComposeActivity::class.java)
            startActivity(intent)
        }
    }
}