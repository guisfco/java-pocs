package com.guisfco.creational.singleton;

// Guarantees that only one instance of a class exists
public final class ObjectMapper {

    private static ObjectMapper instance;

    // To avoid external instantiation
    private ObjectMapper() {
    }

    public static ObjectMapper getInstance() {
        if (instance == null) {
            instance = new ObjectMapper();
        }

        return instance;
    }

    public void printInstance() {
        IO.println(this);
    }
}
