package com.example.beokweather.di

import com.example.beokweather.domain.WeatherDataSource
import com.example.beokweather.domain.WeatherRepository
import com.example.beokweather.domain.WeatherService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
class RepositoryModule {

    @Provides
    @ActivityRetainedScoped
    fun provideWeatherRepository(weatherService: WeatherService): WeatherDataSource =
        WeatherRepository(weatherService)
}