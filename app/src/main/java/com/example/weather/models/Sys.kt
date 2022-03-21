package com.example.weather.models

import java.io.Serializable

data class Sys(
    val id: Int,
    val type: Int,
    val country: String,
    val sunrise: Int,
    val sunset: Int,
) : Serializable