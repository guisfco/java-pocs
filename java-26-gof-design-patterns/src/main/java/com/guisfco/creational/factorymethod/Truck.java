package com.guisfco.creational.factorymethod;

public record Truck() implements Vehicle {

    @Override
    public void drive() {
        IO.println("Driving truck...");
    }
}
