package com.guisfco.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    private static final Map<String, TreeType> TYPES = new HashMap<>();

    public static TreeType getTreeType(String name, String icon) {
        return TYPES.computeIfAbsent(name, ignored -> new TreeType(name, icon));
    }

    public static int getCreatedTypesCount() {
        return TYPES.size();
    }
}
