// Layla Vanessa González Martínez 21130868

package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
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
import com.example.daa_ejemplo2.ui.theme.DAAEjemplo2Theme
import androidx.compose.ui.unit.sp as sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DAAEjemplo2Theme {
                Surface ( modifier = Modifier, color = MaterialTheme.colorScheme.background ) {
                    Greeting (
                            name = "Instituto Tecnológico de la Laguna",
                            descrip = "El Instituto Tecnológico de la Laguna es una universidad pública ubicada en la ciudad de Torreón. El Instituto Tecnológico de la Laguna forma parte del Tecnológico Nacional de México.",
                            hist = "El Instituto Tecnológico Regionoal de la Laguna, iniciando sus actividades el 26 de Septiembre de 1965. A nivel medio superior se comenzó en 1965 con el Bachillerato de Ciencias y Tecnología en tres opciones: Eléctrica, Mecánica automotriz (combustión interna) y Mecánica (máquinas y herramientas). La población escolar ascendió a 352 estudiantes inscritos en los siguientes niveles: 152 en medio superior, 148 en técnico industrial y 52 técnicos agropecuarios, atendidos por 2 directores, 21 docentes y 8 personal administrativo.",
                            modifier = Modifier
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting( name: String, descrip: String, hist: String, modifier: Modifier = Modifier ) {
    val imagen = painterResource ( id = R.drawable.tec )

    Column (
            verticalArrangement = Arrangement.Center,
            modifier = modifier
    ) {
        Image (
            painter = imagen,
            contentDescription = null,
            contentScale = ContentScale.Inside
        )

        Text (
            text = name,
            fontSize = 18.sp,
            modifier = Modifier.padding( 20.dp, 15.dp )
        )

        Text (
            text = descrip,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding( 20.dp, 35.dp )
        )

        Text (
            text = hist,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding( 20.dp, 35.dp )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        Greeting (
                name = "Instituto Tecnológico de la Laguna",
                descrip = "El Instituto Tecnológico de la Laguna es una universidad pública ubicada en la ciudad de Torreón. El Instituto Tecnológico de la Laguna forma parte del Tecnológico Nacional de México.",
                hist = "El Instituto Tecnológico Regionoal de la Laguna, iniciando sus actividades el 26 de Septiembre de 1965. A nivel medio superior se comenzó en 1965 con el Bachillerato de Ciencias y Tecnología en tres opciones: Eléctrica, Mecánica automotriz (combustión interna) y Mecánica (máquinas y herramientas). La población escolar ascendió a 352 estudiantes inscritos en los siguientes niveles: 152 en medio superior, 148 en técnico industrial y 52 técnicos agropecuarios, atendidos por 2 directores, 21 docentes y 8 personal administrativo.",
                modifier = Modifier
        )
    }
}