package com.example.labaeffective

import android.graphics.Picture
import android.graphics.fonts.Font
import android.graphics.fonts.FontFamily
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.modifierLocalMapOf
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.labaeffective.ui.theme.LabaEffectiveTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(colorResource(R.color.backColor)) // устанавливаем цвет (перед этим
                    // необходимо создать xml файл с
                    // кастомными цветами и дабавить туда цвет)
                    .fillMaxSize()

            ) {
                dotaPrew()
                description()
                video()
//                Box(
//                    modifier = Modifier
//                        .padding(start=24.dp, end=24.dp)
//                ) {
//                    video()
//
//                }
            }
            Column(
                modifier = Modifier.fillMaxHeight(0.45f),
                verticalArrangement = Arrangement.Bottom
            ){
                dotaLogo()
            }
        }
    }
}


/** Картинка вверху экрана **/
@Composable
fun dotaPrew() {
    // box - контейнер для размещения объектов
    Box(
        modifier = Modifier
            .fillMaxHeight(0.35f) // Устанавливаем максимальный размер картинки (в процентах от всего экрана)
            .fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = R.drawable.dota_prew), // Путь к картинке
            contentDescription = "image",
            contentScale = ContentScale.Crop, // Обрезание картинки
            modifier = Modifier.fillMaxSize() // Максимальный размер
            )
    }
}


/** Лого доты **/
@Composable
private fun dotaLogo() {
    // Card - также контейнер для размещения объектов, но в нем меньше возможностей и больше строгой разметки
    Card(
        modifier = Modifier
            .size(width = 132.dp, height = 139.dp)
            .padding(22.dp)
    ){
        Box(
            modifier = Modifier
                .background(colorResource(R.color.backColor))
                .size(width = 88.dp, height = 94.5.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.logo_dota3),
                contentDescription = "image",
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
                )
        }
    }
}


@Composable
private fun description() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.Center
    ) {
        Box(
            modifier = Modifier.size(height = 190.dp, width = 327.dp),
            contentAlignment = Alignment.BottomCenter
        ){
            Text(
                text = "Dota 2 is a multiplayer online battle arena (MOBA) game which has two teams of five players compete to collectively destroy a large structure defended by the opposing team known as the \"Ancient\", whilst defending their own.",
                style = TextStyle(
                    fontSize = 12.sp,
                    lineHeight = 19.sp,
    //                fontFamily = FontFamily(Font(R.font.sk-modernist)),
                    fontWeight = FontWeight(400),
                    color = Color(0xB2EEF2FB),

                    )
            )
        }
    }
}

@Composable
private fun video() {
    Row(
        modifier = Modifier.fillMaxWidth().padding(start=24.dp, top=10.dp),
    ) {
        Box(
            modifier = Modifier.size(width = 240.dp, height = 135.dp),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.screen),
                contentDescription = "screen1",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(width=240.dp, height=135.dp).padding(15.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.ellipse),
                contentDescription = "ellipse",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(45.dp)
            )

            Image(
                painter = painterResource(id = R.drawable.arrow),
                contentDescription = "arrow",
                contentScale = ContentScale.FillBounds,
                modifier = Modifier.size(24.dp)
            )
        }

        Column(){
            Image(
                painter = painterResource(id = R.drawable.screen2),
                contentDescription = "screen2",
                contentScale = ContentScale.Crop,
                modifier = Modifier.size(width=240.dp, height=135.dp)
            )
        }

    }
}