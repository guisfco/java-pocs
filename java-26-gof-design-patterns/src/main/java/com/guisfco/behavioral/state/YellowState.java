package com.guisfco.behavioral.state;

public record YellowState() implements TrafficLightState {

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new RedState());
    }

    @Override
    public String color() {
        return "\uD83D\uDFE8";
    }
}
