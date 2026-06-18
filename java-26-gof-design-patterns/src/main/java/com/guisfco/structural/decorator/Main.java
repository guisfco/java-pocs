package com.guisfco.structural.decorator;

public class Main {

    static void main() {
        var coffee = new BlackCoffee();
        IO.println("Black coffee: " + coffee.getIngredients());

        Coffee specialCoffee = coffee;
        specialCoffee = new MilkDecorator(specialCoffee);
        specialCoffee = new ChocolateDecorator(specialCoffee);

        IO.println("Special coffee: " + specialCoffee.getIngredients());
    }
}
