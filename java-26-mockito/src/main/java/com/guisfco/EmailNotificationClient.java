package com.guisfco;

import java.math.BigDecimal;

public class EmailNotificationClient implements NotificationClient {

    @Override
    public void notifyPaymentApproved(Payment payment) {
        if (payment.amount().compareTo(BigDecimal.ZERO) <= 0) {
            throw new IllegalArgumentException("Invalid amount");
        }

        IO.println("Sending e-mail notification");
    }
}