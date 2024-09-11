package com.example.daa_ejemplo2


import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
        setContent {
            DAAEjemplo2Theme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    InfoCard()
                }
            }
        }
    }

    @Composable
    fun InfoCard() {
        Column(
            modifier = Modifier
                .fillMaxSize()
              //  .padding(16.dp),
            //horizontalAlignment = Alignment.CenterHorizontally,
           // verticalArrangement = Arrangement.Top
        ) {
            // Imagen del instituto
            Image(
                painter = painterResource(id = R.drawable.tec_laguna),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                contentScale = ContentScale.Crop //
            )

            Spacer(modifier = Modifier.height(16.dp))

            // Texto del título
            Text(
                text = "Instituto Tecnologico de la Laguna",
                fontSize = 24.sp,
                color = Color.Black,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 8.dp)
            )

            Spacer(modifier = Modifier.height(20.dp))

            // Caja con descripción
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White, shape = RoundedCornerShape(8.dp))

                    .padding(vertical = 16.dp)
            ) {
                Column {
                    Text(
                        text = "El Instituto Tecnológico de La Laguna es una " +
                                "universidad pública ubicada en la ciudad " +
                                "de Torreón El Instituto Tecnológico de La Laguna " +
                                "forma parte del Tecnológico Nacional de México.",
                        fontSize = 14.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .padding(bottom = 40.dp)
                    )

                    Text(
                        text = "El Instituto Tecnológico Regional De La Laguna, iniciando sus actividades el 26 de Septiembre de 1965." +
                                " A nivel medio superior se comenzó en 1965 con el Bachillerato de Ciencias y Tecnología en tres opciones: Eléctrica, " +
                                "Mecánica automotriz (combustión interna) y Mecánica (máquinas y herramientas). La población escolar ascendió a " +
                                "352 estudiantes inscritos en los siguientes niveles: 152 en medio superior, 148 en técnico industrial y " +
                                "52 técnicos agropecuarios, atendidos por 2 directores, 21 docentes y 8 personal administrativo.",
                        fontSize = 14.sp,
                        color = Color.Black,
                        textAlign = TextAlign.Left
                    )
                }
            }
        }
    }//VALE

    @Preview(showBackground = true)
    @Composable
    fun InfoCardPreview() {
        DAAEjemplo2Theme {
            InfoCard()
        }


    }
}