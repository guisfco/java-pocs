package com.guisfco.structural.flyweight;

public record TreeType(String name, String icon) {

    public void draw(int x, int y) {
        IO.println("%s (%s, %s)".formatted(icon, x, y));
    }
}
