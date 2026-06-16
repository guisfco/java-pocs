package com.guisfco.structural.decorator;

import java.math.BigDecimal;
import java.util.List;

public class ChocolateDecorator extends CoffeeDecorator {

    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public List<String> getIngredients() {
        var ingredients = getCoffee().getIngredients();
        ingredients.add("Chocolate");
        return ingredients;
    }

    @Override
    public BigDecimal getPrice() {
        return getCoffee().getPrice().add(new BigDecimal("3.00"));
    }
}
