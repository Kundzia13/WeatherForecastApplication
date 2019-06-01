package com.example.weatherforecast.api;

import com.example.weatherforecast.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {

    @Autowired // automatyczne wiązanie, szuka klasy która implementuje WeatherService
    private WeatherService weatherService;

    @GetMapping("/weather")
    public String getWeather(@RequestParam String city, ModelMap map) {
        map.put("weather", weatherService.getWeather(city));
        return "result";
    }
}
