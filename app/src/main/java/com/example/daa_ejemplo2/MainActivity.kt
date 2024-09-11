package com.example.daa_ejemplo2

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.daa_ejemplo2.ui.theme.DAAEjemplo2Theme
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DAAEjemplo2Theme {
               Surface (
//                   modifier = Modifier.fillMaxSize(),
//                   color = MaterialTheme.colorScheme.background
               ){
                   GreetingT()
               }

                }
            }
        }

}

@Composable
fun GreetingT(){

    val titulo = stringResource(id = R.string.Titulo)
    val texto1 = stringResource(id = R.string.txt1)
    val texto2 = stringResource(id = R.string.txt2)

    val img = painterResource(id = R.drawable.tec)
Column (
    modifier = Modifier
        .background(color = Color.Transparent)
){
    Image(painter = img,
        contentDescription = null,
        contentScale = ContentScale.Fit,
        //modifier = Modifier.fillMaxSize()
    )

    Text(text = titulo,
        fontSize = 25.sp,
        color = Color.Black,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(30.dp)
    )

    Text(
        text = texto1,
        fontSize = 14.sp,
        color = Color.Black,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(16.dp)

    )
    Text(
        text = texto2,
        fontSize = 14.sp,
        color = Color.Black,
        fontStyle = FontStyle.Italic,
        textAlign = TextAlign.Center,
        modifier = Modifier
            .padding(16.dp)
    )
}



}


@Composable
fun GreetingImg(modifier: Modifier = Modifier) {
  val img = painterResource(id = R.drawable.tec)
Column(
    modifier = modifier
        .fillMaxWidth()
        .height(150.dp)
        //.align(Alignment.TopStart)
){
    Image(painter = img,
        contentDescription = null,
        contentScale = ContentScale.Crop,
        modifier = Modifier.fillMaxSize()
    )
}
    }

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        GreetingT()

        }
}