package com.iamsalih.openweatherapplication.data

import com.google.gson.annotations.SerializedName

/**
 * Created by muhammedsalihguler on 27.07.17.
 */
data class WeatherDescription(@SerializedName("main") var main : String,
                              @SerializedName("description") var description: String,
                              @SerializedName("icon") var icon: String)