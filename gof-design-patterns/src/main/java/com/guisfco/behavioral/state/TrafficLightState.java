package com.guisfco.behavioral.state;

public interface TrafficLightState {

    void next(TrafficLight trafficLight);

    String color();
}
