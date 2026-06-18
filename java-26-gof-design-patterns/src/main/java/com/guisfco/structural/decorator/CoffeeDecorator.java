package com.guisfco.structural.decorator;

public abstract class CoffeeDecorator implements Coffee {

    private final Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    public Coffee getCoffee() {
        return coffee;
    }
}
