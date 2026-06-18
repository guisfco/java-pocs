package com.guisfco.behavioral.mediator;

public interface ChatMediator {

    void send(Participant sender, String message);

    void addParticipant(Participant participant);
}
