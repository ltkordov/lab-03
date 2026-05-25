package com.example.listycity3

class CityRepository {
    private val _cities = listOf(
        City("Edmonton", "AB"),
        City("Vancouver", "BC"),
        City("Toronto", "ON")
    )

    val cities: List<City>
        get() = _cities
}