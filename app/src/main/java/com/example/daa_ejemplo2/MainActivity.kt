package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.layout.ContentScale
import com.example.daa_ejemplo2.ui.theme.DAAEjemplo2Theme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DAAEjemplo2Theme {

            }
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background

                ) {
                    GreetingText(message = "Instituto Tecnologico de la Laguna",
                        datos = "From Miriam", resumen = "j",
                        modifier = Modifier
                            .padding(8.dp)
                    )
                }

        }
    }
}
@Composable
fun GreetingText(message: String, datos: String, resumen: String,  modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    )
    {  Text(
        text = message,
        fontSize = 20.sp,
        color = Color.Black,
        lineHeight = 116.sp,
        textAlign = TextAlign.Center,
                modifier = Modifier
                    .offset(y = 50.dp)
                    .padding(16.dp)

    )

        Text(
            text = datos,
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(16.dp)


        )

        Text(text = resumen,
            fontSize = 14.sp)
    }

}

@Composable
fun GreetingImage(message: String, datos: String, resumen: String) {
    val imagen = painterResource(id = R.drawable.teclaguna)

    Box(
        modifier = Modifier
            .size(700.dp, 100.dp)



    ){
        Image(
            painter = imagen,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(
                    700.dp,
                    1000.dp
                )





        )



    }
    GreetingText(
        message = "Instituto Tecnologico de la Laguna",
        datos = "El instituto Tecnológico de La Laguna es una universidad publica ubicada en la ciudad de Torreon. El Instituto Tecnológico de La Laguna forma parte del Tecnológico de La Laguna forma parte del Tecnológico Nacional de México.",
        resumen ="El instituto Tecnológico Regional De La Laguna, iniciando sus actividades el 26 de Septiembre de 1956. A nivel medio superior se comenzó en 1965 con el Bachillerato e Ciencias y Tecnología en tres opciones: Eléctrica, Mecánica automotriz (combustion interna) y Mecánica (maquinas y herramientas). La población escolar ascendió a a352 estudiantes inscritos en los siguientes niveles: 152 en medio superior, 148 en técnico industrial y 52 técnicos agropecuarios, atendidos por 2 directores, 21 docentes y 8 personal administrativo.",
        modifier = Modifier.padding(8.dp)
    )

}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
   DAAEjemplo2Theme {
        GreetingImage(message = "Instituto Tecnologico de la Laguna", datos = "De Miriam", resumen = "Resumen")
    }
}