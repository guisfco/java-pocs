package com.guisfco.creational.factorymethod;

public abstract class VehicleFactory {

    abstract Vehicle createVehicle();

    public void buildVehicle() {
        var vehicle = createVehicle();
        vehicle.drive();
    }
}
