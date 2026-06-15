package com.guisfco.creational.abstractfactory;

public record MacOSInput() implements Input {

    @Override
    public void paint() {
        IO.println("Showing MacOS input");
    }
}