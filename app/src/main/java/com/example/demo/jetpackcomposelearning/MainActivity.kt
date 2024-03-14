package com.example.demo.jetpackcomposelearning

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.demo.jetpackcomposelearning.ui.theme.JetpackComposeLearningTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            JetpackComposeLearningTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("World")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxSize()
    ) {
        Column(
        modifier = modifier.padding(8.dp)
        ) {
            Image(
                painter = painterResource(
                    id = R.drawable.ic_launcher_foreground),
                contentDescription = "My first image",
            )
            Text(
                text = "Hello $name!",
                fontSize = 24.sp,
            )
        }
    }
}

@Preview(
    //If true, the @Composable will use a default background color.
    showBackground = true,
    //If true, the status bar and action bar of the device will be displayed. The @Composable will be render in the context of a full activity.
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    JetpackComposeLearningTheme {
        Greeting("World")
    }
}