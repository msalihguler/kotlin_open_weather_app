package com.iamsalih.openweatherapplication.data

import com.google.gson.annotations.SerializedName

/**
 * Created by muhammedsalihguler on 27.07.17.
 */
data class WeatherResponse (@SerializedName("city") var city : City,
                            @SerializedName("list") var forecast : List<ForecastDetail>)