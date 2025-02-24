package com.ellaclub.androidarchitectureexample.network.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

class ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent { SearchView() }
    }
}

@Composable
fun SearchView() {
    Column(modifier = Modifier.fillMaxWidth()) {
        Text(text = "")
        Spacer(modifier = Modifier.height(4.dp))
        OutlinedTextField(value = "", onValueChange = {})
        Button(onClick = {

        }) {
            Text(text = "Search")
        }
    }
}
