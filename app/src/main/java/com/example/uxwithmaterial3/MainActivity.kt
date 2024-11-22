package com.example.uxwithmaterial3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.DefaultShadowColor
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.uxwithmaterial3.ui.theme.UXwithMaterial3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            UXwithMaterial3Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column(
                        modifier = Modifier.fillMaxSize(),
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        // Button type 1
                        Button(onClick = { /*TODO*/ }) {
                            Text(text = "Confirm")
                        }

                        // Button type 2
                        ElevatedButton(onClick = { /*TODO*/ }) {
                            Icon(
                                imageVector = Icons.Outlined.Add,
                                contentDescription = "Add to cart",
                                modifier = Modifier.size(18.dp)
                            )
                            Spacer(modifier = Modifier.width(0.dp))
                            Text(text = "Add to cart")
                        }

                        // Button type 3
                        FilledTonalButton(onClick = { /*TODO*/ }) {
                            Text(text = "Open in browser")
                        }

                        // Button type 4
                        OutlinedButton(onClick = { /*TODO*/ }) {
                            Text(text = "Back")
                        }

                        // Button type 5
                        TextButton(onClick = { /*TODO*/ }) {
                            Text(text = "Learn more")
                        }
                    }
                    
                }
            }
        }
    }
}
