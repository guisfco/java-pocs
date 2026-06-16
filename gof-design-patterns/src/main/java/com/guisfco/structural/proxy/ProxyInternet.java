package com.guisfco.structural.proxy;

import java.util.List;

public class ProxyInternet implements Internet {

    private final RealInternet realInternet;

    private static final List<String> BANNED_HOSTS = List.of(
            "yahoo.com",
            "banned.com"
    );

    public ProxyInternet(RealInternet realInternet) {
        this.realInternet = realInternet;
    }

    @Override
    public void connectTo(String host) {
        if (BANNED_HOSTS.contains(host)) {
            IO.println("Access denied to " + host);
            return;
        }

        realInternet.connectTo(host);
    }
}
