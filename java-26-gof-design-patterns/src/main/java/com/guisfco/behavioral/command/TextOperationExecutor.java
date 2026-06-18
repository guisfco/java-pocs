package com.guisfco.behavioral.command;

import java.util.ArrayList;
import java.util.List;

public class TextOperationExecutor {

    private final List<TextOperation> textOperations;

    public TextOperationExecutor() {
        this.textOperations = new ArrayList<>();
    }

    public String executeOperation(TextOperation textOperation) {
        this.textOperations.add(textOperation);
        return textOperation.execute();
    }

    public List<TextOperation> getOperationHistory() {
        return textOperations;
    }
}
