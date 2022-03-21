package com.example.weather.models

import java.io.Serializable

data class Wind(

    val speed: Double,
    val gust: Double,
    val deg: Int,
) : Serializable