package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
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

                    Column(
                        verticalArrangement = Arrangement.Center
                    ) {
                        Box{
                            GreetingImage()
                        }

                        Box(modifier = Modifier.fillMaxWidth().padding( horizontal = 25.dp),
                            contentAlignment = Alignment.Center){
                            GreetingText(
                                titulo = "Instituto Tecnológico de La Laguna",
                                texto_1 = "El Instituto Tecnológico de La Laguna es una universidad pública " +
                                        "ubicada en la ciudad de Torreón. El Instituto Tecnológico de La " +
                                        "Laguna forma parte del Tecnológico Nacional de México.",
                                texto_2 = "El Instituto Tecnológico Regional De La Laguna, iniciando sus " +
                                        "actividades el 26 de Septiembre de 1965. A nivel medio superior se " +
                                        "comenzó en 1965 con el Bachillerato de Ciencias y Tecnología en tres " +
                                        "opciones: Eléctrica, Mecánica automotriz (combustión interna) y " +
                                        "Mecánica (máquinas y herramientas). La población escolar ascendió a " +
                                        "352 estudiantes inscritos en los siguientes niveles: 152 en medio " +
                                        "superior, 148 en técnico industrial y 52 técnicos agropecuarios, " +
                                        "atendidos por 2 directores, 21 docentes y 8 personal administrativo."
                            )
                        }

                    }

            }
        }
    }
}

@Composable
fun GreetingImage(){
    val imagen = painterResource(id = R.drawable.teclaguna)
    Box{
        Image(
            painter = imagen,
            contentDescription = null,
            contentScale = ContentScale.Fit
        )
    }

}

@Composable
fun GreetingText(titulo: String, texto_1: String, texto_2: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier
    ) {
        Text(
            text = titulo,
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            fontStyle = FontStyle.Italic,
            color = Color.Black,
            lineHeight = 50.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.padding(bottom = 20.dp)
        )

        Text(
            text = texto_1,
            fontSize = 20.sp,
            color = Color.Black,
            lineHeight = 24.sp,
            textAlign = TextAlign.Center,
            modifier = modifier.padding(bottom = 20.dp)
        )

        Text(
            text = texto_2,
            fontSize = 20.sp,
            color = Color.Black,
            lineHeight = 24.sp,
            textAlign = TextAlign.Left,
            modifier = modifier.padding(bottom = 20.dp)
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
            Box{
                GreetingImage()
            }

            Box(modifier = Modifier.fillMaxWidth().padding( horizontal = 25.dp),
                contentAlignment = Alignment.Center){
                GreetingText(
                    titulo = "Instituto Tecnológico de La Laguna",
                    texto_1 = "El Instituto Tecnológico de La Laguna es una universidad pública " +
                            "ubicada en la ciudad de Torreón. El Instituto Tecnológico de La " +
                            "Laguna forma parte del Tecnológico Nacional de México.",
                    texto_2 = "El Instituto Tecnológico Regional De La Laguna, iniciando sus " +
                            "actividades el 26 de Septiembre de 1965. A nivel medio superior se " +
                            "comenzó en 1965 con el Bachillerato de Ciencias y Tecnología en tres " +
                            "opciones: Eléctrica, Mecánica automotriz (combustión interna) y " +
                            "Mecánica (máquinas y herramientas). La población escolar ascendió a " +
                            "352 estudiantes inscritos en los siguientes niveles: 152 en medio " +
                            "superior, 148 en técnico industrial y 52 técnicos agropecuarios, " +
                            "atendidos por 2 directores, 21 docentes y 8 personal administrativo."
                )
            }

        }

    }
}