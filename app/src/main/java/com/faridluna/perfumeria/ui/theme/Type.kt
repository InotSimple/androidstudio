package com.faridluna.perfumeria.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.faridluna.perfumeria.R

val playfairDisplayFamily = FontFamily(
    Font(R.font.playfairdisplayregular, FontWeight.Normal),
    Font(R.font.playfairdisplaymedium, FontWeight.Medium),
    Font(R.font.playfairdisplaysemibold, FontWeight.SemiBold),
    Font(R.font.playfairdisplaybold, FontWeight.Bold)
)

val interFamily = FontFamily(
    Font(R.font.interregular, FontWeight.Normal),
    Font(R.font.intermedium, FontWeight.Medium),
    Font(R.font.intersemibold, FontWeight.SemiBold)
)

/*
 * Sistema tipográfico Perfumeria Luna
 *
 * Playfair Display -> Headings y nombres de producto
 * Inter -> Body text, botones y labels
 */

val Typography = Typography(

    // -------------------------------------------------
    // DISPLAY
    // Logo / nombre principal ("Perfumes Luna")
    // -------------------------------------------------

    displayLarge = TextStyle(
        fontFamily = playfairDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 120.sp,
        lineHeight = 56.sp,
        letterSpacing = 2.sp
    ),


    // -------------------------------------------------
    // HEADLINES
    // Títulos de sección ("Timeless Scents, Unforgettable You")
    // -------------------------------------------------

    headlineLarge = TextStyle(
        fontFamily = playfairDisplayFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 28.sp,
        lineHeight = 34.sp,
        letterSpacing = 0.sp
    ),

    headlineMedium = TextStyle(
        fontFamily = playfairDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 24.sp,
        lineHeight = 30.sp,
        letterSpacing = 0.sp
    ),

    headlineSmall = TextStyle(
        fontFamily = playfairDisplayFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 20.sp,
        lineHeight = 26.sp,
        letterSpacing = 0.sp
    ),


    // -------------------------------------------------
    // TITLES
    // Nombres de producto ("Rose Divine")
    // -------------------------------------------------

    titleLarge = TextStyle(
        fontFamily = playfairDisplayFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),

    titleMedium = TextStyle(
        fontFamily = playfairDisplayFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 18.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.sp
    ),

    titleSmall = TextStyle(
        fontFamily = playfairDisplayFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.sp
    ),


    // -------------------------------------------------
    // BODY
    // Descripciones, precios, notas de fragancia
    // -------------------------------------------------

    bodyLarge = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    bodyMedium = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp
    ),

    bodySmall = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.2.sp
    ),


    // -------------------------------------------------
    // LABELS
    // Botones ("Add to Cart"), tags, navegación inferior
    // -------------------------------------------------

    labelLarge = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp
    ),

    labelMedium = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.2.sp
    ),

    labelSmall = TextStyle(
        fontFamily = interFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 11.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp
    )
)