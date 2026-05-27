package com.guisfco;

import java.math.BigDecimal;

public class PaymentValidationService {

    public void validate(Payment payment) {
        if (payment.amount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }

        if (payment.status() == null) {
            throw new IllegalArgumentException("Invalid status");
        }
    }
}
