package com.guisfco.creational.factorymethod;

public class CreditCardPayment implements Payment {

    @Override
    public void process() {
        IO.println("Processing Credit Card payment");
    }
}
