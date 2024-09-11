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
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier
            .padding(
                //start = 16.dp,
                top = 16.dp,
                end = 2.dp,
                bottom = 16.dp
            ).fillMaxSize()
    ) {
        val image = painterResource(id = R.drawable.image)
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
        )
        Text(
            text = "Instituto Tecnológico de la Laguna",
            //lineHeight = 30.sp,
            textAlign = TextAlign.Center,
            fontSize = 16.sp,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp
                )

        )
        Text(
            text = "El Instituto Tecnológico de la Laguna es una \n " +
                    "universidad pública ubicada en la ciudad de Torreón. \n" +
                    "El Instituto Tecnológico de la Laguna \n" +
                    "forma parte del Tecnológico Nacional de México \n",
            //lineHeight = 10.sp,
            textAlign = TextAlign.Center,
            fontSize = 10.sp,
            modifier = Modifier
                .padding(
                    //start = 16.dp,
                    top = 16.dp
                )
        )
        Text(
            text = "El Instituto Tecnológico Regional De La Laguna \n" +
                    ", iniciando sus actividades el 26 de Septiembre de \n" +
                    " 1965. A nivel medio superior se comenzó en \n" +
                    " 1965 con el Bachillerato de Ciencias y Tecnologia en \n" +
                    " tres opciones: Electrica, Mecanica automotriz \n" +
                    " (combustión interna) y Mecánica (máquinas y \n" +
                    "herramientas). La población escolar ascendió a \n" +
                    "352 estudiantes inscritos en los siguientes niveles \n" +
                    " 152 en medio superior, 148 en tecnico industral y \n" +
                    "52 técnicos agropecuarios, atendidos por 2 \n" +
                    "directores, 21 docentes y 8 personal aoministrativo\n",

            textAlign = TextAlign.Left,
            //lineHeight = 10.sp,
            fontSize = 10.sp,
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