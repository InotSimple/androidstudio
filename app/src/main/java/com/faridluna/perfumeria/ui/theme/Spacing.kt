package com.faridluna.perfumeria.ui.theme

import androidx.compose.material3.DatePickerState
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

data class AppSpacing(

    // Espaciado general
    val none: Dp = 0.dp,
    val extraSmall: Dp = 4.dp,
    val small: Dp = 8.dp,
    val medium: Dp = 12.dp,
    val regular: Dp = 16.dp,
    val large: Dp = 24.dp,
    val extraLarge: Dp = 32.dp,
    val huge: Dp = 48.dp,
    val massive: Dp = 150.dp
)

data class AppComponentSizes(

    // Logos
    val logoSizeLarge: Dp = 150.dp,
    val logoSizeMedium: Dp = 100.dp,

    // Iconos — Sección
    val iconTiny: Dp = 10.dp,
    val iconSmall: Dp = 16.dp,
    val iconRegular: Dp = 20.dp,
    val iconMedium: Dp = 24.dp,
    val iconLarge: Dp = 26.dp,

    // Contenedores de iconos
    val iconContainerMedium: Dp = 48.dp,
    val iconContainerLarge: Dp = 64.dp,

    // Radius System —
    val radiusExtraSmall: Dp = 4.dp,   // chips, tags pequeños
    val radiusSmall: Dp = 8.dp,        // botones secundarios
    val radiusMedium: Dp = 12.dp,      // input fields
    val radiusRegular: Dp = 16.dp,     // botones primarios
    val radiusLarge: Dp = 20.dp,       // product cards
    val radiusExtraLarge: Dp = 28.dp,  // banners/hero
    val radiusHuge: Dp = 32.dp,        // panel inferior / bottom sheet

    // Cards — Sección 03. PRODUCT CARD
    val productCardWidth: Dp = 160.dp,
    val productCardHeight: Dp = 220.dp,
    val cardCornerRadius: Dp = 20.dp,   // coincide con radiusLarge
    val cardElevation: Dp = 4.dp,

    // Shadows —
    val shadowSmOffsetY: Dp = 2.dp,
    val shadowSmBlur: Dp = 4.dp,

    val shadowMdOffsetY: Dp = 8.dp,
    val shadowMdBlur: Dp = 16.dp,

    val shadowLgOffsetY: Dp = 16.dp,
    val shadowLgBlur: Dp = 32.dp,

    val shadowXlOffsetY: Dp = 24.dp,
    val shadowXlBlur: Dp = 48.dp,

    // Hero / banner
    val heroBannerHeight: Dp = 320.dp,
    val heroCornerRadius: Dp = 28.dp,   // coincide con radiusExtraLarge

    // Panel inferior
    val panelCornerRadius: Dp = 32.dp,  // coincide con radiusHuge

    // Indicadores (dots de carrusel, ej. Home banner)
    val indicatorWidth: Dp = 36.dp,
    val indicatorHeight: Dp = 4.dp,
    val indicatorHeightThin: Dp = 3.5.dp,

    // Línea decorativa
    val quoteLineWidth: Dp = 42.dp,
    val quoteLineHeight: Dp = 1.5.dp,

    // Proporciones
    val heroImageHeightFraction: Float = 0.75f,
    val heroTextWidthFraction: Float = 0.55f,

    // Gradiente hero
    val heroGradientStartX: Float = 0f,
    val heroGradientEndX: Float = 750f
)



val LocalAppSpacing = staticCompositionLocalOf {
    AppSpacing()
}

val LocalAppComponentSizes = staticCompositionLocalOf {
    AppComponentSizes ()
}