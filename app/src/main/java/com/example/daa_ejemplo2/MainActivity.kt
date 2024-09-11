package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.daa_ejemplo2.ui.theme.DAAEjemplo2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DAAEjemplo2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GreetingImage()
                    GreetingText(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GreetingText(modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Bottom,
        modifier = modifier
    ) {
        Text(
            text = stringResource(R.string.Nombre),
            fontSize = 16.sp,
            //lineHeight = 116.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(top = 200.dp, start = 15.dp)
                               .align(Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(R.string.Acerca),
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(10.dp)
                               .align(Alignment.CenterHorizontally)
        )
        Text(
            text = stringResource(R.string.Inicio),
            //color = Color(0,0,0),
            fontSize = 14.sp,
            textAlign = TextAlign.Left,
            modifier = Modifier.padding(10.dp)
                .align(Alignment.Start)
        )
    }
}

@Composable
fun GreetingImage() {
    val imagen = painterResource(id = R.drawable.teclaguna)
    Box {
        Image(
            painter = imagen,
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        GreetingImage()
        GreetingText()
    }
}