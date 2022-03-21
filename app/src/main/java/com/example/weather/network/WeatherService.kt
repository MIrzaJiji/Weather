package com.example.weather.network


import retrofit.http.GET
import retrofit.http.Query
import com.example.weather.models.WeatherResponse
import retrofit.Call


interface WeatherService {

    @GET("2.5/weather")
    fun getWeather(
        @Query("lat") lat: Double,
        @Query("lon") lon: Double,
        @Query("units") units: String?,
        @Query("appid") appid: String?
    ): Call<WeatherResponse>
}