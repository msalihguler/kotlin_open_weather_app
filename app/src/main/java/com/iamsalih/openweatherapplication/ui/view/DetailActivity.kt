package com.iamsalih.openweatherapplication.ui.view

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.iamsalih.openweatherapplication.R
import com.iamsalih.openweatherapplication.ui.ForecastItemViewModel
import com.iamsalih.openweatherapplication.ui.presenter.DetailPresenter
import kotlinx.android.synthetic.main.details_view.*
import java.text.SimpleDateFormat
import java.util.*

/**
 * Created by muhammedsalihguler on 11.08.17.
 */
class DetailActivity : AppCompatActivity(), DetailView {

    val presenter = DetailPresenter(this)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.details_view)
        presenter.values(intent)
    }

    override fun showInformation(forecast : ForecastItemViewModel) {
        detailCityName.text = forecast.cityName
        detailDegreeText.text = "${forecast.degreeDay} °C"
        detailMaximumDegreeText.text = "Maximum Degree: ${forecast.maximumDegree} °C"
        detailMinimumDegreeText.text = "Minimum Degree: ${forecast.minimumDegree} °C"
        detailPressureText.text = "${forecast.pressure} hPa"
        detailsHumidityText.text = "% ${forecast.humidity}"
        detailsDateText.text = getDate(forecast.date)
    }

    private fun  getDate(date: Long): String {
        val timeFormatter = SimpleDateFormat("dd.MM.yyyy")
        return timeFormatter.format(Date(date*1000L))
    }
}