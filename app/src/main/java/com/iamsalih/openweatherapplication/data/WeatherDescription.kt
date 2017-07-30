package com.iamsalih.openweatherapplication.data

import com.google.gson.annotations.SerializedName

/**
 * Created by muhammedsalihguler on 27.07.17.
 */
data class WeatherDescription(@SerializedName("main") val main : String,
                              @SerializedName("description") val description: String,
                              @SerializedName("icon") val icon: String)