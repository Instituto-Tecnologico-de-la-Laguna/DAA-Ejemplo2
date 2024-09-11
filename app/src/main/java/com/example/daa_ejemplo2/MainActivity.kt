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
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.daa_ejemplo2.ui.theme.DAAEjemplo2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DAAEjemplo2Theme {
                ImagenDeInicio()
            }
        }
    }
}

@Composable
fun ImagenDeInicio() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        val imagen = painterResource(id = R.drawable.tec_laguna)
        Box(modifier = Modifier.fillMaxWidth()) {
            Image(
                painter = imagen,
                contentDescription = null,
                modifier = Modifier.fillMaxWidth()
            )
        }

        Text(
            text = "Instituto Tecnologico de la Laguna",
            textAlign = TextAlign.Center,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Text(
            text = "El instituto Tecnólogico de La Laguna es una" +
                    " universidad publica ubicada en la ciudad de Torreón" +
                    ". El instituto Tecnológico de La Laguna forma parte del Tecnológico" +
                    " Nacional de México.",
            textAlign = TextAlign.Justify,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Text(
            text = "El instituto Tecnológico Regional De La Laguna" +
                    ". iniciando sus actividades el 26 de Septiembre" +
                    " de 1965. A nivel medio superior se comenzó en 1965" +
                    " con el Bachillerato de Ciencais y Tecnología en" +
                    " tres opciones: Électrica, Mecánica automotriz (combustión interna)" +
                    " y Mécanica (máquinas y herramientas). La población escolar ascendió " +
                    "a 352 estudiantes inscritos en los siguientes niveles: 52 técnicos " +
                    "agropecuarios, atendidos pos 2 directores, 21 docentes y 8 personal administrativo",
            textAlign = TextAlign.Justify,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        ImagenDeInicio()
    }
}