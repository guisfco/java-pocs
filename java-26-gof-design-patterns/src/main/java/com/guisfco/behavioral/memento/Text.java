package com.guisfco.behavioral.memento;

public class Text {

    private StringBuilder content;

    public Text() {
        this.content = new StringBuilder();
    }

    public void write(String content) {
        this.content.append(content);
    }

    public TextState save() {
        return new TextState(content.toString());
    }

    public void restore(TextState snapshot) {
        content = new StringBuilder(snapshot.content());
    }

    public String getContent() {
        return content.toString();
    }
}
