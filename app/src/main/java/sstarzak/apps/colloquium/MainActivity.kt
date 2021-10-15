package sstarzak.apps.colloquium

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import sstarzak.apps.colloquium.ui.theme.ColloquiumTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ColloquiumTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    Greeting("Android")
                    EntryList()
                }
            }
        }
    }
}

@Composable
fun EntryList() {
        Column {
            listOf(
                "Item 1",
                "Item 2",
                "Item 3",
                "Item 4",
            ).forEach {
                Greeting(name = it)
            }
        }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    ColloquiumTheme {
        Greeting("Android")
    }
}