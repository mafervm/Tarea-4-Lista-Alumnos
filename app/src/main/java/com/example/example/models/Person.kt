package com.example.example.models

import androidx.annotation.DrawableRes

data class Person(
    @DrawableRes val img: Int,
    val id: Int,
    val nombre: String,
    val correo: String,
    val semestre: Int,
    val carrera: String,
    val becado: Boolean,
    val promedio: Int,
    val boletos: Int
)
