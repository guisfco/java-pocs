package com.guisfco.behavioral.templatemethod;

public class CreateEventHandler extends EventHandler {

    @Override
    protected void beforeProcessing() {
        IO.println("Before processing create event");
    }

    @Override
    protected void afterProcessing() {
        IO.println("After processing create event");
    }
}
