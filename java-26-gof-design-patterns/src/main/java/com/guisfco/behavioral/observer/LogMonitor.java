package com.guisfco.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class LogMonitor {

    private final List<Observer> observers;

    public LogMonitor() {
        this.observers = new ArrayList<>();
    }

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void log(String level, String message) {
        notifyObservers(new LogEntry(level, message));
    }

    private void notifyObservers(LogEntry logEntry) {
        observers.forEach(observer -> observer.update(logEntry));
    }
}
