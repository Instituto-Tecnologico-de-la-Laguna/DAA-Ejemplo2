package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
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
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    val imagen = painterResource(id = R.drawable.tec_laguna)
    Column {
        Image(
            painter = imagen,
            contentDescription = null,
            contentScale = ContentScale.Crop,
        )
        Text(
            text = name,
            modifier = modifier
                .padding(16.dp,8.dp)
        )
        Text(
            text = "El Instituto Tecnológico de La Laguna es una " +
                    "universidad pública ubicada en la ciudad de " +
                    "Torreón. El Instituto Tecnológico de La Laguna " +
                    "forma parte del Tecnológico Nacional de México.",
            lineHeight = 16.sp,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = modifier
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)
        )
        Text(
            text = "El Instituto Tecnológico Regional De La Laguna, " +
                    "iniciando sus actividades el 26 de Septiembre de " +
                    "1965. Anivel medio superior se comenzó en 1965 " +
                    "con el Bachillerato de Ciencias y Tecnología en " +
                    "tres opciones: Eléctrica, Mecánica automotriz " +
                    "(combustión interna) y Mecánica (máquinas y " +
                    "herramientas). La población escolar ascendió a " +
                    "352 estudiantes inscritos en los siguientes niveles: " +
                    "152 en medio superior, 148 en técnico industrial y " +
                    "52 técnicos agropecuarios, atendidos por 2 " +
                    "directores, 21 docentes y 8 personal " +
                    "administrativo.",
            lineHeight = 16.sp,
            fontSize = 15.sp,
            modifier = modifier
                .padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        Greeting("Instituto Tecnologico de la Laguna")
    }
}