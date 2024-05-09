import android.os.Bundle
import android.widget.TextView
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.textview.R
import com.example.textview.ui.theme.TextviewTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TextviewTheme {
                Surface {
                    Greeting()
                }
            }
        }
    }
}
val imageModifier = Modifier
    .size(256.dp)
    .border(BorderStroke(1.dp, Color.White))
    .background(Color.Transparent)
@Composable
fun Greeting() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "세영이의 MBTI는", fontSize = 12.sp, color = Color.Black )

        Image(painter = painterResource(id = R.drawable.entp),
            contentDescription = null,
            contentScale = ContentScale.Fit,
            modifier = imageModifier)
    }
}
@Preview(showBackground = true, widthDp = 200, heightDp = 200)
@Composable
fun GreetingPreview() {
    TextviewTheme {
        Greeting()
    }
}
