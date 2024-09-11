package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.daa_ejemplo2.ui.theme.DAAEjemplo2Theme

// Humberto Medina Santos
// No. de Control: 21130862

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DAAEjemplo2Theme {
                Surface (
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting (
                        texto1 = "Instituto Tecnologico de la Laguna",
                        texto2 = "El Instituto Tecnológico de La Laguna es una universidad pública ubicada en la ciudad de Torreón. El Instituto Tecnológico de La Laguna forma parte del Tecnológico Nacional de México.",
                        texto3 = "El Instituto Tecnológico Regional De La Laguna, iniciando sus actividades el 26 de Septiembre de 1965. A nivel medio superior se comenzó en 1965 con el Bachillerato de Ciencias y Tecnologia en tres opciones: Eléctrica, Mecánica automotriz (combustión interna) y Mecánica (máquinas y herramientas). La población escolar ascendió a 352 estudiantes inscritos en los siguientes niveles: 152 en medio superior, 148 en técnico industrial y 52 técnicos agropecuarios, atendidos por 2 directores, 21 docentes y 8 personal administrativo.",
                        modifier = Modifier
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(texto1: String, texto2: String, texto3: String, modifier: Modifier = Modifier) {
    val imagen = painterResource(id = R.drawable.tec)

    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Image (
            painter = imagen,
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
        Text(
            text = texto1,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(35.dp, 10.dp)
        )
        Text(
            text = texto2,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(15.dp, 30.dp)
        )
        Text(
            text = texto3,
            fontSize = 15.sp,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .padding(15.dp, 10.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        Greeting (
            texto1 = "Instituto Tecnologico de la Laguna",
            texto2 = "El Instituto Tecnológico de La Laguna es una universidad pública ubicada en la ciudad de Torreón. El Instituto Tecnológico de La Laguna forma parte del Tecnológico Nacional de México.",
            texto3 = "El Instituto Tecnológico Regional De La Laguna, iniciando sus actividades el 26 de Septiembre de 1965. A nivel medio superior se comenzó en 1965 con el Bachillerato de Ciencias y Tecnologia en tres opciones: Eléctrica, Mecánica automotriz (combustión interna) y Mecánica (máquinas y herramientas). La población escolar ascendió a 352 estudiantes inscritos en los siguientes niveles: 152 en medio superior, 148 en técnico industrial y 52 técnicos agropecuarios, atendidos por 2 directores, 21 docentes y 8 personal administrativo.",
            modifier = Modifier
        )
    }
}