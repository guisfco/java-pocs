package com.guisfco.creational.prototype;

public abstract class SmartphonePrototype {

    public double size;
    public int cores;
    public int ram;

    public SmartphonePrototype(double size, int cores, int ram) {
        this.size = size;
        this.cores = cores;
        this.ram = ram;
    }

    public SmartphonePrototype(SmartphonePrototype prototype) {
        this.size = prototype.size;
        this.cores = prototype.cores;
        this.ram = prototype.ram;
    }

    public abstract SmartphonePrototype clone();

    @Override
    public String toString() {
        return "SmartphonePrototype{" +
                "size=" + size +
                ", cores=" + cores +
                ", ram=" + ram +
                '}';
    }
}
