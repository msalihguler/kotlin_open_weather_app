package com.iamsalih.openweatherapplication.data

import com.google.gson.annotations.SerializedName

/**
 * Created by muhammedsalihguler on 27.07.17.
 */
data class ForecastDetail(@SerializedName("dt") val  date: Long,
                          @SerializedName("temp") val temperature : Temperature,
                          @SerializedName("weather") val description : List<WeatherDescription>,
                          @SerializedName("pressure") val pressure : Double,
                          @SerializedName("humidity") val humidity :Double)