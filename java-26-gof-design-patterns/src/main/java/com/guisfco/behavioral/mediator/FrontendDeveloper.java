package com.guisfco.behavioral.mediator;

import com.guisfco.behavioral.IO;

public class FrontendDeveloper implements Participant {

    private ChatMediator chatMediator;
    private final String name;

    public FrontendDeveloper(String name) {
        this.name = name;
    }

    @Override
    public void setMediator(ChatMediator chatMediator) {
        this.chatMediator = chatMediator;
    }

    @Override
    public void send(String message) {
        chatMediator.send(this, message);
    }

    @Override
    public void receive(String message) {
        IO.println(name + " received: " + message);
    }

    @Override
    public String getName() {
        return name;
    }
}
