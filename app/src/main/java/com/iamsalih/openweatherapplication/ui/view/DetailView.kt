package com.iamsalih.openweatherapplication.ui.view

import com.iamsalih.openweatherapplication.ui.ForecastItemViewModel

/**
 * Created by muhammedsalihguler on 11.08.17.
 */
interface DetailView {
    fun showInformation(forecast : ForecastItemViewModel)
}