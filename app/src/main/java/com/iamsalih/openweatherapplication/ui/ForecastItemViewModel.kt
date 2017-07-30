package com.iamsalih.openweatherapplication.ui

/**
 * Created by muhammedsalihguler on 30.07.17.
 */
data class ForecastItemViewModel(val degreeDay : String,
                                 val icon : String = "01d",
                                 val date : Long = System.currentTimeMillis(),
                                 val description: String = "No description")