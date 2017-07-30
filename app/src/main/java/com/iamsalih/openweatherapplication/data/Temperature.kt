package com.iamsalih.openweatherapplication.data

import com.google.gson.annotations.SerializedName

/**
 * Created by muhammedsalihguler on 27.07.17.
 */
data class Temperature (@SerializedName("day") val dayTemperature: Double,
                        @SerializedName("night") val nightTemperature: Double)