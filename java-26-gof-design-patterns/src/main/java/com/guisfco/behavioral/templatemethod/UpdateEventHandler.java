package com.guisfco.behavioral.templatemethod;

public class UpdateEventHandler extends EventHandler {

    @Override
    public void beforeProcessing() {
        java.lang.IO.println("Before processing update event");
    }

    @Override
    public void afterProcessing() {
        IO.println("After processing update event");
    }
}
