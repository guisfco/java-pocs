package com.guisfco.creational.abstractfactory;

public class WindowsFactory implements OSFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Input createInput() {
        return new WindowsInput();
    }
}
