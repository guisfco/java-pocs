package com.guisfco.behavioral.templatemethod;

public abstract class EventHandler {

    public final void process(String event) {
        beforeProcessing();
        IO.println("Processing event: " + event);
        afterProcessing();
    }

    protected abstract void beforeProcessing();

    protected abstract void afterProcessing();
}
