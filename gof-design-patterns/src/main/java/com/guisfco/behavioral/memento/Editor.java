package com.guisfco.behavioral.memento;

public class Editor {

    private final Text text;
    private TextState savedText;

    public Editor(Text text) {
        this.text = text;
    }

    public void write(String content) {
        this.text.write(content);
    }

    public void save() {
        this.savedText = text.save();
    }

    public void undo() {
        text.restore(savedText);
    }

    public String getContent() {
        return this.text.getContent();
    }
}
