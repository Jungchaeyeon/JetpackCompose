package com.example.helloworld

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.helloworld.ui.theme.HelloworldTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HelloworldTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting("Cha????yeon")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    //스텝1: 색상지정을 위해 Color.Red 전달
//    Text(
//        text = "Step 1 - $name",
//        color = Color.Red,
//    )

    //스텝2: 색상지정을 위해 해시 값으로 색상 전달
//    Text(
//        text = "Step 2 - $name",
//        color = Color(0xffff9944)
//    )

    //스텝3: fontSize 파라미터에 30.sp 전달
//    Text(
//        text = "Step 3 - $name",
//        fontSize = 30.sp,
//        color = Color.Red
//    )

    //스텝4: fontWeight 파라미터에 30.sp 전달
//    Text(
//        text = "Step 4 - $name",
//        fontSize = 30.sp,
//        fontWeight = FontWeight.Bold,
//        color = Color.Red
//    )

    //스텝4: FontFamily.Cursive 전달
//    Text(
//        text = "Step 5 - $name",
//        fontSize = 30.sp,
//        fontFamily = FontFamily.Cursive,
//        fontWeight = FontWeight.Bold,
//        color = Color.Red
//    )

    //스텝5: letterSpacing에 2.sp 전달
//    Text(
//        text = "Step 5 - $name",
//        fontSize = 30.sp,
//        fontFamily = FontFamily.Cursive,
//        fontWeight = FontWeight.Bold,
//        letterSpacing = 2.sp,
//        color = Color.Red
//    )

    //스텝6: maxLine에 2로전달하고 3줄의 문자열 지정했을 떄
//    Text(
//        text = "Step 5 - $name\nStep 5 - $name\nStep 5 - $name",
//        fontSize = 30.sp,
//        fontFamily = FontFamily.Cursive,
//        fontWeight = FontWeight.Bold,
//        letterSpacing = 2.sp,
//        maxLines = 2,
//        color = Color.Red
//    )

    //스텝7: underline 지정
//    Text(
//        text = "Step 5 - $name\nStep 5 - $name\nStep 5 - $name",
//        fontSize = 30.sp,
//        fontFamily = FontFamily.Cursive,
//        fontWeight = FontWeight.Bold,
//        letterSpacing = 2.sp,
//        maxLines = 2,
//        color = Color.Red,
//        textDecoration = TextDecoration.Underline
//    )

    //스텝8: textalign 지정
//    Text(
//        text = "Step 5 - $name\nStep 5 - $name\nStep 5 - $name",
//        fontSize = 30.sp,
//        fontFamily = FontFamily.Cursive,
//        fontWeight = FontWeight.Bold,
//        letterSpacing = 2.sp,
//        maxLines = 2,
//        color = Color.Red,
//        textDecoration = TextDecoration.Underline,
//        textAlign = TextAlign.Center
//    )

    //스텝8: textalign 지정
    Text(
        text = "Step 5 - $name\nStep 5 - $name",
        modifier = Modifier.size(width = 400.dp, height = 100.dp),
        fontSize = 30.sp,
        fontFamily = FontFamily.Cursive,
        fontWeight = FontWeight.Bold,
        letterSpacing = 2.sp,
        maxLines = 2,
        color = Color.Red,
        textDecoration = TextDecoration.Underline,
        textAlign = TextAlign.Start,
        lineHeight = 30.sp
    )

}

@Preview(showBackground = true, device = "spec:width=673dp,height=841dp")
@Composable
fun GreetingPreview() {
    HelloworldTheme {
        Greeting("chaeyeon")
    }
}