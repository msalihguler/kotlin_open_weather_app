package com.iamsalih.openweatherapplication.dagger.component

import com.iamsalih.openweatherapplication.App
import com.iamsalih.openweatherapplication.dagger.module.AppModule
import dagger.Component
import javax.inject.Singleton

/**
 * Created by muhammedsalihguler on 28.07.17.
 */
@Singleton
@Component(modules = arrayOf(AppModule::class))
interface AppComponent {
    fun inject(app : App)
}