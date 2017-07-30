package com.iamsalih.openweatherapplication.api

import com.iamsalih.openweatherapplication.BuildConfig
import okhttp3.HttpUrl
import okhttp3.Interceptor
import okhttp3.Response

/**
 * Created by muhammedsalihguler on 27.07.17.
 */
class OpenWeatherInterceptor : Interceptor{
    override fun intercept(chain: Interceptor.Chain): Response {
        val url: HttpUrl = chain.request().url().newBuilder().addQueryParameter("APPID", BuildConfig.OPEN_WEATHER_API_KEY).
                addQueryParameter("mode", "json").
                addQueryParameter("units", "metric").build()
        return chain.proceed(chain.request().newBuilder().addHeader("Accept", "application/json").url(url).build())
    }

}