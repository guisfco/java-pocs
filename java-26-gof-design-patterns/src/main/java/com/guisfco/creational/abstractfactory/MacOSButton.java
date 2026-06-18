package com.guisfco.creational.abstractfactory;

public record MacOSButton() implements Button {

    @Override
    public void paint() {
        IO.println("Showing MacOS button");
    }
}


