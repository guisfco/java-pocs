package com.guisfco.behavioral.strategy;

import java.math.BigDecimal;

public record Order(BigDecimal price, ShippingStrategy shippingStrategy) {

    public BigDecimal total() {
        return shippingStrategy.calculate(price);
    }
}
