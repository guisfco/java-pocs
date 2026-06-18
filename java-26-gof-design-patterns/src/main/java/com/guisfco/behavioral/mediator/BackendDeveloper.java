package com.guisfco.behavioral.mediator;

public class BackendDeveloper implements Participant {

    private ChatMediator chatMediator;
    private final String name;

    public BackendDeveloper(String name) {
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
