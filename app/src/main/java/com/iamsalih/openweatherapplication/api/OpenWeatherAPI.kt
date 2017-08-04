package com.iamsalih.openweatherapplication.api

import com.iamsalih.openweatherapplication.data.WeatherResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * Created by muhammedsalihguler on 27.07.17.
 */
interface OpenWeatherAPI {

    @GET("forecast/daily")
    fun dailyForecast(@Query("q") cityName : String, @Query("cnt") dayCount : Int) : Call<WeatherResponse>

    companion object {
        val BASE_URL = "http://api.openweathermap.org/data/2.5/"
    }
}