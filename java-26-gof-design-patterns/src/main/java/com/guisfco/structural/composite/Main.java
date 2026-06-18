package com.guisfco.structural.composite;

public class Main {

    static void main() {
        var workspace = new Folder("workspace");
        var authenticationService = new Folder("authentication-service");

        workspace.add(authenticationService);
        workspace.add(new File("CLAUDE.md"));

        var gitIgnore = new File(".gitignore");
        authenticationService.add(gitIgnore);
        authenticationService.add(new File("CLAUDE.md"));

        workspace.print("");
        workspace.remove(gitIgnore);

        IO.println();
        workspace.print("");
    }
}
