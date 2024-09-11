package com.example.ejemplo1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.ejemplo1.ui.theme.Ejemplo1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejemplo1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    MainContent()
                }
            }
        }
    }
}

@Composable
fun MainContent() {
    Row(modifier = Modifier.fillMaxSize()) {
        // Primera mitad de la pantalla (Dividida en 3 partes)
        Column(
            modifier = Modifier
                .fillMaxWidth(0.5f)
                .fillMaxHeight(),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            // Imagen en la primera parte
            Image(
                painter = painterResource(id = R.drawable.img),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            )
            // Título en la segunda parte
            Text(
                text = "Instituto Tecnológico de la Laguna",
                fontSize = 24.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                textAlign = TextAlign.Center
            )
            // Párrafo simple en la tercera parte
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus id felis mollis, vulputate lectus ut, finibus lacus. Vivamus egestas nibh eget risus sodales, vitae malesuada sapien convallis. Suspendisse.",
                fontSize = 16.sp,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                textAlign = TextAlign.Center
            )
        }
        // Segunda mitad de la pantalla (párrafo grande pero no tanto)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight()
                .padding(16.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Vivamus id felis mollis, vulputate lectus ut, finibus lacus. Vivamus egestas nibh eget risus sodales, vitae malesuada sapien convallis. Suspendisse condimentum arcu eget imperdiet maximus. Morbi nisl libero, lobortis non varius vel, molestie nec tortor..",
                fontSize = 18.sp,
                textAlign = TextAlign.Justify
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    Ejemplo1Theme {
        MainContent()
    }
}
