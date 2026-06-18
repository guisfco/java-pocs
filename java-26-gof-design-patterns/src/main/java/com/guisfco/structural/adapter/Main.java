package com.guisfco.structural.adapter;

public class Main {

    static void main() {
        var temperatureAdapter = new TemperatureAdapter(new LegacyTemperatureSensor());
        var temperatureInCelsius = temperatureAdapter.getTemperatureInCelsius();
        IO.println(temperatureInCelsius);
    }
}
