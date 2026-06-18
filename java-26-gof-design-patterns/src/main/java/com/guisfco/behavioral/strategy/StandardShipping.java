package com.guisfco.behavioral.strategy;

import java.math.BigDecimal;

public record StandardShipping() implements ShippingStrategy {

    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.add(BigDecimal.TEN);
    }
}
