package com.guisfco.creational.abstractfactory;

public class MacOSFactory implements OSFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Input createInput() {
        return new MacOSInput();
    }
}
