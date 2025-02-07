package com.sudheer.aware

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sudheer.aware.ui.theme.AutismAppTheme
import com.sudheer.aware.ui.theme.Primary

class LetterAndWordActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AutismAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Image(
        painterResource(id = R.drawable.a),
        modifier = Modifier
           .fillMaxSize(),
        contentDescription = "",
        contentScale = ContentScale.Fit,
        alignment = Alignment.Center)


    val gradient45 = Brush.linearGradient(
        colors = listOf(Color.White, Color.Yellow),
        start = Offset(0f, Float.POSITIVE_INFINITY),
        end = Offset(Float.POSITIVE_INFINITY, 0f)
    )

    androidx.compose.material3.Surface(
        modifier = Modifier
            .background(gradient45)
            .fillMaxSize()
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
                .background(gradient45),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            val context = LocalContext.current
            Image(
                painterResource(id = R.drawable.a),
                modifier = Modifier
                    .requiredHeight(500.dp),
                contentDescription = "",
                contentScale = ContentScale.Fit
            )


            Button(
                modifier = Modifier
                    .padding(start = 20.dp)
                    .padding(end = 20.dp)
                    .fillMaxWidth()
                    .heightIn(48.dp),
                onClick = {
                    context.startActivity(Intent(context, AddtoCartActivity::class.java))
                },
                contentPadding = PaddingValues(),
                colors = ButtonDefaults.buttonColors(Color.Transparent),
                shape = RoundedCornerShape(30.dp),
            ) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .heightIn(48.dp)
                        .background(
                            brush = Brush.horizontalGradient(listOf(Primary, Primary)),
                            shape = RoundedCornerShape(50.dp)
                        ),
                    contentAlignment = Alignment.Center
                ) {
                    androidx.compose.material.Text(
                        text = "Get Subscription",
                        fontSize = 18.sp,
                        color = Color.White,
                        fontWeight = FontWeight.Bold
                    )

                }

            }

//            ButtonComponent(
//                value = "Get Subscriptions",
//                onButtonClicked = {
//                    context.startActivity(Intent(context, AddtoCartActivity::class.java))
//                })

        }
    }


}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AutismAppTheme {
        Greeting("Android")
    }
}