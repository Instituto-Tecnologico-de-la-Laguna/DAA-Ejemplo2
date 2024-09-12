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
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.inverseSurface
                ) {
                    GreetingImage(
                        titulo = "Instituto Tecnológico de la Laguna",
                        texto1 = "El Instituto Tecnológico de La Laguna es una " +
                                "universidad pública ubicada en la ciudad de Torreón. " +
                                "El Instituto Tecnológico de La Laguna forma parte del " +
                                "Tecnológico Nacional de México.",
                        texto2 = "El Instituto Tecnológico Regional De La Laguna, " +
                                "inició sus actividades el 26 de septiembre de 1965. " +
                                "A nivel medio superior se comenzó en 1965 con el " +
                                "Bachillerato de Ciencias y Tecnología en tres opciones: " +
                                "Eléctrica, Mecánica automotriz (combustión interna) y " +
                                "Mecánica (máquinas y herramientas). La población escolar " +
                                "ascendió a 352 estudiantes inscritos en los siguientes " +
                                "niveles: 152 en medio superior, 148 en técnico industrial " +
                                "y 52 técnicos agropecuarios, atendidos por 2 directores, " +
                                "21 docentes y 8 personal administrativo.",
                        modifier = Modifier.padding(8.dp))
                }
            }
        }
    }
}

@Composable
fun GreetingImage(titulo: String, texto1: String, texto2: String, modifier: Modifier=Modifier) {
    // Usamos una columna para tener la imagen en la parte superior y los textos debajo
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen en la parte superior
        val imagen = painterResource(id = R.drawable.teclaguna)
        Image(
            painter = imagen,
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )

        Text(
            text = titulo,
            fontSize = 24.sp,
            textAlign = TextAlign.Center,
            color = androidx.compose.ui.graphics.Color.Black,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Text(
            text = texto1,
            fontSize = 14.sp,
            textAlign = TextAlign.Justify,
            color = androidx.compose.ui.graphics.Color.Black,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        Text(
            text = texto2,
            fontSize = 14.sp,
            textAlign = TextAlign.Justify,
            color = androidx.compose.ui.graphics.Color.Black,
            modifier = Modifier.padding(vertical = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        GreetingImage(
            titulo = "Instituto Tecnológico de la Laguna",
            texto1 = "El Instituto Tecnológico de La Laguna es una " +
                    "universidad pública ubicada en la ciudad de Torreón. " +
                    "El Instituto Tecnológico de La Laguna forma parte del " +
                    "Tecnológico Nacional de México.",
            texto2 = "El Instituto Tecnológico Regional De La Laguna, " +
                    "inició sus actividades el 26 de septiembre de 1965. " +
                    "A nivel medio superior se comenzó en 1965 con el " +
                    "Bachillerato de Ciencias y Tecnología en tres opciones: " +
                    "Eléctrica, Mecánica automotriz (combustión interna) y " +
                    "Mecánica (máquinas y herramientas). La población escolar " +
                    "ascendió a 352 estudiantes inscritos en los siguientes " +
                    "niveles: 152 en medio superior, 148 en técnico industrial " +
                    "y 52 técnicos agropecuarios, atendidos por 2 directores, " +
                    "21 docentes y 8 personal administrativo."
        )
    }
}