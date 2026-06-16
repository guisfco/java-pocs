package com.guisfco.structural.decorator;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BlackCoffee implements Coffee {

    @Override
    public List<String> getIngredients() {
        return new ArrayList<>(Arrays.asList("Water", "Ground Coffee"));
    }

    @Override
    public BigDecimal getPrice() {
        return new BigDecimal("5.00");
    }
}
