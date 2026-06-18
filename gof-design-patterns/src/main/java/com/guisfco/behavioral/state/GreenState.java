package com.guisfco.behavioral.state;

public record GreenState() implements TrafficLightState {

    @Override
    public void next(TrafficLight trafficLight) {
        trafficLight.setState(new YellowState());
    }

    @Override
    public String color() {
        return "\uD83D\uDFE9";
    }
}
