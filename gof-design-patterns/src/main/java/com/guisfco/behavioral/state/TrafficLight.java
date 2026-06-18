package com.guisfco.behavioral.state;

import com.guisfco.behavioral.IO;

public class TrafficLight {

    private TrafficLightState state;

    public TrafficLight() {
        this.state = new RedState();
    }

    public void next() {
        state.next(this);
    }

    public void printState() {
        IO.println(state.color());
    }

    public void setState(TrafficLightState state) {
        this.state = state;
    }
}
