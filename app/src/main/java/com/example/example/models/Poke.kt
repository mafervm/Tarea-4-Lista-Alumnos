package com.example.example.models

import androidx.annotation.DrawableRes

data class Poke(
    @DrawableRes val img: Int,
    val nombre: String,
)
