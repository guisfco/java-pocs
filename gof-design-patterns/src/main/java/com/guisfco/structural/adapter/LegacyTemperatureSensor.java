package com.guisfco.structural.adapter;

import java.util.concurrent.ThreadLocalRandom;

public class LegacyTemperatureSensor {

    public double getTemperatureInFahrenheit() {
        return ThreadLocalRandom.current().nextDouble(20, 100);
    }
}
