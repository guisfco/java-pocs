package com.guisfco.behavioral.memento;

public class Main {

    static void main() {
        var editor = new Editor(new Text());

        editor.write("Line 1\n");
        editor.write("Line 2\n");
        editor.save();

        editor.write("Line 4");
        IO.println(editor.getContent());

        IO.println();

        editor.undo();
        IO.println(editor.getContent());
    }
}
