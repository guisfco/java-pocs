package com.guisfco.creational.abstractfactory;

public record WindowsButton() implements Button {

    @Override
    public void paint() {
        IO.println("Showing Windows button");
    }
}
