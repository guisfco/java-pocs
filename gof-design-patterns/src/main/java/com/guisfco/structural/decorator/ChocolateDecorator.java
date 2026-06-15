package com.guisfco.structural.decorator;

import java.math.BigDecimal;
import java.util.List;

public class MilkDecorator extends CoffeeDecorator {

    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public List<String> getIngredients() {
        getCoffee().getIngredients().add("Milk");
        return getCoffee().getIngredients();
    }

    @Override
    public BigDecimal getPrice() {
        return getCoffee().getPrice().add(BigDecimal.ONE);
    }
}
