package com.guisfco.behavioral.strategy;

import java.math.BigDecimal;

public class Main {

    static void main() {
        var order = new Order(new BigDecimal("100"), new StandardShipping());
        IO.println(order.total());

        order.setShippingStrategy(new ExpressShipping());
        IO.println(order.total());
    }
}
