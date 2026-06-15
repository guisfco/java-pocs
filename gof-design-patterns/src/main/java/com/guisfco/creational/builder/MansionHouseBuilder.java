package com.guisfco.creational.builder;

public class MansionHouseBuilder implements HouseBuilder {

    private int walls;
    private int doors;
    private int windows;
    private boolean garage;
    private boolean swimmingPool;

    @Override
    public void setWalls(int walls) {
        this.walls = walls;
    }

    @Override
    public void setDoors(int doors) {
        this.doors = doors;
    }

    @Override
    public void setWindows(int windows) {
        this.windows = windows;
    }

    @Override
    public void buildGarage(boolean hasGarage) {
        this.garage = hasGarage;
    }

    @Override
    public void buildSwimmingPool(boolean hasSwimmingPool) {
        this.swimmingPool = hasSwimmingPool;
    }

    @Override
    public House build() {
        return new House(walls, doors, windows, garage, swimmingPool);
    }
}
