package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.daa_ejemplo2.ui.theme.DAAEjemplo2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DAAEjemplo2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    InfoCard(
                        titulo = "Instituto Tecnológico de la Laguna",
                        texto1 = "Una universidad pública en Torreón, México, que es parte del Tecnológico Nacional de México.",
                        texto2 = "El IT Laguna comenzó en 1965 con varias opciones técnicas en nivel medio superior. Actualmente cuenta con más de 350 estudiantes en diferentes áreas."
                    )
                }
            }
        }
    }
}

@Composable
fun InfoCard(titulo: String, texto1: String, texto2: String) {
    // Columna con alineación central y espaciado
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        // Imagen circular centrada
        val imagen = painterResource(id = R.drawable.teclaguna)
        Image(
            painter = imagen,
            contentDescription = null,
            modifier = Modifier
                .clip(CircleShape)  // Hace la imagen circular
                .background(Color.LightGray)  // Fondo gris claro para la imagen
                .width(150.dp)  // Ajusta el ancho
                .height(150.dp),  // Ajusta la altura
            contentScale = ContentScale.Crop
        )

        // Texto del título en negrita con tamaño de fuente grande
        Text(
            text = titulo,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            color = Color.Black,
            modifier = Modifier.padding(vertical = 12.dp)
        )

        // Primer bloque de texto
        Text(
            text = texto1,
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            color = Color.Gray,
            modifier = Modifier.padding(vertical = 8.dp)
        )

        // Segundo bloque de texto
        Text(
            text = texto2,
            fontSize = 14.sp,
            textAlign = TextAlign.Center,
            color = Color.Gray,
            modifier = Modifier.padding(vertical = 8.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun InfoCardPreview() {
    DAAEjemplo2Theme {
        InfoCard(
            titulo = "Instituto Tecnológico de la Laguna",
            texto1 = "Una universidad pública en Torreón, México, que es parte del Tecnológico Nacional de México.",
            texto2 = "El IT Laguna comenzó en 1965 con varias opciones técnicas en nivel medio superior. Actualmente cuenta con más de 350 estudiantes en diferentes áreas."
        )
    }
}
