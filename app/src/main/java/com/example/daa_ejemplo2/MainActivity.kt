package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.daa_ejemplo2.ui.theme.DAAEjemplo2Theme
import androidx.compose.material3.Surface
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.layout.Column
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DAAEjemplo2Theme {
                Column(
                    verticalArrangement = Arrangement.Center

                ) {
                    GreetingImage()
                    GreetingText(
                        "   Instituto Tecnologico de la Laguna",
                        "El instituto Tecnologico de La Laguna es una universidad publica " +
                                "ubicada en la ciudad de torreon. El instituto tecnologico de la laguna forma parte del tecnologico nacional de México.",
                        from2 = "El instituto Tecnologico Regional De La Laguna, iniciando sus actividades del 26 de septiembre de 1965. A nivel medio superior se comenzo en 1965 con el Bachillerato de Ciencias y Tecnologia en tres opciones: Electrica, Mecanica automotriz( combustion interna) y Mecanica(maquinas y herramientas)." +
                                "La poblacion escolar ascendio a 352 estudiantes inscritos en los siguientes niveles 152 en medio superior, 148 en tecnico industrial y 52 tecnicos agropecuarios, atendidos por 2 directores 21 docentes y 8 personal administrativo."
                    )
                }

            }
        }
    }
}



@Composable
fun GreetingText(message: String, from:String, from2:String, modifier: Modifier = Modifier) {
    Column(verticalArrangement = Arrangement.Center,
        modifier = modifier){
        Text(
            text = message,
            fontSize = 20.sp,
            color = Color.Black,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center

        )
        Text(
            text = from,
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(13.dp)
                .align(alignment = Alignment.End)
                //.background(Color.Yellow)
        )
        Text(
            text = from2,
            fontSize = 15.sp,
            modifier = Modifier
                .padding(13.dp)
                .align(alignment = Alignment.End)
        )
    }
}
@Composable
fun GreetingImage(){
    val imagen= painterResource(id = R.drawable.teclag)
    Box{
        Image(
            painter = imagen,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        Column(
            verticalArrangement = Arrangement.Center

        ) {
            GreetingImage()
            GreetingText(
                "Instituto Tecnologico de la Laguna",
                "El instituto Tecnologico de La Laguna es una universidad publica " +
                        "ubicada en la ciudad de torreon.\n" +
                        "El instituto tecnologico de la laguna forma parte del tecnologico nacional de México.",
                from2 = "De La Laguna, iniciando sus actividades del 26 de septiembre de 1965. A nivel medio superior se comenzo en 1965 con el Bachillerato de Ciencias y Tecnologia en tres opciones: Electrica, Mecanica automotriz( combustion interna) y Mecanica(maquinas y herramientas). \n" +
                        "La poblacion escolar ascendio a 352 estudiantes inscritos en los siguientes niveles 152 en medio superior, 148 en tecnico industrial y 52 tecnicos agropecuarios, atendidos por 2 directores 21 docentes y 8 personal administrativo."
            )
        }

    }
}