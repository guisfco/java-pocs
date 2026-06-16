package com.guisfco.structural.facade;

public record StreamingPlayer() {

    public void turnOn() {
        IO.println("Streaming player turned on");
    }

    public void play(String movie) {
        IO.println("Playing " + movie);
    }
}