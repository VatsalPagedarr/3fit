package com.example.rewards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.window.Dialog

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
          
            val description = "Read below that how rewards calculated?"
            val title = "Infite Ways to reward yourself"
            val isDialogOpen = remember { mutableStateOf(false)}
            CardView(contentDescription = description, title = String(), isDialogOpen = isDialogOpen)
        }
    }
}

@Composable
fun CardView(

    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier,
    isDialogOpen : MutableState<Boolean>

)
{
    val shouldShowDialog = remember {
        mutableStateOf(true)
    }


        if (shouldShowDialog.value)
        {
            Dialog(onDismissRequest = { isDialogOpen.value = false }) {
                Surface(
                    modifier = modifier
                        .height(637.dp)
                        .width(320.dp)
                ) {


                    Box(modifier = modifier
                        .height(637.dp)
                        .width(320.dp)
                        .absolutePadding(0.dp, 0.dp, 0.dp, 0.dp)
                        .background(color = Color.DarkGray)
                    )

                    {
                        Box(modifier = modifier)
                        {
                            Button(onClick = { isDialogOpen.value = false }, modifier = modifier
                                .absolutePadding(280.dp)
                            ) {
                                Image(painter = painterResource(id = R.drawable.group_6), contentDescription = contentDescription,
                                    modifier = modifier
                                        .height(40.dp)
                                        .width(40.dp)

                                )
                            }
                        }
                        Box( modifier = modifier)
                        {
                            Image(painter = painterResource(id = R.drawable.how_rewards_popup_bg), contentDescription = contentDescription,
                                modifier = modifier
                                    .height(401.dp)
                                    .width(320.dp))

                        }
                        Box(modifier = modifier
                            .absolutePadding(55.dp, 15.dp)
                            .height(164.5.dp)
                            .width(250.dp)){Image(painter = painterResource(id = R.drawable.undraw_bitcoin_p_2_p_re_1_xqa),
                            contentDescription = contentDescription,
                            modifier = modifier
                                .fillMaxSize()

                        )}
                        Text(
                            text = "Infite ways to reward\nyourself",
                            style = TextStyle(color = Color.White, fontWeight = FontWeight.Bold, fontSize = 23.sp),
                            modifier = modifier
                                .absolutePadding(45.dp, 240.dp)
                                .height(64.dp)
                                .width(248.dp)
                        )
                        Text(
                            text = "Read below that how rewards\ncalculated?",
                            style = TextStyle(color = Color.White, fontSize = 14.sp),
                            modifier = modifier
                                .absolutePadding(45.dp,309.dp)
                        )

                        Text(
                            text = "1000 steps = 1.5 coins",
                            style = TextStyle(color = Color.White, fontSize = 14.sp),
                            modifier = modifier
                                .absolutePadding(92.dp,392.dp)
                        )
                        Text(
                            text = "Invite friends = 15 coin",
                            style = TextStyle(color = Color.White, fontSize = 14.sp),
                            modifier = modifier
                                .absolutePadding(92.dp,437.dp)
                        )
                        Text(
                            text = "Claim Daily Rewards",
                            style = TextStyle(color = Color.White, fontSize = 14.sp),
                            modifier = modifier
                                .absolutePadding(92.dp,482.dp)
                        )
                        Text(
                            text = "Challenge yourself or a friend",
                            style = TextStyle(color = Color.White, fontSize = 14.sp),
                            modifier = modifier
                                .absolutePadding(92.dp,527.dp)
                        )
                        Text(
                            text = "Spend your coins in\nmarketplace or donate for\ngood cause.",
                            style = TextStyle(color = Color.White, fontSize = 14.sp),
                            modifier = modifier
                                .absolutePadding(92.dp,572.dp)
                        )

                        Box(modifier = modifier
                            .absolutePadding(45.dp,384.dp))
                        {
                            Image(painter = painterResource(id = R.drawable.steps),
                                contentDescription = contentDescription ,
                                modifier = modifier
                                    .width(35.dp)
                                    .height(35.dp)
                            )
                        }
                        Box(modifier = modifier
                            .absolutePadding(45.dp,429.dp))
                        {
                            Image(painter = painterResource(id = R.drawable.invite),
                                contentDescription = contentDescription ,
                                modifier = modifier
                                    .width(35.dp)
                                    .height(35.dp)
                            )
                        }
                        Box(modifier = modifier
                            .absolutePadding(45.dp,474.dp))
                        {
                            Image(painter = painterResource(id = R.drawable.claim),
                                contentDescription = contentDescription ,
                                modifier = modifier
                                    .width(35.dp)
                                    .height(35.dp)
                            )
                        }
                        Box(modifier = modifier
                            .absolutePadding(45.dp,519.dp))
                        {
                            Image(painter = painterResource(id = R.drawable.challange),
                                contentDescription = contentDescription ,
                                modifier = modifier
                                    .width(35.dp)
                                    .height(35.dp)
                            )
                        }
                        Box(modifier = modifier
                            .absolutePadding(45.dp,564.dp))
                        {
                            Image(painter = painterResource(id = R.drawable.spend),
                                contentDescription = contentDescription ,
                                modifier = modifier
                                    .width(35.dp)
                                    .height(35.dp)
                            )
                        }


                    }
                }
        }
}
    }

