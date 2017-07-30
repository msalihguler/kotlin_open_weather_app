package com.iamsalih.openweatherapplication.dagger.module

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides


@Module
class GSONModule {
    @Provides
    fun provideGson(): Gson {
        return GsonBuilder().create()
    }
}