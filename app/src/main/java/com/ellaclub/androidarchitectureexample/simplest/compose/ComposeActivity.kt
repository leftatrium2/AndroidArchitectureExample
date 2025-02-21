package com.ellaclub.androidarchitectureexample.simplest.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp

class ComposeActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Example()
        }
    }
}

@Composable
fun Example() {
    Column(modifier = Modifier.fillMaxWidth()) {
        var txtValue by remember {
            mutableStateOf("Hello World!")
        }
        Text(
            modifier = Modifier.fillMaxWidth(),
            text = txtValue,
            style = TextStyle(color = Color.White, background = Color.Black)
        )

        Spacer(modifier = Modifier.height(4.dp))
        TextField(
            value = txtValue,
            onValueChange = {
                txtValue = it
            },
            modifier = Modifier.fillMaxWidth(),
            minLines = 10
        )
    }
}