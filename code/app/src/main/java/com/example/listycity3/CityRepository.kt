package com.example.listycity3

import androidx.compose.runtime.mutableStateListOf

class CityRepository {
    private val _cities = mutableStateListOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )

    val cities: List<City>
        get() = _cities

    fun addCity(city: City) {
        _cities.add(city)
    }

    fun updateCity(oldCity: City, newCity: City) {
        val indexOfOldCity = _cities.indexOf(oldCity)
        if (indexOfOldCity != -1) {
            _cities[indexOfOldCity] = newCity
        }
    }
}