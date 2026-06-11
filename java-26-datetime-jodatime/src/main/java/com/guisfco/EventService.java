package com.guisfco;

import java.time.Instant;
import java.time.ZonedDateTime;
import java.util.UUID;

public class EventService {

    public Event create(ZonedDateTime startDateTime, ZonedDateTime endDateTime) {
        if (null == startDateTime || null == endDateTime) {
            throw new IllegalArgumentException("Invalid start or end date");
        }

        var event = new Event(UUID.randomUUID(), startDateTime.toInstant(), endDateTime.toInstant());

        if (event.startDate().isAfter(event.endDate())) {
            throw new IllegalArgumentException("Event start date should be before event end date");
        }

        if (Instant.now().isAfter(event.startDate())) {
            throw new IllegalArgumentException("Event start date should be a future date");
        }

        IO.println("Event created: " + event);

        return event;
    }
}
