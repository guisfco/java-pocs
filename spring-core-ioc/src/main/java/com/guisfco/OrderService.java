package com.guisfco;

import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrderService {

    private final NotificationService notificationService;
    private final PaymentGatewayClient paymentGatewayClient;

    public OrderService(NotificationService notificationService, PaymentGatewayClient paymentGatewayClient) {
        this.notificationService = notificationService;
        this.paymentGatewayClient = paymentGatewayClient;
    }

    public void createOrder() {
        IO.println("Creating order " + UUID.randomUUID());
        notificationService.send("Your order was created successfully");
        paymentGatewayClient.pay();
    }
}
