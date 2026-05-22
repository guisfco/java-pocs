package com.guisfco;

public record Request(String path, Object... body) {

    public Request(String path) {
        this(path, null);
    }
}
