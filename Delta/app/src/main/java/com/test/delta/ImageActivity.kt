package com.test.delta

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class ImageActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

                    Picha()

            }
        }
    }

@Preview(showBackground = true)
@Composable
fun Picha(){
    
    Column (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(10.dp)
    ){
        
        Image(painter = painterResource(
            id = R.drawable.house),
            contentDescription = "image",
            modifier = Modifier
//                .background(Color.Red)
//                .clip(RoundedCornerShape(50))
                .size(200.dp)
                .clip(CircleShape),

            colorFilter = ColorFilter.tint(Color.Black),
//            contentScale = ContentScale.FillHeight
            )
        
        
        
        
        
    }

}


