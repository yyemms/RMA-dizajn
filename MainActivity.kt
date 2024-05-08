package hr.ferit.photographychallenge

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.gms.wallet.button.ButtonConstants
import hr.ferit.photographychallenge.ui.theme.PhotographyChallengeTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PhotographyChallengeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color= Color(0xFFF7DA6F)
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.logo),
            contentDescription = "Logo",
            modifier = Modifier.size(300.dp)
        )

        Text(
            text = "\n\tPhotography \n\n \tChallenge\n  ",
            fontSize = 40.sp ,
            modifier = Modifier
                .border(width = 15.dp, color = Color(0xFFF0B513))
                .padding(8.dp),
            textAlign = TextAlign.Center,

        )
        Spacer(modifier = Modifier.height(3.dp))

        Text(
            text = "Looking for inspiration to ignite\nyour passion for photography?\nLook no further!",
            fontSize = 20.sp ,
            modifier = Modifier
                .padding(8.dp),
            textAlign = TextAlign.Center,

            )
        Button(
            onClick = { },
            modifier = Modifier
                .padding(8.dp)
                .height(48.dp)
                .width(200.dp),
            colors = ButtonDefaults.run { val buttonColors =
                buttonColors(Color.Black)
                buttonColors
            },
        ) {
            Text(
                text = "Login/Register",
                fontSize = 20.sp,
                color = Color.White,
            )
        }
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    PhotographyChallengeTheme {
        Greeting("Android")
    }
}
