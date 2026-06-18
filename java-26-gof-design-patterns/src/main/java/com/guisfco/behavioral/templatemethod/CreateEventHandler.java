package com.guisfco.behavioral.templatemethod;

public class CreateEventHandler extends EventHandler {

    @Override
    public void beforeProcessing() {
        IO.println("Before processing create event");
    }

    @Override
    public void afterProcessing() {
        IO.println("After processing create event");
    }
}
