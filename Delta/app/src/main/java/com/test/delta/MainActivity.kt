package com.test.delta

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Greeting()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Greeting() {
    Column(
        modifier = Modifier
            .background(Color.LightGray)
//            .fillMaxHeight()
//            .fillMaxWidth()
            .fillMaxSize(),

        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally





    ) {

        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .background(Color.Cyan)
                .fillMaxWidth()
                .height(50.dp)

        ) {
            Text(text = "Chats", fontSize = 20.sp)

            Spacer(modifier = Modifier.width(10.dp))

            Text(text = "Status", fontSize = 20.sp)

            Spacer(modifier = Modifier.width(10.dp))

            Text(text = "Calls", fontSize = 20.sp)

        }

        Spacer(modifier = Modifier.height(25.dp))

        Text(text = "My Android Project", fontSize = 25.sp,color = Color.White)
//        Text(text = "The Home Page", fontSize = 25.sp, color = Color.Green)
//        Text(text = "Check me out", fontSize = 25.sp, fontFamily = FontFamily.Cursive)


        val about = LocalContext.current
        Button(onClick = {

            about.startActivity(Intent(about, AboutActivity::class.java))

        }) {

            Text(text = "About")

        }
        
        val image = LocalContext.current
        Button(onClick = {
            
            image.startActivity(Intent(image, ImageActivity::class.java))
            
        }) {
            
            Text(text = "Image")
            
        }

        val input = LocalContext.current
        Button(onClick = {

            input.startActivity(Intent(input, InputActivity::class.java))

        }) {

            Text(text = "Input")

        }


    }

//    It piles content on top of another good for background images
//    Box {
//
//    }



}

