package com.guisfco.creational.builder;

public interface HouseBuilder {

    void setWalls(int walls);
    void setDoors(int doors);
    void setWindows(int windows);
    void buildGarage(boolean hasGarage);
    void buildSwimmingPool(boolean hasSwimmingPool);
    House build();
}
