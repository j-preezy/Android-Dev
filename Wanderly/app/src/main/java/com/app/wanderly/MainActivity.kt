package com.app.wanderly

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
//import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowLeft
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.app.wanderly.ui.theme.WanderlyTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            Home()

        }
    }
}
@Preview(showBackground = true)
@Composable
fun Home(){

    Box (
        modifier = Modifier
            .fillMaxSize()
    ){

        Image(painter = painterResource(id = R.drawable.cabin1), contentDescription = "",
            modifier = Modifier
                .fillMaxSize(),
            contentScale = ContentScale.FillHeight)

        val next = LocalContext.current
        
        Button(onClick = {
            next.startActivity(Intent(next, MainActivity2::class.java))
        },
            modifier = Modifier
                .align(alignment = Alignment.TopEnd),
            colors = ButtonDefaults.buttonColors(Color.Gray),
            shape = CircleShape
        ) {
            Image(imageVector = Icons.Default.KeyboardArrowRight, contentDescription = null)
        }


    }

    Column (
        modifier = Modifier
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {

        Spacer(modifier = Modifier.height(50.dp))

        Text(text = "Wanderly",
            textAlign = TextAlign.Center, color = Color.White, fontSize = 40.sp,
            fontWeight = FontWeight.SemiBold
        )

        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "Your Ultimate Companion for Seamless Travel Experiences",
            textAlign = TextAlign.Center, color = Color.White, fontSize = 20.sp)

        Spacer(modifier = Modifier.height(420.dp))

        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(Color.Green),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 35.dp)) {

            Text(text = "Sign in with Phone Number")

        }

        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(Color.White),
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 35.dp)) {

            Image(imageVector = Icons.Default.Person, contentDescription = "")
            Spacer(modifier = Modifier.width(5.dp))
            Text(text = "Sign in With Apple", color = Color.Black)


        }

        Spacer(modifier = Modifier.height(10.dp))

        Text(text = "Don't have an account?", fontSize = 15.sp, color = Color.White)

        val aa = LocalContext.current
        Text(text = "Sign Up", color = Color.White,
            modifier = Modifier
                .clickable {

                })

        Spacer(modifier = Modifier.height(15.dp))

        Text(text = "By creating this account or signing in, you agree to",
            color = Color.White, textAlign = TextAlign.Center)

        Text(text = "our Terms of Service and Privacy Policy.",
            color = Color.White)

    }

}






