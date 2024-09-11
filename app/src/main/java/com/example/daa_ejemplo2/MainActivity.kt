package com.example.daa_ejemplo2

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
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
                ){//practica 3 por Luis Ernesto Barranco 21130876
                    GreetingWork(//llamammos al metodo para desplegarlo en el celular
                        //message1 = t1,
                        //message2 = t2,
                        //message3 = t3,
                        modifier = Modifier//.padding(4.dp)
                    )
                }
            }
        }
    }
}

//variables globales que alamacenan el texto
//se sustituyo por resource string
/*val t1 = "Instituto Tecnologico de la Laguna"
val t2 = "El Instituto Tecnológico de La Laguna es una\n" +
        "universidad pública ubicada en la ciudad de\n" +
        "Torreón. El Instituto Tecnológico de La Laguna\n" +
        "forma parte del Tecnológico Nacional de México"

val t3 = "El Instituto Tecnológico Regional De La Laguna,\n" +
        "iniciando sus actividades el 26 de Septiembre de\n" +
        "1965. A nivel medio superior se comenzó en 1965\n" +
        "con el Bachillerato de Ciencias y Tecnologia en\n" +
        "tres opciones: Electrica, Mecânica automotriz\n" +
        "(combustión interna) y Mecánica (maquinas y\n" +
        "herramientas). La poblacion escolar ascendio a\n" +
        "352 estudiantes inscritos en los siquientes niveles:\n" +
        "152 en medio superior. 148 en técnico industrial y\n" +
        "52 técnicos agropecuarios, atendidos por 2\n" +
        "directores, 21 docentes y 8 personal\n" +
        "administrativo"
*/

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

//metodo donde se ejecuta la tarea solicitada
//ya no recibe string porque los toma del resource string
@Composable
fun GreetingWork(
    //message1: String,
    //message2: String,
    //message3: String,
    modifier:Modifier=Modifier
){
    //imagen del centro de computo
    val imagen = painterResource(id = R.drawable._50px_labcompitl_2)
    //texto del teclaguna
    val txt = stringResource(id = R.string.teclag)
    val txt2 = stringResource(id = R.string.t2)
    val txt3 = stringResource(id = R.string.t3)
    Column(
        verticalArrangement = Arrangement.spacedBy(14.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = modifier.fillMaxHeight()
    ){
        Image(
            painter = imagen,
            contentDescription = null,
            contentScale = ContentScale.FillBounds,
            modifier = modifier.height(140.dp)
        )
        Text(
            text = txt.toString(),
            modifier = modifier.height(80.dp).padding(16.dp),
            fontSize = 14.sp,
            textAlign = TextAlign.Center
            //lineHeight = 50.sp
        )
        Text(
            text = txt2.toString(),
            modifier = modifier.height(140.dp).padding(16.dp),
            fontSize = 14.sp,
            textAlign = TextAlign.Center
            //lineHeight = 20.sp
        )
        Text(
            text = txt3.toString(),
            modifier = modifier.padding(8.dp),
            fontSize = 14.sp,
            textAlign = TextAlign.Left
            //lineHeight = 25.sp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        //Greeting("Android")
        GreetingWork(//llamada al metodo para verlo en preview
            //message1 ,
            //message2 = t2,
            //message3 = t3
        )

    }
}