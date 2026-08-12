package com.guisfco.behavioral.strategy;

import java.math.BigDecimal;

public class Order {

    private final BigDecimal price;
    private ShippingStrategy shippingStrategy;

    public Order(BigDecimal price, ShippingStrategy shippingStrategy) {
        this.price = price;
        this.shippingStrategy = shippingStrategy;
    }

    public BigDecimal total() {
        return shippingStrategy.calculate(price);
    }

    public void setShippingStrategy(ShippingStrategy shippingStrategy) {
        this.shippingStrategy = shippingStrategy;
    }
}
