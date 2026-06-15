package com.guisfco.creational.prototype;

public class Samsung extends SmartphonePrototype {

    public boolean pen;

    public Samsung(double size, int cores, int ram, boolean pen) {
        super(size, cores, ram);
        this.pen = pen;
    }

    public Samsung(Samsung smartphone) {
        super(smartphone);
        this.pen = smartphone.pen;
    }

    @Override
    public SmartphonePrototype clone() {
        return new Samsung(this);
    }

    @Override
    public String toString() {
        return "Samsung{" +
                "pen=" + pen +
                ", size=" + size +
                ", cores=" + cores +
                ", ram=" + ram +
                '}';
    }
}
