package com.guisfco.structural.flyweight;

public class Main {

    static void main() {
        var forest = new Forest();

        forest.plantTree(10, 10, "Palm Tree", "\uD83C\uDF34");
        forest.plantTree(20, 20, "Palm Tree", "\uD83C\uDF34");
        forest.plantTree(30, 30, "Palm Tree", "\uD83C\uDF34");

        forest.plantTree(10, 10, "Evergreen Tree", "\uD83C\uDF32");
        forest.plantTree(20, 20, "Evergreen Tree", "\uD83C\uDF32");
        forest.plantTree(30, 30, "Evergreen Tree", "\uD83C\uDF32");

        forest.draw();

        IO.println("Created types: " + TreeFactory.getCreatedTypesCount());
    }
}
