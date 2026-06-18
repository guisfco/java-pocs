package com.guisfco.behavioral.mediator;

public interface Participant {

    void setMediator(ChatMediator chatMediator);

    void send(String message);

    void receive(String message);

    String getName();
}
