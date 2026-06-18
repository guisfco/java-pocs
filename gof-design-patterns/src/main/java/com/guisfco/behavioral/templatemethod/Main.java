package com.guisfco.behavioral.templatemethod;

public class Main {

    static void main() {
        var createEventHandler = new CreateEventHandler();
        createEventHandler.process("CREATE!!!");

        IO.println();

        var updateEventHandler = new UpdateEventHandler();
        updateEventHandler.process("UPDATE!!!");
    }
}
