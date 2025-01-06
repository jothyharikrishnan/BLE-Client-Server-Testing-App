package com.example.bleclientservertestingproject

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.bleclientservertestingproject.client.ClientActivity
import com.example.bleclientservertestingproject.server.ServerActivity
import com.example.bleclientservertestingproject.ui.theme.BLEClientServerTestingProjectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BLEClientServerTestingProjectTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    Box(
                        modifier = Modifier.fillMaxSize(),
                        contentAlignment = Alignment.Center
                    ){
                        Column(
                            verticalArrangement = Arrangement.Center
                        ) {
                            Button(onClick = {
                                screenRedirection("Server")
                            }) {
                                Text(text = " BLE Server Activity.")
                            }
                            Spacer(modifier = Modifier.size(20.dp))
                            Button(onClick = {
                                screenRedirection("Client")
                            }) {
                                Text(text = " BLE Client Activity.")
                            }
                        }
                    }
                }
            }
        }
    }

    private fun screenRedirection(screenName : String){
        val activity = if(screenName == "Server") ServerActivity::class.java else ClientActivity::class.java

        val intent = Intent(this,activity)
        startActivity(intent)
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BLEClientServerTestingProjectTheme {
        Greeting("Android")
    }
}