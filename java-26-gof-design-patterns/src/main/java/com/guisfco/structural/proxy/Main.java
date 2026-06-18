package com.guisfco.structural.proxy;

public class Main {

    static void main() {
        var realInternet = new RealInternet();
        realInternet.connectTo("yahoo.com");

        var proxyInternet = new ProxyInternet(realInternet);
        proxyInternet.connectTo("yahoo.com");
        proxyInternet.connectTo("google.com");
    }
}
