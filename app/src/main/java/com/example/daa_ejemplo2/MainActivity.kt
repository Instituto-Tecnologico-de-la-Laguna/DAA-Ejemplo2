package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.RectangleShape
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
                // A surface container using the 'background' color from the theme
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                }
            }
        }
    }
}

@Composable
fun GreetingText(titulo: String, parrafo_1: String, parrafo_2: String, modifier: Modifier = Modifier) {
    val imagen = painterResource(id = R.drawable.itl)
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Image(
            painter = imagen,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Text(
            text = titulo,
            modifier = Modifier
                .padding(0.dp,10.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 16.sp
        )
        Text(
            text = parrafo_1,
            modifier = Modifier
                .padding(0.dp,10.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 13.sp,
            lineHeight = 18.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = parrafo_2,
            modifier = Modifier
                .padding(0.dp,10.dp, 0.dp, 30.dp)
                .align(alignment = Alignment.CenterHorizontally),
            fontSize = 13.sp,
            lineHeight = 18.sp,
            textAlign = TextAlign.Center
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        GreetingText(
            titulo = "Instituto Tecnológico de la Laguna",
            parrafo_1 = "El instituto Tecnológico de La Laguna es una\n" +
                    "universidad pública ubicada en la ciudad de\n" +
                    "Torreón. El Instituto Tecnológico de La Laguna\n" +
                    "forma parte del Tecnológico Nacional de México.",
            parrafo_2 = "El Instituto Tecnológico Regional De La Laguna,\n" +
                    "iniciando sus actividades el 26 de Septiembre de\n" +
                    "1965. A nivel medio superior se comenzó en 1965\n" +
                    "con el Bachillerato de Ciencias y Tecnología en\n" +
                    "tres opciones: Eléctrica, Mecánica automotriz\n" +
                    "(combustión interna) y Mecánica (máquinas y\n" +
                    "herramientas). La población escolar ascendió a\n" +
                    "352 estudiantes inscritos en los siguientes niveles:\n" +
                    "152 en medio superior, 148 en técnico industrial y\n" +
                    "52 técnicos agropecuarios, atendidos por 2\n" +
                    "directores, 21 docentes y 8 personal administrativo.\n"
        )
    }
}