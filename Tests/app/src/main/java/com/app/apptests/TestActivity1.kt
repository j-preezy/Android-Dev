package com.app.apptests

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.LocationOn
import androidx.compose.material.icons.filled.Settings
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.app.apptests.ui.theme.AppTestsTheme

class TestActivity1 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Test1()
    }
}
@Preview(showBackground = true)
@Composable
fun Test1(){

    LazyColumn (

        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)

    ) {

        item {

            Column (
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize(),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                Spacer(modifier = Modifier.height(30.dp))

                Row (
                    horizontalArrangement = Arrangement.SpaceEvenly,
                    modifier = Modifier
                        .fillMaxWidth()
                ) {

                    Image(imageVector = Icons.Default.Home, contentDescription = "")

                    Column (
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {

                        Text(text = "Current Location")

                        Row {

                            Image(imageVector = Icons.Default.LocationOn, contentDescription = "",
                                modifier = Modifier
                                    .size(20.dp)
                            )
                            Text(text = "Nairobi, Kenya")

                        }

                    }

                    Image(imageVector = Icons.Default.Settings, contentDescription = null)

                }

                Spacer(modifier =  Modifier.height(15.dp))


                Row (
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ){

                    Row (
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)

                    ){

                        Image(imageVector = Icons.Default.Home, contentDescription = null)

                        Text(text = "Hotels")
                    }

                    Spacer(modifier = Modifier.width(25.dp))

                    Row (
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {

                        Image(imageVector = Icons.Default.Home, contentDescription = null)

                        Text(text = "Holiday")

                    }

                }

                Row (
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ){

                    Row (
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {

                        Image(imageVector = Icons.Default.Home, contentDescription = null)

                        Text(text = "Taxi")

                    }

                    Spacer(modifier = Modifier.width(25.dp))

                    Row (
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {

                        Image(imageVector = Icons.Default.Home, contentDescription = null)

                        Text(text = "Ticket")

                    }

                }

                Spacer(modifier = Modifier.height(5.dp))

                Row (
                    horizontalArrangement = Arrangement.Absolute.SpaceBetween
                ){

                    Row (
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {

                        Image(imageVector = Icons.Default.Home, contentDescription = null)

                        Text(text = "Airplane")

                    }

                    Spacer(modifier = Modifier.width(25.dp))

                    Row (
                        modifier = Modifier
                            .padding(10.dp)
                            .background(Color.White)
                            .padding(10.dp)
                            .shadow(elevation = 10.dp)
                    ) {

                        Image(imageVector = Icons.Default.Home, contentDescription = null)

                        Text(text = "Harbour")

                    }

                }

                Spacer(modifier = Modifier.height(30.dp))

                Row () {

                    Text(text = "Popular in town")

                    Spacer(modifier = Modifier.width(60.dp))

                    Text(text = "View All")

                }

                Spacer(modifier = Modifier.height(30.dp))

                Column () {

                    Row (
                        horizontalArrangement = Arrangement.Absolute.SpaceBetween
                    ){

                        Card () {

                            Image(painter = painterResource(
                                id = R.drawable.images1),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(150.dp)

                            )

                            Text(text = "Nusa Penida")

                        }

                        Spacer(modifier = Modifier.width(30.dp))

                        Card () {

                            Image(painter = painterResource(
                                id = R.drawable.images2),
                                contentDescription = "",
                                modifier = Modifier
                                    .size(150.dp))

                            Text(text = "Tanah Lot")
                        }

                    }

                }



            }

    }

}
}
}


