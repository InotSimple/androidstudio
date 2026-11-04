package com.faridluna.perfumeria.ui.theme

import androidx.compose.ui.graphics.Color


// -------------------------------------------------
// COLOR PALETTE (Visual Identity)
// -------------------------------------------------

val DarkWine = Color(0xFF201111)      // Fondo principal / base oscura
val DeepBurgundy = Color(0xFF4A1F23)  // Fondo secundario / cards
val Mauve = Color(0xFF9A4F56)         // Acento medio / bordes
val Coral = Color(0xFFD67B80)         // Acento principal / precios, links
val BlushPink = Color(0xFFF5D9CC)     // Texto claro / highlights suaves
val Gold = Color(0xFFD4AF37)          // Dorado / rating / acentos especiales
val White = Color(0xFFFFFFFF)


// -------------------------------------------------
// GRADIENTS
// -------------------------------------------------

val GradientWine = listOf(Color(0xFF8E2B3D), Color(0xFFC76B6B))
val GradientGold = listOf(Color(0xFFD4AF37), Color(0xFFF7E9B7))
val GradientDeepBurgundy = listOf(Color(0xFF2B0D12), Color(0xFF5A1A24))
val GradientCharcoal = listOf(Color(0xFF1C1716), Color(0xFF382A29))


// -------------------------------------------------
// SEMANTIC ROLES
// Uso práctico suelto en pantallas (fuera del ColorScheme)
// -------------------------------------------------

val TextSecondary = Color(0xFFB8A0A3) // Descripciones, texto gris cálido
val Divider = Color(0xFF3A2226)       // Líneas separadoras
val Success = Color(0xFF6FA97C)       // Confirmaciones (Order Placed)
val Star = Gold                        // Rating de estrellas (dorado)


// -------------------------------------------------
// ALIASES usados por AthenaTheme (Light/DarkColorScheme)
// -------------------------------------------------

val AppPrimary = Coral          // botones, acentos principales
val AppSecondary = Mauve        // bordes, íconos secundarios
val AppAccent = Gold            // detalles dorados, CTAs especiales
val AppBackground = BlushPink   // fondo en modo claro
val AppForeground = DarkWine    // fondo en modo oscuro / texto principal
val AppSurface = White          // superficies/tarjetas en modo claro

val AppSurfaceDark = DeepBurgundy // 🆕superficies/tarjetas en modo oscuro