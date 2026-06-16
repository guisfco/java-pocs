package com.guisfco.structural.adapter;

public class TemperatureAdapter implements TemperatureSensor {

    private final LegacyTemperatureSensor legacyTemperatureSensor;

    public TemperatureAdapter(LegacyTemperatureSensor legacyTemperatureSensor) {
        this.legacyTemperatureSensor = legacyTemperatureSensor;
    }

    @Override
    public double getTemperatureInCelsius() {
        var fahrenheit = legacyTemperatureSensor.getTemperatureInFahrenheit();
        return (fahrenheit - 32) * 5 / 9;
    }
}
