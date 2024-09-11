package com.example.daa_ejemplo2

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import androidx.compose.ui.unit.dp
import com.example.daa_ejemplo2.ui.theme.DAAEjemplo2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DAAEjemplo2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize()

                ){
                    STexto(titulo = "Instituto Tecnológico de la Laguna",
                        parrafo1 = "El Instituto Tecnológico de La Laguna es una universidad pública ubicada en la ciudad de Torreón. El Instituto Tecnológico de La Laguna forma parte del Tecnológico Nacional de México.",
                        parrafo2 = "El Instituto Tecnológico Regional De La Laguna, Iniciando sus actividades el 26 de Septiembre de 1965. A nivel medio superior se comenzó en 1965 con el Bachillerato de Ciencias y Tecnología en tres opciones: Eléctrica, Mecánica automotriz (combustión interna) y Mecánica (máquinas y herramientas). La población escolar ascendió a 352 estudiantes inscritos en los siguientes niveles: 152 en medio superior, 148 en técnico industrial y 52 técnicos agropecuarios, atendidos por 2 directores, 21 docentes y 8 personal administrativo.")
                }
            }
        }
    }
}

@Composable
fun STexto(titulo: String, parrafo1: String, parrafo2: String, modifier: Modifier = Modifier)
{
    val imagen = painterResource(id =  R.drawable.teclag)
    Column {
        Image(
            painter = imagen,
            contentDescription = null,
            contentScale = ContentScale.Crop
        )

        Text(
            text = titulo,
            fontSize = 30.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = parrafo1,
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(16.dp)
        )

        Text(
            text = parrafo2,
            fontSize = 15.sp,
            textAlign = TextAlign.Left
        )
    }

}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        STexto(titulo = "Instituto Tecnológico de la Laguna",
            parrafo1 = "El Instituto Tecnológico de La Laguna es una universidad pública ubicada en la ciudad de Torreón. El Instituto Tecnológico de La Laguna forma parte del Tecnológico Nacional de México.",
            parrafo2 = "El Instituto Tecnológico Regional De La Laguna, Iniciando sus actividades el 26 de Septiembre de 1965. A nivel medio superior se comenzó en 1965 con el Bachillerato de Ciencias y Tecnología en tres opciones: Eléctrica, Mecánica automotriz (combustión interna) y Mecánica (máquinas y herramientas). La población escolar ascendió a 352 estudiantes inscritos en los siguientes niveles: 152 en medio superior, 148 en técnico industrial y 52 técnicos agropecuarios, atendidos por 2 directores, 21 docentes y 8 personal administrativo.")
    }
}