package com.guisfco;

public class MainManual {

    static void main() {
        var notificationService = new SMSNotificationServiceImpl();
        var paymentGatewayClient = new PayPalClient();
        var orderService = new OrderService(notificationService, paymentGatewayClient);
        orderService.createOrder();
    }
}
