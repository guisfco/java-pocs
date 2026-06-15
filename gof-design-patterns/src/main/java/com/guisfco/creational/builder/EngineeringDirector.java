package com.guisfco.creational.builder;

public class EngineeringDirector {

    public void buildSimpleHouse(HouseBuilder builder) {
        builder.setWalls(4);
        builder.setWindows(2);
        builder.setDoors(1);
        builder.buildSwimmingPool(false);
        builder.buildGarage(false);
    }

    public void buildMansion(HouseBuilder builder) {
        builder.setWalls(20);
        builder.setWindows(10);
        builder.setDoors(8);
        builder.buildSwimmingPool(true);
        builder.buildGarage(true);
    }
}
