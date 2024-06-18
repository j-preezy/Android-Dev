package com.app.apptests

import android.content.Intent
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.paddingFrom
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.apptests.ui.theme.AppTestsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HomePage()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun HomePage (){

    LazyColumn (
        
        modifier = Modifier
            .background(Color.LightGray)
            .fillMaxSize(),


    ) {



        item {
            Spacer(modifier = Modifier.height(20.dp))

            Column (
                
                modifier = Modifier
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
                
            ) {
                
                Image(imageVector = Icons.Default.Home, contentDescription = null,
                    modifier = Modifier
                        .size(60.dp))
                
                Text(text = "Welcome to my Tests App.",
                    fontFamily = FontFamily.Serif,
                    fontSize = 25.sp,
                    fontWeight = FontWeight(10),

                )

                Spacer(modifier = Modifier.height(20.dp))


                val test1 = LocalContext.current
                Button(onClick = {

                    test1.startActivity(Intent(test1, TestActivity1::class.java))

                }) {
                    
                    Text(text = "Test 1")
                    
                }
                
            }
            
        }

    }

}


