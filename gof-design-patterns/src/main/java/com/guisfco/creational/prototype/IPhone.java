package com.guisfco.creational.prototype;

public class IPhone extends SmartphonePrototype {

    public boolean notch;

    public IPhone(double size, int cores, int ram, boolean notch) {
        super(size, cores, ram);
        this.notch = notch;
    }

    private IPhone(IPhone smartphone) {
        super(smartphone);
        this.notch = smartphone.notch;
    }

    @Override
    public SmartphonePrototype clone() {
        return new IPhone(this);
    }

    @Override
    public String toString() {
        return "IPhone{" +
                "notch=" + notch +
                ", size=" + size +
                ", cores=" + cores +
                ", ram=" + ram +
                '}';
    }
}
