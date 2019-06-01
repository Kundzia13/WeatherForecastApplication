package com.example.weatherforecast.service;

import com.example.weatherforecast.model.WeatherModel;

public interface WeatherService {
    WeatherModel getWeather(String city);
}
