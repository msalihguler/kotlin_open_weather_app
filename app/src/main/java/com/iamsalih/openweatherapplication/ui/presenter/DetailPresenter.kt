package com.iamsalih.openweatherapplication.ui.presenter

import android.content.Intent
import com.iamsalih.openweatherapplication.ui.ForecastItemViewModel
import com.iamsalih.openweatherapplication.ui.view.DetailView

/**
 * Created by muhammedsalihguler on 11.08.17.
 */
class DetailPresenter(val view : DetailView) {

    fun  values(intent: Intent?) {
        intent?.extras?.let {
            var item : ForecastItemViewModel = it["extra"] as ForecastItemViewModel
            view.showInformation(item)
        }
    }

}