package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.daa_ejemplo2.ui.theme.DAAEjemplo2Theme
//Paulina Jaqueline Castañeda Villalobos 21130850
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DAAEjemplo2Theme {
                Surface(
                    modifier = Modifier.fillMaxWidth(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage("Instituto Tecnológico de la laguna ",
                        "El Instituto Tecnológico de la Laguna es una universidad " +
                                "pública ubicada en la ciudad de Torreón. El Instituto Tecnológico " +
                                "de La Laguna forma parte del Tecnológico Nacional de México.",
                        "El Instituto Tecnológico Regional De La Laguna, iniciando sus " +
                                "actividades sus actividades el 26 de Septiembre de 1965. A nivel medio " +
                                "superior se comenzó en 1965 con el Bachillerato de Ciencias y Tecnología " +
                                "en tres opciones: Eléctrica, Mecánica automotriz (combustión interna) y " +
                                "Mecánica (máquinas y herramientas). La población escolar ascendió a 352 " +
                                "estudiantes inscritos en los siguientes niveles: 152 en medio superior, " +
                                "148 en técnico industrial y 52 técnicos agropecuarios, atendidos por 2 directores, " +
                                "21 docentes y 8 personal administrativo.")
                }
            }
        }
    }
}

@Composable
fun GreetingImage(titulo: String, descr1: String, descr2: String, modifier: Modifier = Modifier){
    val image = painterResource(id = R.drawable.tec)
    Column(
        modifier = modifier
    ){
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxWidth().height(150.dp)
        )
        Text(
            text = titulo,
            fontSize = 18.sp,
            color = Color.DarkGray,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                )
        )
        Text(
            text = descr1,
            fontSize = 14.sp,
            color = Color.DarkGray,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                )
        )
        Text(
            text = descr2,
            fontSize = 14.sp,
            color = Color.DarkGray,
            textAlign = TextAlign.Start,
            modifier = Modifier
                .fillMaxWidth()
                .padding(
                    start = 16.dp,
                    top = 16.dp,
                    end = 16.dp,
                    bottom = 16.dp
                )
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        GreetingImage("Instituto Tecnológico de la laguna ",
            "El Instituto Tecnológico de la Laguna es una universidad " +
                    "pública ubicada en la ciudad de Torreón. El Instituto Tecnológico " +
                    "de La Laguna forma parte del Tecnológico Nacional de México.",
            "El Instituto Tecnológico Regional De La Laguna, iniciando sus " +
                    "actividades sus actividades el 26 de Septiembre de 1965. A nivel medio " +
                    "superior se comenzó en 1965 con el Bachillerato de Ciencias y Tecnología " +
                    "en tres opciones: Eléctrica, Mecánica automotriz (combustión interna) y " +
                    "Mecánica (máquinas y herramientas). La población escolar ascendió a 352 " +
                    "estudiantes inscritos en los siguientes niveles: 152 en medio superior, " +
                    "148 en técnico industrial y 52 técnicos agropecuarios, atendidos por 2 directores, " +
                    "21 docentes y 8 personal administrativo.")
    }
}