package com.guisfco.structural.composite;

public record File(String name) implements FileSystemItem {

    @Override
    public void print(String folder) {
        IO.println("/" + folder + "/" + name);
    }
}
