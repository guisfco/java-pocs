package com.guisfco.behavioral.observer;

public class Main {

    static void main() {
        var logMonitor = new LogMonitor();

        logMonitor.addObserver(new LogStorage());
        logMonitor.addObserver(new ErrorAlert());

        logMonitor.log("WARN", "User invalid credentials");
        logMonitor.log("INFO", "User logged in");
        logMonitor.log("ERROR", "Payment service is unavailable");
    }
}
