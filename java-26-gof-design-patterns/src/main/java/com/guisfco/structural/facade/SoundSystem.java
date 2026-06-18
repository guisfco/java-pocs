package com.guisfco.structural.facade;

public record SoundSystem() {

    public void turnOn() {
        IO.println("Sound system turned on");
    }

    public void setVolume(int volume) {
        IO.println("Volume set to " + volume);
    }
}