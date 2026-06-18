package com.guisfco.behavioral.state;

public record RedState() implements TrafficLightState {

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new GreenState());
    }

    @Override
    public String color() {
        return "\uD83D\uDFE5";
    }
}
