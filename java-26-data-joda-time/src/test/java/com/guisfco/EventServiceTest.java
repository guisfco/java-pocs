package com.guisfco;

import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

class EventServiceTest {

    private final EventService service = new EventService();

    @Test
    void whenValidEventThenReturnEvent() {
        var startDate = ZonedDateTime.now().plusDays(1);
        var endDate = startDate.plusDays(1);

        var event = assertDoesNotThrow(() -> service.create(startDate, endDate));

        assertNotNull(event);
        assertNotNull(event.id());
    }

    @Test
    void whenStartDateIsNotPresentThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> service.create(null, ZonedDateTime.now()));
    }

    @Test
    void whenEndDateIsNotPresentThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> service.create(ZonedDateTime.now(), null));
    }

    @Test
    void whenStartDateIsBeforeEndDateThenThrowException() {
        var startDate = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        var endDate = startDate.minusSeconds(1);

        var exception = assertThrows(IllegalArgumentException.class, () -> service.create(startDate, endDate));

        assertEquals("Event start date should be before event end date", exception.getLocalizedMessage());
    }

    @Test
    void whenCurrentDateIsAfterEventStartDateThenThrowException() {
        var now = ZonedDateTime.now(ZoneId.of("America/Sao_Paulo"));
        var startDate = now.minusDays(1);
        var endDate = startDate.plusDays(1);

        var exception = assertThrows(IllegalArgumentException.class, () -> service.create(startDate, endDate));

        assertEquals("Event start date should be a future date", exception.getLocalizedMessage());
    }

}