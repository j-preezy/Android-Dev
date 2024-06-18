package com.test.delta

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

class AboutActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            About()

        }
    }
}

@Preview(showBackground = true)
@Composable
fun About() {
    Column(

        modifier = Modifier
            .fillMaxSize()
            .background(Color.LightGray)
            .padding(10.dp),

        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "This is my about page", fontSize = 20.sp)


        val home = LocalContext.current

        Button(onClick = {

            home.startActivity(Intent(home, MainActivity::class.java))

        },
            colors = ButtonDefaults.buttonColors(Color.LightGray),
//            shape = RectangularShape
            shape = RoundedCornerShape(10.dp),
//            shape = CutCornerShape(10.dp)

            border = BorderStroke(2.dp, Color.Black)
            
            

        ) {

//      clickable text

            Text(text = "Home", color = Color.Blue)

        }


        val jj = AnnotatedString("Red",
            spanStyle = SpanStyle(Color.Red))

        val kk = LocalContext.current

        ClickableText(text = jj , onClick = {
            kk.startActivity(Intent(kk, MainActivity::class.java))
        })


//      clickable text

        val gg = LocalContext.current
        Text(text = "Click me",
            modifier = Modifier
                .clickable {
                    gg.startActivity(Intent(gg, MainActivity::class.java))
                })



    }

}


