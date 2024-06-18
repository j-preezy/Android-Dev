package com.test.delta

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
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
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class InputActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Input()
        }
    }
}
@Preview(showBackground = true)
@Composable
fun Input(){
    
//    Box (
//        modifier = Modifier
//            .fillMaxSize()
//    ){
//
//        Image(painter = painterResource(id = R.drawable.ic_launcher_background), contentDescription = "null",
//            modifier = Modifier,
//            contentScale = ContentScale.FillBounds)
//
//    }

    Column (
        modifier = Modifier
            .background(Color.LightGray)
            .padding(10.dp)
            .fillMaxSize(),


        horizontalAlignment = Alignment.CenterHorizontally



    ) {

//        Text(text = "Type in your information", fontSize = 25.sp )
        Image(
            painter = painterResource(
                id = R.drawable.account),
            contentDescription = "",
            modifier = Modifier
                .size(50.dp))

        Spacer(modifier = Modifier.height(20.dp))

        var name by remember {mutableStateOf(TextFieldValue(""))}

        TextField(
            value = name,
            onValueChange = { name = it },
            label = { Text(text = "Name")})

        Spacer(modifier = Modifier.height(20.dp))

        var email by remember { mutableStateOf(TextFieldValue("")) }

        TextField(
            value = email,
            onValueChange = { email = it },
            label = { Text(text = "Email")})

        Spacer(modifier = Modifier.height(20.dp))

        var phone by remember { mutableStateOf(TextFieldValue("")) }

        OutlinedTextField(
            value = phone,
            onValueChange = {phone = it},
            label = { Text(text = "Phone Number")})







    }

}


