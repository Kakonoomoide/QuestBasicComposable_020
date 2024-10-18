package com.example.pam_pert2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.pam_pert2.ui.theme.PAMPert2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PAMPert2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BasicCompose(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

// create text with import image form resource foleder
@Composable
fun BasicCompose(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxSize())  {
        Text(
            text = "Indonesia",
            modifier = modifier,
            fontSize = 30.sp,
            color = Color.Red,
            fontWeight = FontWeight.Bold
        )
        Text(
            text = "versus",
            style = TextStyle(
                fontSize = 50.sp,
                fontStyle = FontStyle.Italic,
                color = Color.Magenta
            )
        )
        Image(
            painter = painterResource(id = R.drawable.fifa_image),
            contentDescription = null,
            modifier = Modifier.size(200.dp)
        )
        Text(
            text = "Nama",
            modifier = Modifier.padding(top = 16.dp)
        )
        Text(
            text = "Rizki Ramadan",
            style = TextStyle(
                fontSize = 30.sp,
                color = colorResource(id = R.color.teal_200),
                fontFamily = FontFamily.Monospace
            )
        )
        Text(
            text = "20220140020",
            style = TextStyle(
                fontSize = 50.sp,
                color = colorResource(id = R.color.teal_700)
            )
        )
        Image(
            painter = painterResource(id = R.drawable.profille_rizki),
            contentDescription = null,
            modifier = Modifier
                .size(200.dp)
                .clip(CircleShape)
        )
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PAMPert2Theme {
        Greeting("Android")
    }
}