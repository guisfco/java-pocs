package com.guisfco.behavioral.observer;

import com.guisfco.behavioral.IO;

public record ErrorAlert() implements Observer {

    @Override
    public void update(LogEntry logEntry) {
        if ("ERROR".equalsIgnoreCase(logEntry.level())) {
            IO.println("Error alert: " + logEntry.message());
        }
    }
}
