package com.iamsalih.openweatherapplication.dagger.component

import com.iamsalih.openweatherapplication.dagger.module.OpenWeatherAPIModule
import com.iamsalih.openweatherapplication.ui.presenter.MainPresenter
import dagger.Component
import javax.inject.Singleton

/**
 * Created by muhammedsalihguler on 28.07.17.
 */
@Singleton
@Component(modules = arrayOf(OpenWeatherAPIModule::class))
interface OpenWeatherAPIComponent {
    fun inject(presenter: MainPresenter);
}