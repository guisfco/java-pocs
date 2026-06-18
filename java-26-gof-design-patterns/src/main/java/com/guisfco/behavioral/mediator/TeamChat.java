package com.guisfco.behavioral.mediator;

import java.util.ArrayList;
import java.util.List;

public class TeamChat implements ChatMediator {

    private final List<Participant> participants;

    public TeamChat() {
        this.participants = new ArrayList<>();
    }

    @Override
    public void addParticipant(Participant participant) {
        participant.setMediator(this);
        participants.add(participant);
    }

    @Override
    public void send(Participant sender, String message) {
        participants.stream()
                .filter(participant -> sender != participant)
                .forEach(participant -> participant.receive("[%s] %s".formatted(sender.getName(), message)));
    }
}
