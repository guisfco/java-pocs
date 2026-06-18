package com.guisfco.creational.factorymethod;

public class CarFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Car();
    }
}
