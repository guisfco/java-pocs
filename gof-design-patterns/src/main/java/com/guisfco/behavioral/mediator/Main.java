package com.guisfco.behavioral.mediator;

public class Main {

    static void main() {
        var teamChat = new TeamChat();

        var backendDeveloper = new BackendDeveloper("Guilherme");
        var frontendDeveloper = new FrontendDeveloper("Ana");
        var designer = new Designer("Alice");

        teamChat.addParticipant(backendDeveloper);
        teamChat.addParticipant(frontendDeveloper);
        teamChat.addParticipant(designer);

        backendDeveloper.send("The API is ready");
        frontendDeveloper.send("I'm going to wire the FE to the BE");
        designer.send("I've made some changes in the UI");
    }
}
