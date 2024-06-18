package com.app.wanderly

import android.content.Intent
import android.graphics.Paint.Align
import android.media.Image
import android.os.Bundle
import android.view.RoundedCorner
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.input.TextFieldValue
//import androidx.compose.ui.tooling.data.EmptyGroup.name
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.app.wanderly.ui.theme.WanderlyTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Search()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Search() {

    LazyColumn(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
    ) {

        item {

            Column(

                modifier = Modifier
                    .fillMaxSize()

            ) {

                Row {

                    val back = LocalContext.current

                    Button(onClick = {

                        back.startActivity(Intent(back, MainActivity::class.java))

                    },
                        colors = ButtonDefaults.buttonColors(Color.Gray),
                        shape = CircleShape)


                    {
                        Image(imageVector = Icons.Default.KeyboardArrowLeft, contentDescription = null)

                    }


                    val next = LocalContext.current

                    Button(onClick = {
                        next.startActivity(Intent(next, MainActivity3::class.java))
                    },
                        colors = ButtonDefaults.buttonColors(Color.Gray),
                        shape = CircleShape
                    ) {
                        Image(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null)
                    }


                }



                Row (
                    modifier = Modifier
                        .fillMaxWidth()
                ) {

                    var search by remember { mutableStateOf(TextFieldValue("")) }



                    TextField(
                        value = search,
                        onValueChange = { search = it},
                        label = {Image(imageVector = Icons.Default.Search, contentDescription = null)
                            Color.White

                            ;Text(text = "Search", Modifier.padding(start = 30.dp))},
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp)
                            .border(
                                1.dp,
                                color = Color.LightGray,
                                shape = RoundedCornerShape(20.dp)
                            ))




                }

                Spacer(modifier = Modifier.height(10.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth()
                ) {

                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        border = BorderStroke(1.dp, Color.LightGray)
                    ) {

                        Image(imageVector = Icons.Default.Home, contentDescription = "")
                        Text(text = "Hotel", color = Color.Black)

                    }

                    Spacer(modifier = Modifier.width(5.dp))

                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        border = BorderStroke(1.dp, Color.LightGray)) {

                        Image(imageVector = Icons.Default.Home, contentDescription = "")
                        Text(text = "Rentals", color = Color.Black)


                    }

                    Spacer(modifier = Modifier.width(5.dp))

                    Button(onClick = { /*TODO*/ },
                        colors = ButtonDefaults.buttonColors(Color.White),
                        border = BorderStroke(1.dp, Color.LightGray)) {

                        Image(imageVector = Icons.Default.Home, contentDescription = "")
                        Text(text = "Restaurant", color = Color.Black)

                    }

                }

                Row (
                    verticalAlignment = Alignment.CenterVertically
                ) {

                    Card (
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(20.dp)
                    ) {

                        Image(painter = painterResource(id = R.drawable.cabin2 ) , contentDescription = "",
                            modifier = Modifier
//                                .align(Alignment.CenterHorizontally)
                                .fillMaxSize(),
                            contentScale = ContentScale.FillBounds)

//                        Card (
//                            modifier = Modifier
//                                .background(Color.White)
//                        ) {
//
//                            Text(text = "Forest Haven Estate - Modern Villa")
//
//                        }

                    }

                }

                Card (
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp)
                ) {

                    Image(painter = painterResource(id = R.drawable.cabin1 ) , contentDescription = "",
                        modifier = Modifier
//                                .align(Alignment.CenterHorizontally)
                            .fillMaxSize(),
                        contentScale = ContentScale.FillBounds)

                }

//                val navController = rememberNavController()
//
//                Scaffold(
//                    bottomBar = {
//                        BottomNavigation {
//                            val navBackStackEntry by navController.currentBackStackEntryAsState()
//                            val currentRoute = navBackStackEntry?.destination?.route
//
//                            BottomNavigationItem(
//                                icon = { Icon(Icons.Default.Home, contentDescription = "Home") },
//                                label = { Text("Home") },
//                                selected = currentRoute == "home",
//                                onClick = {
//                                    navController.navigate("home")
//                                }
//                            )
//
//                            BottomNavigationItem(
//                                icon = { Icon(Icons.Default.Settings, contentDescription = "Settings") },
//                                label = { Text("Settings") },
//                                selected = currentRoute == "settings",
//                                onClick = {
//                                    navController.navigate("settings")
//                                }
//                            )
//                        }
//                    }
//                ) {
//                    NavHost(navController, startDestination = "home") {
//                        composable("home") { HomeScreen() }
//                        composable("settings") { SettingsScreen() }
//                    }
//                }
            }

            }


        }
    }



