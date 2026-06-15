package com.guisfco.creational.factorymethod;

public record Car() implements Vehicle {

    @Override
    public void drive() {
        IO.println("Driving car...");
    }
}
