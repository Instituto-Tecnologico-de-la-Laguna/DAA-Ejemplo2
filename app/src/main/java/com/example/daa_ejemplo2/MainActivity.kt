package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.sp
import com.example.daa_ejemplo2.ui.theme.DAAEjemplo2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DAAEjemplo2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MainContent(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MainContent(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Top, // Alinear al principio de la pantalla
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen en la parte superior
        Image(
            painter = painterResource(id = R.drawable.teclaguna),
            contentDescription = "Tec Laguna",
            modifier = Modifier
                .fillMaxWidth() // Ajustar al ancho de la pantalla
                .height(340.dp) // Ajusta la altura de la imagen
        )

        Spacer(modifier = Modifier.height(16.dp)) // Espacio entre imagen y texto

        // Primer texto
        Text(
            text = "Instituto tecnologico de la laguna",
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 24.sp
        )

        Spacer(modifier = Modifier.height(16.dp)) // Espacio entre textos

        // Segundo texto
        Text(
            text = "El instituto Tecnologico de la Laguna es una universidad pública ubicada en la ciudad de Torreón. " +
                    "El Intituto Tecnológico de la Laguna formar parte del Tecnólogico Nacional de México",
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 20.sp
        )

        Spacer(modifier = Modifier.height(20.dp)) // Espacio entre textos

        // Tercer texto
        Text(
            text = "El instituto Tecnologico Regional de la Laguna, iniciando sus actividades el 26 se Septiembre de 1965." +
                    "   A nivel medio superior se comenzo en 1965 con el Bachillerato de Ciencias y Tecnologia en 3 opciones:" +
                    " Electrica, Mecanica automotriz(Combustion Interna) y Mecanica (maquinas y herramientas)." +
                    " La poblacion escolar ascendio a 352 estudiantes inscritos en los siguientes niveles: " +
                    "152 en medio superior, 148 en tecnico industrial y 52 tecnicos agropecuarios, atendidos por 2 directores, 21 docentes y 8 personal administrativo",
            style = MaterialTheme.typography.bodyLarge,
            fontSize = 20.sp
        )
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewMainContent() {
    DAAEjemplo2Theme {
        MainContent()
    }
}
