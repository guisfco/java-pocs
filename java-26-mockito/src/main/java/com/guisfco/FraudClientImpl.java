package com.guisfco;

public class FraudClientImpl implements FraudClient {

    @Override
    public boolean isFraud(Payment payment) {
        IO.println("Verifying fraud...");
        return false;
    }
}
