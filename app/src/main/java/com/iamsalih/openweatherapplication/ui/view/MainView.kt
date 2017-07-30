package com.iamsalih.openweatherapplication.ui.view

import com.iamsalih.openweatherapplication.ErrorTypes
import com.iamsalih.openweatherapplication.data.WeatherResponse
import com.iamsalih.openweatherapplication.ui.ForecastItemViewModel

/**
 * Created by muhammedsalihguler on 28.07.17.
 */
interface MainView {
    fun showSpinner()
    fun hideSpinner()
    fun updateForecast(forecasts: List<ForecastItemViewModel>)
    fun showErrorToast(errorType: ErrorTypes)
}