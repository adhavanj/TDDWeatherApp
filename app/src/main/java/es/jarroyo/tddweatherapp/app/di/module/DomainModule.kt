package es.jarroyo.tddweatherapp.app.di.module

import dagger.Module
import dagger.Provides
import es.jarroyo.tddweatherapp.data.repository.LocationRepository
import es.jarroyo.tddweatherapp.data.repository.WeatherRepository
import es.jarroyo.tddweatherapp.domain.usecase.currentLocation.GetCurrentLocationUseCase
import es.jarroyo.tddweatherapp.domain.usecase.currentWeather.GetCurrentWeatherByNameUseCase
import javax.inject.Singleton


@Module
class DomainModule {

    @Provides
    @Singleton
    fun provideGetCurrentWeatherUseCase(repository: WeatherRepository) = GetCurrentWeatherByNameUseCase(repository)


    @Provides
    @Singleton
    fun provideGetCurrentLocationUseCase(repository: LocationRepository) = GetCurrentLocationUseCase(repository)
}