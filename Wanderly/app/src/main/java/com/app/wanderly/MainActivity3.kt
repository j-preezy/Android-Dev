package com.app.wanderly

import android.content.Intent
import android.media.Image
import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.wanderly.ui.theme.WanderlyTheme

class MainActivity3 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Detail()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Detail(){

    LazyColumn (
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        item {

            Column (
                modifier = Modifier
                    .fillMaxSize()
            ) {

                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                ){

                    Box (){

                        Image(painter = painterResource(id = R.drawable.cabin1), contentDescription = "",
                            modifier = Modifier
                                .fillMaxWidth(),
                            contentScale = ContentScale.FillBounds)

                        val back = LocalContext.current

                        Button(onClick = {

                            back.startActivity(Intent(back, MainActivity2::class.java))

                        },
                            colors = ButtonDefaults.buttonColors(Color.Gray),
                            shape = CircleShape)


                        {
                            Image(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = null)

                        }

                    }





                }

                Text(text = "Recommended", color = Color.Black, modifier = Modifier.padding(15.dp))

                Text(text = "Forest Haven Estate - Modern Villa(near mountain)",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.SemiBold,

                    modifier = Modifier
                        .padding(start = 30.dp)
                )

                Text(text = "Mistybrook, Oregon, United States",
                    fontSize = 14.sp,
                    color = Color.Gray,
                    modifier = Modifier
                        .padding(start = 30.dp, top = 5.dp)
                )

                Row (
                    modifier = Modifier
                        .padding(start = 30.dp, top = 8.dp)
                ){
                    Image(imageVector = Icons.Default.Star, contentDescription = null)
                    Text(text = "4.5 Rating",
                        fontWeight = FontWeight.Medium
                    )

                    Spacer(modifier = Modifier.width(20.dp))

                    Image(imageVector = Icons.Default.LocationOn, contentDescription = null)
                    Text(text = "1 Km",
                        fontWeight = FontWeight.Medium)

                    Spacer(modifier = Modifier.width(20.dp))

                    Text(text = "23 Reviews",
                        textDecoration = TextDecoration.Underline,
                        fontWeight = FontWeight.Medium)
                }


                Text(text = "Facility",
                    fontSize = 23.sp,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(start = 30.dp, top = 20.dp))


            }

        }

    }

}


