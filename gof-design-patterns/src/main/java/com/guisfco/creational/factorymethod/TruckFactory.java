package com.guisfco.creational.factorymethod;

public class TruckFactory extends VehicleFactory {

    @Override
    Vehicle createVehicle() {
        return new Truck();
    }
}
