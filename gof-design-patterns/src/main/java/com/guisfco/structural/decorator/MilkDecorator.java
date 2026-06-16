package com.guisfco.structural.decorator;

import java.math.BigDecimal;
import java.util.List;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public List<String> getIngredients() {
        var ingredients = getCoffee().getIngredients();
        ingredients.add("Milk");
        return ingredients;
    }

    @Override
    public BigDecimal getPrice() {
        return getCoffee().getPrice().add(BigDecimal.ONE);
    }
}
