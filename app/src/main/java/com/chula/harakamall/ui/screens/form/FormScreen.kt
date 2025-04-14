package com.chula.harakamall.ui.screens.form

import android.R
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.chula.harakamall.navigation.ROUT_DASHBOARD
import com.chula.harakamall.ui.theme.newcalor
import com.chula.harakamall.ui.theme.neworange
import com.chula.harakamall.ui.theme.neworange1


@Composable
fun FormScreen(navController: NavController){
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(painterResource(com.chula.harakamall.R.drawable.bg1), contentScale = ContentScale.FillBounds),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {

        Image(
            painter = painterResource(com.chula.harakamall.R.drawable.products),
            contentDescription = "",
            modifier = Modifier.size(300.dp)
        )

        Spacer(modifier = Modifier.height(20.dp))


       Text(text = "CREATE AN ACCOUNT",
           fontWeight = FontWeight.ExtraBold,
           fontSize = 30.sp)

        Spacer(modifier = Modifier.height(20.dp))

        //VARIABLES
        var fullname by remember { mutableStateOf("") }
        var username by remember { mutableStateOf("") }
        var email by remember { mutableStateOf("") }
        var password by remember { mutableStateOf("") }
        var confirmpassword by remember { mutableStateOf("") }


        //fullname
        TextField(
            value = fullname,
            onValueChange = {fullname=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = "") },
            label = { Text(text = "Fullname") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange


            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        //end fullname
        Spacer(modifier = Modifier.height(20.dp))
        //username
        TextField(
            value = username,
            onValueChange = {username=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Face, contentDescription = "") },
            label = { Text(text = "username") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange


            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
        )
        //end
        Spacer(modifier = Modifier.height(20.dp))
        //email
        TextField(
            value = email,
            onValueChange = {email=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = "") },
            label = { Text(text = "email") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange


            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email)
        )
        //end email
        Spacer(modifier = Modifier.height(20.dp))
        //password

        TextField(
            value = password,
            onValueChange = {password=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            label = { Text(text = "password") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = neworange,
                focusedLabelColor = neworange


            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )

        //end password
        Spacer(modifier = Modifier.height(20.dp))
        //confirm
        TextField(
            value = confirmpassword,
            onValueChange = {confirmpassword=it},
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp),
            leadingIcon = { Icon(imageVector = Icons.Default.Lock, contentDescription = "") },
            label = { Text(text = "confirm password") },
            colors = OutlinedTextFieldDefaults.colors(
                focusedBorderColor = newcalor,
                focusedLabelColor = neworange


            ),
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Password),
            visualTransformation = PasswordVisualTransformation()
        )


        //end confirm
        Spacer(modifier = Modifier.height(20.dp))

        Button(onClick = {

        },
            colors = ButtonDefaults.buttonColors(newcalor),
            shape = RoundedCornerShape(10.dp),
            modifier = Modifier.fillMaxWidth().padding(start = 20.dp, end = 20.dp)

        ) {
            Text(text = "Register")
        }

    }


}

@Preview(showBackground = true)
@Composable
fun FormScreenPreview(){
    FormScreen(rememberNavController())

}