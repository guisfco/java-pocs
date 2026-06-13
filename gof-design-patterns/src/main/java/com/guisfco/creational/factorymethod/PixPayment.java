package com.guisfco.creational.factorymethod;

public class PixPayment implements Payment {

    @Override
    public void process() {
        IO.println("Processing PIX payment");
    }
}
