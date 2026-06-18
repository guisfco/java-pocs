package com.guisfco.behavioral.strategy;

import java.math.BigDecimal;

public interface ShippingStrategy {

    BigDecimal calculate(BigDecimal price);
}
