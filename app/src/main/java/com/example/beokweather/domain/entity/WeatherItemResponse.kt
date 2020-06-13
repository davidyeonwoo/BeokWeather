package com.example.beokweather.domain.entity

import com.squareup.moshi.Json

data class WeatherItemResponse(

    @Json(name = "icon")
    val icon: String? = null,

    @Json(name = "description")
    val description: String? = null,

    @Json(name = "main")
    val main: String? = null,

    @Json(name = "id")
    val id: Int? = null
)