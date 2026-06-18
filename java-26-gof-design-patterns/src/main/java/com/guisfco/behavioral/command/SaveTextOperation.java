package com.guisfco.behavioral.command;

public class SaveTextOperation implements TextOperation {

    private final TextFile textFile;

    public SaveTextOperation(TextFile textFile) {
        this.textFile = textFile;
    }

    @Override
    public String execute() {
        return textFile.save();
    }
}
