package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
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
import com.example.daa_ejemplo2.ui.theme.DAAEjemplo2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DAAEjemplo2Theme {
                Surface(
                    modifier = Modifier.padding(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    imageAndText(string = "")

                }
            }
        }
    }
}


@Composable
fun image(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

    }
}


@Composable
fun imageAndText(modifier: Modifier = Modifier, string: String) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .fillMaxSize()
            .padding()
    ) {
        val image = painterResource(id = R.drawable.image)
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
        )
        Text(
            text = "Instituto Tecnológico de la Laguna",
            //lineHeight = 30.sp,
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 20.dp
                )

        )
        Text(
            text = "El Instituto Tecnológico de la Laguna es una  " +
                    "universidad pública ubicada en la ciudad de Torreón. " +
                    "El Instituto Tecnológico de la Laguna " +
                    "forma parte del Tecnológico Nacional de México ",
            //lineHeight = 10.sp,
            textAlign = TextAlign.Center,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,  //start = 16.dp,
                )
        )
        Text(
            text = "El Instituto Tecnológico Regional De La Laguna " +
                    ", iniciando sus actividades el 26 de Septiembre de " +
                    " 1965. A nivel medio superior se comenzó en " +
                    " 1965 con el Bachillerato de Ciencias y Tecnologia en " +
                    " tres opciones: Electrica, Mecanica automotriz " +
                    " (combustión interna) y Mecánica (máquinas y " +
                    "herramientas). La población escolar ascendió a " +
                    "352 estudiantes inscritos en los siguientes niveles" +
                    " 152 en medio superior, 148 en tecnico industral y " +
                    "52 técnicos agropecuarios, atendidos por 2 " +
                    "directores, 21 docentes y 8 personal aoministrativo.",

            textAlign = TextAlign.Center,
            //lineHeight = 10.sp,
            fontSize = 18.sp,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        imageAndText(string = "Hi")
    }
}