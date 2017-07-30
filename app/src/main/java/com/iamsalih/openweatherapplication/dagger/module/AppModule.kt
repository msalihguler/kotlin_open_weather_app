package com.iamsalih.openweatherapplication.dagger.module

import android.content.Context
import com.iamsalih.openweatherapplication.App
import dagger.Module
import dagger.Provides

/**
 * Created by muhammedsalihguler on 28.07.17.
 */
@Module(includes = arrayOf(OpenWeatherAPIModule::class))
class AppModule(private val app : App) {
    @Provides
    fun provideApplicationContext() : Context = app
}