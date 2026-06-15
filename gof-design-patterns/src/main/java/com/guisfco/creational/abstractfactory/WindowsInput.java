package com.guisfco.creational.abstractfactory;

public record WindowsInput() implements Input {

    @Override
    public void paint() {
        IO.println("Showing Windows input");
    }
}