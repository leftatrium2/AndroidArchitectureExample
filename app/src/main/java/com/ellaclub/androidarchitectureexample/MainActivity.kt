package com.ellaclub.androidarchitectureexample

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.ellaclub.androidarchitectureexample.simplest.compose.ComposeActivity
import com.ellaclub.androidarchitectureexample.simplest.mvc.MVCActivity
import com.ellaclub.androidarchitectureexample.simplest.mvi.MVIActivity
import com.ellaclub.androidarchitectureexample.simplest.mvp.MVPActivity
import com.ellaclub.androidarchitectureexample.simplest.mvvm.MVVMActivity
import com.ellaclub.androidarchitectureexample.simplest.mvvm_databinding.MVVMDataBindingActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_layout)
        // simplest example
        val gotoMVCButton = findViewById<Button>(R.id.go_to_simplest_mvc)
        gotoMVCButton.setOnClickListener {
            val intent = Intent(this@MainActivity, MVCActivity::class.java)
            startActivity(intent)
        }
        val gotoMVPButton = findViewById<Button>(R.id.go_to_simplest_mvp)
        gotoMVPButton.setOnClickListener {
            val intent = Intent(this@MainActivity, MVPActivity::class.java)
            startActivity(intent)
        }
        val gotoMVVMButton = findViewById<Button>(R.id.go_to_simplest_mvvm)
        gotoMVVMButton.setOnClickListener {
            val intent = Intent(this@MainActivity, MVVMActivity::class.java)
            startActivity(intent)
        }
        val gotoMVVMDatabindingButton = findViewById<Button>(R.id.go_to_simplest_mvvm_databinding)
        gotoMVVMDatabindingButton.setOnClickListener {
            val intent = Intent(this@MainActivity, MVVMDataBindingActivity::class.java)
            startActivity(intent)
        }
        val gotoMVIButton = findViewById<Button>(R.id.go_to_simplest_mvi)
        gotoMVIButton.setOnClickListener {
            val intent = Intent(this@MainActivity, MVIActivity::class.java)
            startActivity(intent)
        }
        val gotoComposeButton = findViewById<Button>(R.id.go_to_simplest_compose)
        gotoComposeButton.setOnClickListener {
            val intent = Intent(this@MainActivity, ComposeActivity::class.java)
            startActivity(intent)
        }
        // network example
        val gotoNetworkMVCButton = findViewById<Button>(R.id.go_to_network_mvc)
        gotoNetworkMVCButton.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                com.ellaclub.androidarchitectureexample.network.mvc.MVCActivity::class.java
            )
            startActivity(intent)
        }
        val gotoNetworkMVPButton = findViewById<Button>(R.id.go_to_network_mvp)
        gotoNetworkMVPButton.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                com.ellaclub.androidarchitectureexample.network.mvp.MVPActivity::class.java
            )
            startActivity(intent)
        }
        val gotoNetworkMVVMButton = findViewById<Button>(R.id.go_to_network_mvvm)
        gotoNetworkMVVMButton.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                com.ellaclub.androidarchitectureexample.network.mvvm.MVVMActivity::class.java
            )
            startActivity(intent)
        }
        val gotoNetworkMVIButton = findViewById<Button>(R.id.go_to_network_mvi)
        gotoNetworkMVIButton.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                com.ellaclub.androidarchitectureexample.network.mvi.MVIActivity::class.java
            )
            startActivity(intent)
        }
        val gotoNetworkComposeButton = findViewById<Button>(R.id.go_to_network_compose)
        gotoNetworkComposeButton.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                com.ellaclub.androidarchitectureexample.network.compose.ComposeActivity::class.java
            )
            startActivity(intent)
        }
        // feeds example
        val gotoFeedsMVCButton = findViewById<Button>(R.id.go_to_feeds_mvc)
        gotoFeedsMVCButton.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                com.ellaclub.androidarchitectureexample.feeds.mvc.MVCActivity::class.java
            )
            startActivity(intent)
        }
        val gotoFeedsMVPButton = findViewById<Button>(R.id.go_to_feeds_mvp)
        gotoFeedsMVPButton.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                com.ellaclub.androidarchitectureexample.feeds.mvp.MVPActivity::class.java
            )
            startActivity(intent)
        }
        val gotoFeedsMVVMButton = findViewById<Button>(R.id.go_to_feeds_mvvm)
        gotoFeedsMVVMButton.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                com.ellaclub.androidarchitectureexample.feeds.mvvm.MVVMActivity::class.java
            )
            startActivity(intent)
        }
        val gotoFeedsMVIButton = findViewById<Button>(R.id.go_to_feeds_mvi)
        gotoFeedsMVIButton.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                com.ellaclub.androidarchitectureexample.feeds.mvi.MVIActivity::class.java
            )
            startActivity(intent)
        }
        val gotoFeedsComposeButton = findViewById<Button>(R.id.go_to_feeds_compose)
        gotoFeedsComposeButton.setOnClickListener {
            val intent = Intent(
                this@MainActivity,
                com.ellaclub.androidarchitectureexample.feeds.compose.ComposeActivity::class.java
            )
            startActivity(intent)
        }
    }
}