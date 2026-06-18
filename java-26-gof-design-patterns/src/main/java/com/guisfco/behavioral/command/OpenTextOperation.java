package com.guisfco.behavioral.command;

public class OpenTextOperation implements TextOperation {

    private final TextFile textFile;

    public OpenTextOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.open();
    }
}
