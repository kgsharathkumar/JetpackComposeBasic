package com.sharath.jetpackcomposebasic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.BlendMode.Companion.Color
import androidx.compose.ui.graphics.Color.Companion.Red
import androidx.compose.ui.tooling.preview.Preview
import com.sharath.jetpackcomposebasic.ui.theme.JetpackComposeBasicTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MaterialTheme{
                App()
            }





//            JetpackComposeBasicTheme {
//                // A surface container using the 'background' color from the theme
//                Surface(
//                    modifier = Modifier.fillMaxSize(),
//                    color = MaterialTheme.colors.background
//                ) {
//                    Greeting("Android")
//                }
//            }
        }
    }
    @Preview
    @Composable
    private fun App() {

        Column() {
            //To add Tool Bar
            TopAppBar(title = {
                Text(text = "Jetpack Compose Basic")
            })

            //To add Text
            Text(text="Hello Sharath")
            Text(text= " Hello Android World!!")

        }

//        Row() {
//            Text(text="Hello Sharath")
//            Text(text= " Hello Android World!!")
//        }

    }
}


//
//@Composable
//fun Greeting(name: String) {
//
//    Row {
//        Text(text = "Hello $name!")
//        Text(text = "Hello Sharath")
//    }
//    Column {
//        Text(text = "Hello $name!")
//        Text(text = "Hello Test")
//        Text(text = "Hello Sharath")
//    }
//
//}
//
//@Preview(showBackground = true)
//@Composable
//fun DefaultPreview() {
//    JetpackComposeBasicTheme {
//        Greeting("Sharath")
//    }
//}