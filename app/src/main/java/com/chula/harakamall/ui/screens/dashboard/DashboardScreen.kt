package com.chula.harakamall.ui.screens.dashboard

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.chula.harakamall.ui.theme.neworange
import com.chula.harakamall.ui.theme.neworange1
import com.chula.harakamall.R
import com.chula.harakamall.navigation.ROUT_ABOUT
import com.chula.harakamall.navigation.ROUT_HOME


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DashboardScreen(navController: NavController){

    Column (modifier = Modifier.fillMaxSize().background(neworange)
    ){

        //Box
        Box (){
            //Card
            Card (
                modifier = Modifier.fillMaxWidth().height(300.dp),
                shape = RoundedCornerShape(bottomStart = 60.dp, bottomEnd = 60.dp),
                colors = CardDefaults.cardColors(neworange1)
            ){
                TopAppBar(
                    title = { Text(text = "Dashboard Section") },
                    navigationIcon = {
                        IconButton(onClick = {}) {
                            Icon(imageVector = Icons.Default.Menu, contentDescription = "menu")
                        }
                    }
                )

             Column (
                 modifier = Modifier.fillMaxSize(),
                 horizontalAlignment = Alignment.CenterHorizontally,
             ){
                 Text(
                     text = "A mall or shopping center is a large building that is full of many smaller shops and stores. It is different from earlier markets or bazaars because most of ...",
                     fontSize = 15.sp,
                     fontWeight = FontWeight.Bold,
                     textAlign = TextAlign.Center
                 )

             }


            }
            //End of Card

            Card (
                modifier = Modifier
                    .fillMaxWidth()
                    .height(180.dp)
                    .align(alignment = Alignment.BottomCenter)
                    .padding(start = 20.dp, end = 20.dp)
                    .offset(y = 90.dp)


            ){
                //Contents of Card
                Column{
                    Image(
                            painter = painterResource(R.drawable.mall1),
                            contentDescription = "home",
                            modifier = Modifier.fillMaxSize(),
                            contentScale = ContentScale.FillBounds
                        )

                        Spacer(modifier = Modifier.width(10.dp))


                }





            }

        }
        //End of Box

        Spacer(modifier = Modifier.height(100.dp))

        //Row
        Row (modifier = Modifier.padding(20.dp)){

            //Card1
            Card (
                modifier = Modifier.width(150.dp).height(180.dp).clickable{navController.navigate(
                    ROUT_HOME
                )},
                elevation = CardDefaults.cardElevation(),

            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.icon2),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Home", fontSize = 15.sp)
                }


            }

            //End of Card1
            Spacer(modifier = Modifier.width(20.dp))

            //Card2
            Card (
                modifier = Modifier.width(150.dp).height(180.dp).padding(start = 20.dp),
                elevation = CardDefaults.cardElevation()
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Contact", fontSize = 15.sp)
                }


            }

            //End of Card2

        }

        //End of Row

        Spacer(modifier = Modifier.height(20.dp))

        //Row
        Row (modifier = Modifier.padding(20.dp)){

            //Card1
            Card (
                modifier = Modifier.width(150.dp).height(180.dp)
                    .clickable{navController.navigate(ROUT_ABOUT)},
                elevation = CardDefaults.cardElevation()
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.about),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Contacts", fontSize = 15.sp)
                }


            }

            //End of Card1
            Spacer(modifier = Modifier.width(20.dp))

            //Card2
            Card (
                modifier = Modifier.width(150.dp).height(180.dp).padding(start = 20.dp),
                elevation = CardDefaults.cardElevation()
            ){
                Column (
                    modifier = Modifier.fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center
                ){
                    Image(
                        painter = painterResource(R.drawable.products),
                        contentDescription = "home",
                        modifier = Modifier.size(100.dp)
                    )
                    Text(text = "Products", fontSize = 15.sp)
                }


            }

            //End of Card2

        }

        //End of Row












    }


}

@Preview(showBackground = true)
@Composable
fun DashboardScreenPreview(){
    DashboardScreen(rememberNavController())

}