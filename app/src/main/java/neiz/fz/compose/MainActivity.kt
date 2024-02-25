package neiz.fz.compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import neiz.fz.compose.components.First_components
import neiz.fz.compose.components.PlusAndSubstractComponent
import neiz.fz.compose.components.WelcomeScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WelcomeScreen()
        }
    }
}


