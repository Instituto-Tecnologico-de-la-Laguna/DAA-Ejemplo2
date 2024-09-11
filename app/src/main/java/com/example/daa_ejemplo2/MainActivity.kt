package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
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

                    GreetingPantalla(
                        imagen = R.drawable.tec_de_la_laguna,
                        parte2 = "Instituto Tecnologico de la Laguna",
                        parte3 = "Instituto Tecnológico de La Laguna es una universidad pública ubicada en la ciudad de Torreón. El Instituto Tecnológico de La Laguna forma parte del Tecnológico Nacional de México.",
                        parte4 = "El Instituto Tecnológico Regional De La Laguna, iniciando sus actividades el 26 de Septiembre de 1965. A nivel medio superior se comenzó en 1965 con el Bachillerato de Ciencias y Tecnología en tres opciones: Eléctrica, Mecánica automotriz (combustión interna) y Mecánica (máquinas y herramientas). La población escolar ascendió a 352 estudiantes inscritos en los siguientes niveles: 152 en medio superior, 148 en técnico industrial y 52 técnicos agropecuarios, atendidos por 2 directores, 21 docentes y 8 personal administrativo."
                    )

                }
            }
        }
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////

@Composable
fun GreetingPantalla(
    imagen: Int,
    parte2: String,
    parte3: String,
    parte4: String,
    modifier: Modifier = Modifier
) {
    Column(

        verticalArrangement = Arrangement.Center,
        modifier = modifier

    ) {

        GreetingImage(imagen)
        GreetingText(parte2, parte3, parte4, modifier = Modifier.padding(16.dp))

    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////

@Composable
fun GreetingImage(
    imagen: Int,
    modifier: Modifier = Modifier
) {

    Box {
        val image = painterResource(id = imagen)

        Image(

            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(
                    500.dp,
                    200.dp
                )

        )

    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////

@Composable
fun GreetingText(
    parte2: String,
    parte3: String,
    parte4: String,
    modifier: Modifier = Modifier
) {

    Column(

        modifier = modifier

    ) {
        Text(

            text = parte2,
            fontSize = 24.sp,
            lineHeight = 28.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(
                    bottom = 50.dp
                )
        )

        Text(

            text = parte3,
            fontSize = 18.sp,
            lineHeight = 24.sp,
            color = Color.Black,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(
                    bottom = 50.dp
                )

        )

        Text(

            text = parte4,
            fontSize = 18.sp,
            lineHeight = 20.sp,
            color = Color.Black,
            textAlign = TextAlign.Left,
            modifier = Modifier
                .padding(
                    top = 20.dp,
                    start = 20.dp,
                    end = 20.dp
                )

        )
    }
}

////////////////////////////////////////////////////////////////////////////////////////////////////

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {

        GreetingPantalla(

            imagen = R.drawable.tec_de_la_laguna,
            parte2 = "Instituto Tecnologico de la Laguna",
            parte3 = "Instituto Tecnológico de La Laguna es una universidad pública ubicada en la ciudad de Torreón. El Instituto Tecnológico de La Laguna forma parte del Tecnológico Nacional de México.",
            parte4 = "El Instituto Tecnológico Regional De La Laguna, iniciando sus actividades el 26 de Septiembre de 1965. A nivel medio superior se comenzó en 1965 con el Bachillerato de Ciencias y Tecnología en tres opciones: Eléctrica, Mecánica automotriz (combustión interna) y Mecánica (máquinas y herramientas). La población escolar ascendió a 352 estudiantes inscritos en los siguientes niveles: 152 en medio superior, 148 en técnico industrial y 52 técnicos agropecuarios, atendidos por 2 directores, 21 docentes y 8 personal administrativo."

        )
    }
}
