package com.guisfco.structural.bridge;

public class Television implements Device {

    private boolean on;
    private int volume;

    @Override
    public String toString() {
        return "Television{" +
                "on=" + on +
                ", volume=" + volume +
                '}';
    }

    @Override
    public void turnOn() {
        this.on = true;
        IO.println("TV ON");
    }

    @Override
    public void turnOff() {
        this.on = false;
        IO.println("TV OFF");
    }

    @Override
    public void volumeUp() {
        this.volume = Math.min(++this.volume, 100);
        IO.println("TV Volume " + this.volume);
    }

    @Override
    public void volumeDown() {
        this.volume = Math.max(--this.volume, 0);
        IO.println("TV Volume " + this.volume);
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
