package com.faridluna.perfumeria

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.faridluna.perfumeria.ui.theme.*

class OnboardingActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            PerfumeriaTheme {
                OnboardingScreen(
                    onHomeClick = {
                        startActivity(Intent(this@OnboardingActivity, HomeActivity::class.java))
                    }
                )
            }
        }
    }
}

@Composable
fun OnboardingScreen(
    onHomeClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(AppForeground)
            .padding(top = AppTheme.spacing.massive)
    ) {
        Column(
            modifier = Modifier.fillMaxSize()
        ) {


            Image(
                painter = painterResource(id = R.drawable.perfume),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(280.dp)
                    .padding(horizontal = AppTheme.spacing.large),
                contentScale = ContentScale.Fit
            )

            Spacer(modifier = Modifier.height(AppTheme.spacing.large))


            Text(
                stringResource(R.string.onboarding_title),
                color = AppSurface,
                style = MaterialTheme.typography.headlineMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = AppTheme.spacing.large)
            )

            Spacer(modifier = Modifier.height(AppTheme.spacing.small))

            Text(
                stringResource(R.string.onboarding_description),
               color = TextSecondary,
                style = MaterialTheme.typography.bodyMedium,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = AppTheme.spacing.large)
            )

            Spacer(Modifier.padding(top = AppTheme.spacing.massive))

            Button(
                onClick = onHomeClick,
                shape = RoundedCornerShape(AppTheme.sizes.radiusRegular),
                colors = ButtonDefaults.buttonColors(
                    containerColor = AppPrimary,
                    contentColor = AppSurface
                ),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(horizontal = AppTheme.spacing.large)
                    .height(AppTheme.spacing.huge)
            ) {
                Text(
                    text = "Siguiente   →",
                    style = MaterialTheme.typography.labelLarge
                )
            }

            Spacer(modifier = Modifier.height(AppTheme.spacing.large))

            Text(
                text = "●  ○  ○",
                color = AppPrimary,
                style = MaterialTheme.typography.bodySmall,
                textAlign = TextAlign.Center,
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(AppTheme.spacing.regular))
        }
    }
}