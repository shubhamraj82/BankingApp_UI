package com.example.bankingappui.data

import androidx.compose.ui.graphics.Brush

data class card(
    val cardType:String,
    val cardNumber:String,
    val cardName:String,
    val balance: Double,
    val color: Brush
)
