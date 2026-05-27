package com.guisfco;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PaymentValidationServiceTest {

    private final PaymentValidationService paymentValidationService = new PaymentValidationService();

    @Test
    void whenValidPaymentThenDoNothing() {
        var payment = new Payment(UUID.randomUUID(), BigDecimal.ONE, PaymentStatus.APPROVED);
        assertDoesNotThrow(() -> paymentValidationService.validate(payment));
    }

    @Test
    void whenNegativeAmountThenThrowException() {
        var payment = new Payment(UUID.randomUUID(), new BigDecimal("-1"), PaymentStatus.APPROVED);
        assertThrows(IllegalArgumentException.class, () -> paymentValidationService.validate(payment));
    }

    @Test
    void whenZeroAmountThenThrowException() {
        var payment = new Payment(UUID.randomUUID(), BigDecimal.ZERO, PaymentStatus.APPROVED);
        assertThrows(IllegalArgumentException.class, () -> paymentValidationService.validate(payment));
    }

    @Test
    void whenStatusNullThenThrowException() {
        var payment = new Payment(UUID.randomUUID(), BigDecimal.TEN, null);
        assertThrows(IllegalArgumentException.class, () -> paymentValidationService.validate(payment));
    }

}