package com.iamsalih.openweatherapplication

import android.app.Application
import com.iamsalih.openweatherapplication.dagger.component.AppComponent
import com.iamsalih.openweatherapplication.dagger.component.DaggerAppComponent
import com.iamsalih.openweatherapplication.dagger.module.AppModule

/**
 * Created by muhammedsalihguler on 28.07.17.
 */
class App : Application() {

    private lateinit var component : AppComponent

    override fun onCreate() {
        super.onCreate()
        component = DaggerAppComponent.builder().appModule(AppModule(this)).build()
    }

    fun component() = component
}