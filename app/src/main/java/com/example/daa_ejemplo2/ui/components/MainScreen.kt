package com.example.daa_ejemplo2.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
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
import com.example.daa_ejemplo2.R

@Composable
fun MainScreen(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
    ) {
        Image(
            painter = painterResource(id = R.drawable._00362973_504302678366215_683522389509591101_n),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .height(150.dp)
                .padding(bottom = 16.dp)
        )
        Column(
            modifier = Modifier
                .padding(8.dp)
        ) {
            Text(
                text = stringResource(R.string.titulo),
                fontSize = 24.sp,
                modifier = Modifier
                    .padding(bottom = 24.dp)
            )
            Text(
                text = stringResource(R.string.texto1),
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .padding(24.dp)
            )
            Text(
                text = stringResource(R.string.texto2),
                textAlign = TextAlign.Justify,
                modifier = Modifier
                    .padding(8.dp)
            )
        }

    }
}

@Preview(showBackground = true)
@Composable
private fun MainScreenPreview() {
    MainScreen()
}