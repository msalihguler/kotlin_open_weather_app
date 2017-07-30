package com.iamsalih.openweatherapplication.dagger.module

import com.google.gson.Gson
import com.iamsalih.openweatherapplication.api.OpenWeatherAPI
import com.iamsalih.openweatherapplication.api.OpenWeatherInterceptor
import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

/**
 * Created by muhammedsalihguler on 27.07.17.
 */
@Module(includes = arrayOf(GSONModule::class))
class OpenWeatherAPIModule {

    @Provides @Singleton
    fun provideApi(gson : Gson): OpenWeatherAPI {

        val apiClient = OkHttpClient.Builder().addInterceptor(OpenWeatherInterceptor()).build()

        return Retrofit.Builder().apply {
            baseUrl(OpenWeatherAPI.BASE_URL)
            addConverterFactory(GsonConverterFactory.create(gson))
            client(apiClient)
        }.build().create(OpenWeatherAPI::class.java)
    }
}