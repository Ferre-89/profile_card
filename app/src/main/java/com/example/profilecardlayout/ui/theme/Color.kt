package com.example.profilecardlayout.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.compositionLocalOf
import androidx.compose.ui.graphics.Color

data class Colors(
    val Purple80: Color = Color(0xFFD0BCFF),
    val PurpleGrey80: Color = Color(0xFFCCC2DC),
    val Pink80: Color = Color(0xFFEFB8C8),

    val Purple40: Color = Color(0xFF6650a4),
    val PurpleGrey40: Color = Color(0xFF625b71),
    val Pink40: Color = Color(0xFF7D5260),

    val veryLightGray: Color = Color(0x60DCDCDC),
    val lightGreen200: Color = Color(0x9932CD32),
    val teal: Color = Color(0xFF008080),
    val red: Color = Color(0xFFFF5050),
    )

val colorInstance
    get() = Colors()

val LocalColor = compositionLocalOf { Colors() }

val colorsScheme: Colors
    @Composable
    @ReadOnlyComposable
    get() = LocalColor.current