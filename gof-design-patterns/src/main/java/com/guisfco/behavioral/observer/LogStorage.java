package com.guisfco.behavioral.observer;

import com.guisfco.behavioral.IO;

public record LogStorage() implements Observer {

    @Override
    public void update(LogEntry logEntry) {
        IO.println("Saving log: [%s] %s".formatted(logEntry.level(), logEntry.message()));
    }
}
