package com.guisfco.structural.facade;

public record Television() {

    public void turnOn() {
        IO.println("TV turned on");
    }

    public void setInput(String input) {
        IO.println("TV input set to " + input);
    }
}