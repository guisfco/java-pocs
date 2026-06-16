package com.guisfco.structural.decorator;

import java.math.BigDecimal;
import java.util.List;

public interface Coffee {

    List<String> getIngredients();
    BigDecimal getPrice();
}
