package com.example.daa_ejemplo2

import android.annotation.SuppressLint
import android.os.Bundle
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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.daa_ejemplo2.ui.theme.DAAEjemplo2Theme

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            DAAEjemplo2Theme {
                Surface(modifier = Modifier.fillMaxSize()) {
                    Greeting()
                }
            }
        }
    }
}

@Composable
fun Greeting() {
    val textoT = stringResource(id = R.string.ITLTitulo)
    val texto1 = stringResource(id = R.string.ITL1)
    val texto2 = stringResource(id = R.string.ITL2)
    val imagen = painterResource(id = R.drawable.fondotec)

    Column {
        Image(painter = imagen, contentDescription = null, contentScale = ContentScale.Fit)
        Text(
            text = textoT,
            fontSize = 30.sp,
            lineHeight = 35.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(10.dp)
        )
        Text(
            text = texto1,
            fontSize = 17.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(20.dp)

        )
        Text(
            text = texto2,
            fontSize = 17.sp,
            lineHeight = 20.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(20.dp)
        )
    }


}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    DAAEjemplo2Theme {
        Greeting()
    }
}