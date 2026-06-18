package com.guisfco.creational.abstractfactory;

public class OperationalSystem {

    private final Button button;
    private final Input input;

    public OperationalSystem(OSFactory factory) {
        button = factory.createButton();
        input = factory.createInput();
    }

    public void paint() {
        button.paint();
        input.paint();
    }
}
