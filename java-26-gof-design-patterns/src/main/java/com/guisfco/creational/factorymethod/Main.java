package com.guisfco.creational.factorymethod;

public class Main {

    static void main() {
        var truckFactory = new TruckFactory();
        truckFactory.buildVehicle();

        var carFactory = new CarFactory();
        carFactory.buildVehicle();
    }
}
