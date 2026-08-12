package com.guisfco.behavioral.templatemethod;

public class UpdateEventHandler extends EventHandler {

    @Override
    protected void beforeProcessing() {
        IO.println("Before processing update event");
    }

    @Override
    protected void afterProcessing() {
        IO.println("After processing update event");
    }
}
