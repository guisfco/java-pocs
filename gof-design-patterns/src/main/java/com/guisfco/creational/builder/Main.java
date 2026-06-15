package com.guisfco.creational.builder;

public class Main {

    static void main() {
        var engineer = new EngineeringDirector();

        var mansionHouseBuilder = new MansionHouseBuilder();
        engineer.buildMansion(mansionHouseBuilder);
        var mansion = mansionHouseBuilder.build();
        IO.println(mansion);

        var simpleHouseBuilder = new SimpleHouseBuilder();
        engineer.buildSimpleHouse(simpleHouseBuilder);
        simpleHouseBuilder.buildGarage(true);
        var simpleHouse = simpleHouseBuilder.build();
        IO.println(simpleHouse);
    }
}
