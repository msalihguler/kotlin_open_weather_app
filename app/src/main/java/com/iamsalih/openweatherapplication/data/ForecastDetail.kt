package com.iamsalih.openweatherapplication.data

import com.google.gson.annotations.SerializedName

/**
 * Created by muhammedsalihguler on 27.07.17.
 */
data class ForecastDetail(@SerializedName("dt") var  date: Long,
                          @SerializedName("temp") var temperature : Temperature,
                          @SerializedName("weather") var description : List<WeatherDescription>,
                          @SerializedName("pressure") var pressure : Double,
                          @SerializedName("humidity") var humidity :Double)