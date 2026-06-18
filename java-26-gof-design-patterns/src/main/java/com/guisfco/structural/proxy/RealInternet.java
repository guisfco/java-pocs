package com.guisfco.structural.proxy;

public class RealInternet implements Internet {

    @Override
    public void connectTo(String host) {
        IO.println("Connecting to " + host);
    }
}
