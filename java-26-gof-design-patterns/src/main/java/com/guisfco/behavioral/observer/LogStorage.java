package com.guisfco.behavioral.observer;

public record LogStorage() implements Observer {

    @Override
    public void update(LogEntry logEntry) {
        IO.println("Saving log: [%s] %s".formatted(logEntry.level(), logEntry.message()));
    }
}
