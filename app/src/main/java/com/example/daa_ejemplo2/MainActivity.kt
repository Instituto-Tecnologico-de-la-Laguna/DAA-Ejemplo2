package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
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
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val imagen = painterResource(id = R.drawable.tec) // Reemplaza con tu imagen

        Image(
            painter = imagen,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(180.dp),
            contentScale = ContentScale.Crop
        )

        Text(
            text = "Instituto Tecnologico de la Laguna",
            fontSize = 24.sp,
            textAlign = TextAlign.Center
        )



        Text(
            text = "El Instituto Tecnológico de La Laguna es una universidad pública ubicada en la ciudad de Torreón. El Instituto Tecnológico de La Laguna forma parte del Tecnológico Nacional de México.",
            fontSize = 16.sp,
            color = Color.Black,
            textAlign = TextAlign.Justify
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "El Instituto Tecnológico Regional De La Laguna, inició sus actividades el 26 de Septiembre de 1965. A nivel medio superior se comenzó en 1965 con el Bachillerato de Ciencias y Tecnología en tres opciones: Eléctrica, Mecánica automotriz (combustión interna) y Mecánica (máquinas y herramientas). La población escolar ascendía a 352 estudiantes inscritos en los siguientes niveles: 152 en medio superior, 148 en técnico industrial y 52 técnicos agropecuarios, atendidos por 2 directores, 21 docentes y 8 personal administrativo.",
            fontSize = 16.sp,
            color = Color.Black,
            textAlign = TextAlign.Justify
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        Greeting()
    }
}