package com.guisfco;

public class PayPalClient implements PaymentGatewayClient {

    @Override
    public void pay() {
        IO.println("Calling PayPal to process payment...");
    }
}
