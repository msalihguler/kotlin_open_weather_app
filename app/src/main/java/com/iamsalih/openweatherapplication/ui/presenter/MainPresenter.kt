package com.iamsalih.openweatherapplication.ui.presenter

import com.iamsalih.openweatherapplication.BuildConfig
import com.iamsalih.openweatherapplication.ErrorTypes
import com.iamsalih.openweatherapplication.R
import com.iamsalih.openweatherapplication.api.OpenWeatherAPI
import com.iamsalih.openweatherapplication.data.ForecastDetail
import com.iamsalih.openweatherapplication.data.WeatherResponse
import com.iamsalih.openweatherapplication.ui.ForecastItemViewModel
import com.iamsalih.openweatherapplication.ui.view.MainView
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

/**
 * Created by muhammedsalihguler on 28.07.17.
 */
class MainPresenter(val view : MainView) {
    @Inject
    lateinit var api : OpenWeatherAPI

    fun getForecastForSevenDays(cityName : String) {
        if (BuildConfig.OPEN_WEATHER_API_KEY == "<OPEN_WEATHER_API_KEY_HERE>") {
            view.showErrorToast(ErrorTypes.MISSING_API_KEY)
            return
        }
        view.showSpinner()
        api.dailyForecast(cityName , 7).enqueue(object : Callback<WeatherResponse> {

            override fun onResponse(call: Call<WeatherResponse>, response: Response<WeatherResponse>) {
                response.body()?.let {
                    createListForView(it)
                    view.hideSpinner()
                } ?: view.showErrorToast(ErrorTypes.NO_RESULT_FOUND)
            }

            override fun onFailure(call: Call<WeatherResponse>?, t: Throwable) {
                view.showErrorToast(ErrorTypes.CALL_ERROR)
                t.printStackTrace()
            }
        })
    }

    private fun  createListForView(weatherResponse: WeatherResponse) {
        val forecasts = mutableListOf<ForecastItemViewModel>()
        for (forecastDetail : ForecastDetail in weatherResponse.forecast) {
                val dayTemp = forecastDetail.temperature.dayTemperature
                val forecastItem = ForecastItemViewModel(degreeDay = dayTemp.toString(),
                        date = forecastDetail.date,
                        icon = forecastDetail.description[0].icon,
                        description = forecastDetail.description[0].description)
            forecasts.add(forecastItem)
        }
        view.updateForecast(forecasts)
    }
}