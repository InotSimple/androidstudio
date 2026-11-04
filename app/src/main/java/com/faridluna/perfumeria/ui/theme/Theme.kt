package com.faridluna.perfumeria.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.ui.platform.LocalContext



private val LightColorScheme = lightColorScheme(
    primary = AppPrimary,
    onPrimary = AppSurface,

    primaryContainer = AppBackground,
    onPrimaryContainer = AppForeground,

    secondary = AppSecondary,
    onSecondary = AppSurface,

    secondaryContainer = AppBackground,
    onSecondaryContainer = AppForeground,

    tertiary = AppAccent,
    onTertiary = AppForeground,

    background = AppBackground,
    onBackground = AppForeground,

    surface = AppSurface,
    onSurface = AppForeground,

    surfaceVariant = AppBackground,
    onSurfaceVariant = AppForeground,

    outline = AppSecondary,

    surfaceTint = AppPrimary
)

private val DarkColorScheme = darkColorScheme(
    primary = AppPrimary,
    onPrimary = AppSurface,

    primaryContainer = AppBackground,
    onPrimaryContainer = AppForeground,

    secondary = AppSecondary,
    onSecondary = AppSurface,

    secondaryContainer = AppSecondary,
    onSecondaryContainer = AppSurface,

    tertiary = AppAccent,
    onTertiary = AppForeground,

    background = AppForeground,
    onBackground = AppSurface,

    surface = AppSurfaceDark,
    onSurface = AppSurface,

    surfaceVariant = AppSecondary,
    onSurfaceVariant = AppSurface,

    outline = AppBackground,

    surfaceTint = AppPrimary
)

@Composable
fun PerfumeriaTheme(
    darkTheme: Boolean = true, // modo oscuro como principal
    dynamicColor: Boolean = false,
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

object AppTheme {
    val spacing: AppSpacing
        @Composable
        @ReadOnlyComposable
        get() = LocalAppSpacing.current

    val sizes: AppComponentSizes
        @Composable
        @ReadOnlyComposable
        get() = LocalAppComponentSizes.current
}