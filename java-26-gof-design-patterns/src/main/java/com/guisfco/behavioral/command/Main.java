package com.guisfco.behavioral.command;

public class Main {

    static void main() {
        var executor = new TextOperationExecutor();
        var textFile = new TextFile("test.txt");

        IO.println(executor.executeOperation(new OpenTextOperation(textFile)));
        IO.println(executor.executeOperation(new SaveTextOperation(textFile)));

        IO.println(executor.getOperationHistory());
    }
}
