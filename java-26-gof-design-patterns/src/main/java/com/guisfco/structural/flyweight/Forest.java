package com.guisfco.structural.flyweight;

import java.util.ArrayList;
import java.util.List;

public record Forest(List<Tree> trees) {

    public Forest() {
        this(new ArrayList<>());
    }

    public void plantTree(int x, int y, String name, String icon) {
        var treeType = TreeFactory.getTreeType(name, icon);
        trees.add(new Tree(x, y, treeType));
    }

    public void draw() {
        trees.forEach(Tree::draw);
    }
}
