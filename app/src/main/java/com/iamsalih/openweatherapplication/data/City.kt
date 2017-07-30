package com.iamsalih.openweatherapplication.data

import com.google.gson.annotations.SerializedName

/**
 * Created by muhammedsalihguler on 27.07.17.
 */
data class City(@SerializedName("name") val cityName : String, @SerializedName("country") val country : String)