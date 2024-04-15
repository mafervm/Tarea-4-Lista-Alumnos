package com.example.example.models

import androidx.annotation.DrawableRes

data class Person(
    @DrawableRes val img: Int,
    val trabajo: String,
    val genero: String,
    val edad: Int
)
