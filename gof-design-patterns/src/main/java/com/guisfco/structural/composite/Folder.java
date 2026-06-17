package com.guisfco.structural.composite;

import java.util.ArrayList;
import java.util.List;

public record Folder(String name, List<FileSystemItem> items) implements FileSystemItem {

    public Folder(String name) {
        this(name, new ArrayList<>());
    }

    public void add(FileSystemItem item) {
        items.add(item);
    }

    public void remove(FileSystemItem item) {
        items.remove(item);
    }

    @Override
    public void print(String folder) {
        IO.println(name + "/");
        items.forEach(item -> item.print(name));
    }
}
