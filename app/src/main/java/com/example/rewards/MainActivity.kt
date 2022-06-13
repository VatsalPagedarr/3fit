package com.example.rewards

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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
            val isDialogOpen = remember { mutableStateOf(true)}
            CardView(contentDescription = description, title = String(), isDialogOpen = isDialogOpen)
        }
    }
}

@Composable
fun CardView(
    contentDescription: String,
    title: String,
    modifier: Modifier = Modifier,
    isDialogOpen: MutableState<Boolean>
) {
    if (isDialogOpen.value) {
        Dialog(onDismissRequest = { isDialogOpen.value = false }) {
            Surface(
                modifier = modifier

                    .absolutePadding(0.dp,32.dp,0.dp,19.dp),
                shape = RoundedCornerShape(20.dp)
            ) {
                Box(
                    modifier = modifier
                        .width(320.dp)
                        .height(637.dp)

                        .background(color = Color.DarkGray, shape = RoundedCornerShape(20.dp)),
                    )
                {

                    Box(modifier = modifier)
                    {
                        Image(painter = painterResource(id = R.drawable.how_rewards_popup_bg),
                            contentDescription = contentDescription,
                            modifier = modifier
                                .height(401.dp)
                                .width(320.dp))
                    }
                    Box(modifier = modifier
                        .absolutePadding(35.dp, 15.dp)
                        .height(164.5.dp)
                        .width(250.dp)) {
                        Image(painter = painterResource(id = R.drawable.undraw_bitcoin_p_2_p_re_1_xqa),
                            contentDescription = contentDescription,
                            modifier = modifier
                                .fillMaxSize()
                        )
                    }
                    Text(
                        text = "Infite ways to reward\nyourself",
                        style = TextStyle(color = Color.White,
                            fontWeight = FontWeight.Bold,
                            fontSize = 23.sp),
                        modifier = modifier
                            .absolutePadding(25.dp, 240.dp)
                            .height(64.dp)
                            .width(248.dp)
                    )
                    Text(
                        text = "Read below that how rewards\ncalculated?",
                        style = TextStyle(color = Color.White, fontSize = 14.sp),
                        modifier = modifier
                            .absolutePadding(25.dp, 309.dp)
                    )

                    Text(
                        text = "1000 steps = 1.5 coins",
                        style = TextStyle(color = Color.White, fontSize = 14.sp),
                        modifier = modifier
                            .absolutePadding(72.dp, 392.dp)
                    )
                    Text(
                        text = "Invite friends = 15 coin",
                        style = TextStyle(color = Color.White, fontSize = 14.sp),
                        modifier = modifier
                            .absolutePadding(72.dp, 437.dp)
                    )
                    Text(
                        text = "Claim Daily Rewards",
                        style = TextStyle(color = Color.White, fontSize = 14.sp),
                        modifier = modifier
                            .absolutePadding(72.dp, 482.dp)
                    )
                    Text(
                        text = "Challenge yourself or a friend",
                        style = TextStyle(color = Color.White, fontSize = 14.sp),
                        modifier = modifier
                            .absolutePadding(72.dp, 527.dp)
                    )
                    Text(
                        text = "Spend your coins in\nmarketplace or donate for\ngood cause.",
                        style = TextStyle(color = Color.White, fontSize = 14.sp),
                        modifier = modifier
                            .absolutePadding(72.dp, 572.dp)
                    )

                    Box(modifier = modifier
                        .absolutePadding(25.dp, 384.dp))
                    {
                        Image(painter = painterResource(id = R.drawable.steps),
                            contentDescription = contentDescription,
                            modifier = modifier
                                .width(35.dp)
                                .height(35.dp)
                        )
                    }
                    Box(modifier = modifier
                        .absolutePadding(25.dp, 429.dp))
                    {
                        Image(painter = painterResource(id = R.drawable.invite),
                            contentDescription = contentDescription,
                            modifier = modifier
                                .width(35.dp)
                                .height(35.dp)
                        )
                    }
                    Box(modifier = modifier
                        .absolutePadding(25.dp, 474.dp))
                    {
                        Image(painter = painterResource(id = R.drawable.claim),
                            contentDescription = contentDescription,
                            modifier = modifier
                                .width(35.dp)
                                .height(35.dp)
                        )
                    }
                    Box(modifier = modifier
                        .absolutePadding(25.dp, 519.dp))
                    {
                        Image(painter = painterResource(id = R.drawable.challange),
                            contentDescription = contentDescription,
                            modifier = modifier
                                .width(35.dp)
                                .height(35.dp)
                        )
                    }
                    Box(modifier = modifier
                        .absolutePadding(25.dp, 564.dp))
                    {
                        Image(painter = painterResource(id = R.drawable.spend),
                            contentDescription = contentDescription,
                            modifier = modifier
                                .width(35.dp)
                                .height(35.dp)
                        )
                    }
                }
                Box(modifier = modifier)
                {
                    IconButton(onClick = { isDialogOpen.value = false }, modifier = modifier
                        .absolutePadding(280.dp)
                        .height(40.dp)
                        .width(40.dp)

                    ) {
                        Image(painter = painterResource(id = R.drawable.group_6),
                            contentDescription = contentDescription,
                            modifier = modifier
                                .fillMaxSize()
                        )
                    }
                }
            }
        }
    }
}


