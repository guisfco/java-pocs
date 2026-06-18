package com.guisfco.behavioral.strategy;

import java.math.BigDecimal;

public record ExpressShipping() implements ShippingStrategy {

    @Override
    public BigDecimal calculate(BigDecimal price) {
        return price.add(new BigDecimal("25"));
    }
}
