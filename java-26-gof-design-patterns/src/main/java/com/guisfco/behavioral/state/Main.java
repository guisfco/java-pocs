package com.guisfco.behavioral.state;

public class Main {

    static void main() {
        var trafficLight = new TrafficLight();
        trafficLight.printState();

        trafficLight.next();
        trafficLight.printState();

        trafficLight.next();
        trafficLight.printState();

        trafficLight.next();
        trafficLight.printState();
    }
}
