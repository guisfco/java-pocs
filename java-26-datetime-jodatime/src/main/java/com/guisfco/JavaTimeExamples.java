package com.guisfco;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public final class JavaTimeExamples {

    public static void run() {
        var localDate = LocalDate.now();
        var localTime = LocalTime.now();
        var localDateTime = LocalDateTime.now();

        IO.println("LocalDate: " + localDate);
        IO.println("LocalTime: " + localTime);
        IO.println("LocalDateTime: " + localDateTime);

        var losAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        var saoPaulo = losAngeles.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));

        IO.println("Los Angeles: " + losAngeles + " / São Paulo: " + saoPaulo);

        var formatted = saoPaulo.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss z"));
        IO.println("Formatted: " + formatted);

        var parsed = LocalDate.parse("2026-06-05");
        IO.println("Parsed date: " + parsed);

        var start = LocalDateTime.of(2026, 6, 1, 1, 0);
        var end = LocalDateTime.of(2026, 6, 2, 1, 30);

        var duration = Duration.between(start, end);
        var period = Period.between(start.toLocalDate(), end.toLocalDate());

        System.out.println("Duration hours: " + duration.toHours());
        System.out.println("Period days: " + period.getDays());
    }
}
