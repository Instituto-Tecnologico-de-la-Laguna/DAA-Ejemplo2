package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
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
        enableEdgeToEdge()
        setContent {
            DAAEjemplo2Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    TextoTec(
                        par1 = "Instituto Tecnologico de la Laguna",
                        par2 = " El Instituto Tecnologico de la laguna es una institucion localizada en",
                        par3 = "Inicio sus operaciones el",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun TextoTec( par1: String, par2: String, par3 : String, modifier: Modifier = Modifier) {
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = CenterHorizontally
    )
    {
        Text(
            text = par1,
            fontSize = 20.sp, // Aumentamos el tamaño de la fuente para el título
            fontWeight = FontWeight.Bold, // Hacemos que sea negrita para resaltar como título
            lineHeight = 30.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 66.dp)

        )
        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = par2,
            fontSize = 15.sp,
            lineHeight = 25.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )
        
        Text(
            text = par3,
            fontSize = 15.sp,
            lineHeight = 25.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        )

    }
}

@Composable
fun imagenTec() {
    val image = painterResource(id = R.drawable.sesion_informativa_abril_auditorio_departamento_jpg)
    Image(
        painter = image,
        contentDescription = null,
        contentScale = ContentScale.FillWidth,
        modifier = Modifier.fillMaxWidth() // Para  que se ajuste al ancho
    )
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        imagenTec()
        TextoTec("Instituto Tecnologico de la Laguna",
                 "El Instituto Tecnologico de la Laguna es una universidad publica ubicada en la" +
                    "ciudad de Torreón. El Instituto tecnologico de La Laguna forma parte del " +
                    "Tecnologico Nacional de México",
                 "El Instituto Regional de la Laguna, iniciando sus actividades el 26 de " +
                         "septiembre de 1965. A nivel medio superior se comenzó en 1965 con el " +
                         "bachillerato de Ciencias y Tecnologia en 3 opciones: Electrica, Mecanica " +
                         "automotriz (combustion interna) y Mecanica (maquinas y herramientas). La " +
                         "poblacion escular ascendio a 352 estudiantes inscritos en los siguientes " +
                         "niveles: 152 en medio superior, 148 en tecnico industrial y 52 tecnicos " +
                         "agropecuarios, atendidos por 2 directores, 21 docentes  y 8 de personal " +
                         "administrativo")
    }
}