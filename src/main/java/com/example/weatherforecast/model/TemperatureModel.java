package com.example.weatherforecast.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TemperatureModel {

    @JsonProperty ("temp")
   private Double temperature; // jak jest pusty da nam null, a mały double 0.0

    private Integer pressure;

    public Double getTemperatureInCelsius() {
        return temperature-273.15;
    }
    public String getTemperatureDescription(){
        return String.format("%.2f", getTemperatureInCelsius());
    }
}
