package com.guisfco.structural.bridge;

public class Radio implements Device {

    private boolean on;
    private int volume;

    @Override
    public String toString() {
        return "Radio{" +
                "on=" + on +
                ", volume=" + volume +
                '}';
    }

    @Override
    public void turnOn() {
        this.on = true;
        IO.println("Radio ON");
    }

    @Override
    public void turnOff() {
        this.on = false;
        IO.println("Radio OFF");
    }

    @Override
    public void volumeUp() {
        this.volume = Math.min(++this.volume, 100);
        IO.println("Radio Volume " + this.volume);
    }

    @Override
    public void volumeDown() {
        this.volume = Math.max(--this.volume, 0);
        IO.println("Radio Volume " + this.volume);
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
