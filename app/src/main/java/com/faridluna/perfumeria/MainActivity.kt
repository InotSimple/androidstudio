package com.faridluna.perfumeria

import android.content.Intent
import com.faridluna.perfumeria.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.faridluna.perfumeria.ui.theme.AppForeground
import com.faridluna.perfumeria.ui.theme.AppTheme
import com.faridluna.perfumeria.ui.theme.BlushPink
import com.faridluna.perfumeria.ui.theme.Coral
import com.faridluna.perfumeria.ui.theme.GradientDeepBurgundy
import com.faridluna.perfumeria.ui.theme.Mauve
import com.faridluna.perfumeria.ui.theme.PerfumeriaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PerfumeriaTheme {

                SplashScreen(
                    onNavegarClick = {
                startActivity(Intent(this@MainActivity, OnboardingActivity::class.java))
                    }
                )

                }

                }
            }
        }



@Composable
fun SplashScreen(
    onNavegarClick: () -> Unit
) {
    Box(
        modifier = Modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.fondoperfume),
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )

        Column(
            modifier = Modifier.fillMaxSize()
                .padding(top = 120.dp),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Icon(
                painter = painterResource(R.drawable.perfume),
                contentDescription = null,
                modifier = Modifier.size(64.dp),
                tint = BlushPink
            )
            Text(
                stringResource(R.string.name_perfumeria),
                style = MaterialTheme.typography.displayLarge,
                color = BlushPink
            )
            Text(
                stringResource(R.string.description_perfumeria),
                style = MaterialTheme.typography.headlineMedium,
                color = Mauve
            )
            Text(
                stringResource(R.string.slogan_perfumeria),
                style = MaterialTheme.typography.headlineSmall,
                color = Mauve
            )
            Spacer(Modifier.padding(top = AppTheme.spacing.massive))
            Button(
                onClick = onNavegarClick,
                Modifier.padding(top = AppTheme.spacing.massive)
                )
             {
                Text(
                    text = "Ir a otra ventana",
                    color = Color.Black
                )
            }
        }
    }
}