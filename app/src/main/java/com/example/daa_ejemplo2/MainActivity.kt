package com.example.daa_ejemplo2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalDensity
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
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                        ITL()
                }
               /* Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    /*Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )*/
                }*/
            }
        }
    }
}


@Composable
fun ITL(modifier: Modifier = Modifier) {
    //Image
    val image = painterResource(id = R.drawable.loksea)

    //String variables
    val txt1 = "Instituto Tecnológico de la Laguna"
    val txt2 = "El Instituto Tecnológico de La Laguna es una universidad pública ubicada en la ciudad de Torreón. El Instituto Tecnológico de la Laguna forma parte del Tecnológico Nacional de México."
    val txt3 = "El Instituto Tecnológico Regional De La Laguna, iniciando sus actividades el 26 de Septiembre de " +
            " 1965. A nivel medio superior se comenzó en " +
            " 1965 con el Bachillerato de Ciencias y Tecnologia en " +
            " tres opciones: Electrica, Mecanica automotriz " +
            " (combustión interna) y Mecánica (máquinas y " +
            "herramientas). La población escolar ascendió a " +
            "352 estudiantes inscritos en los siguientes niveles" +
            " 152 en medio superior, 148 en tecnico industral y " +
            "52 técnicos agropecuarios, atendidos por 2 " +
            "directores, 21 docentes y 8 personal administrativo."

    // Access the LocalDensity for converting between dp and px
    val density = LocalDensity.current

    // Convert pixels to dp
    val widthInDp = with(density) { 1440.toDp() }
    val heightInDp = with(density) { 480.toDp() }

    //Column that has a box (image) and text inside
    Column(
        modifier = modifier.background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //This box sits at the top has the image as a child element
        Box(
            modifier = Modifier
                .width(widthInDp) // Apply width in dp
                .height(heightInDp) // Apply height in dp
        ) {

            //Image inside box
            Image(
                painter = image,
                contentDescription = null,
                contentScale = ContentScale.Crop, // Ensure the image fills the box
                modifier = Modifier.fillMaxSize() // Makes the image fill the size of the Box
            )

        }

        //Text 1
        Text(
            text = txt1, //Gets text from val txt1
            textAlign = TextAlign.Center,
            modifier = modifier.padding(16.dp), // Increase padding for the title
            color = Color.Black,
            fontSize = 24.sp, // Larger font size for title
            fontWeight = FontWeight.Bold // Make the title bold

        )

        //Text 2
        Text(
            text=txt2, //Gets text from val txt2
            textAlign = TextAlign.Center,
            modifier = modifier.padding(8.dp),
            color = Color.Black,
            fontSize = 18.sp
        )

        //Text 3
        Text(
            text=txt3, //Gets text from val txt3
            modifier = modifier.padding(8.dp),
            color = Color.Black,
            fontSize = 18.sp
        )
    }
}



/*@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(

    ){
        Text(
            text = "Hello $name!",
            modifier = modifier
        )
    }


}*/

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        ITL()
        //Greeting("Android")
    }
}