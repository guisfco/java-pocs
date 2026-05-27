package com.guisfco;

public class EmailNotificationClient implements NotificationClient {

    @Override
    public void notifyPaymentApproved(Payment payment) {
        if (!PaymentStatus.APPROVED.equals(payment.status())) {
            throw new IllegalArgumentException("Invalid amount");
        }

        IO.println("Sending e-mail notification");
    }
}