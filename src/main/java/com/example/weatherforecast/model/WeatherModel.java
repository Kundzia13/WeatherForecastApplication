package com.example.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data //dodaje getery i setery i jeden pusty konstruktor
@JsonIgnoreProperties(ignoreUnknown = true)
public class WeatherModel {

    @JsonProperty("base")
    private String base; // możliwość zmiany nazwy w porównaniu do danych z api

    @JsonProperty("main")
    private TemperatureModel temperatureModel
            = new TemperatureModel();
}
