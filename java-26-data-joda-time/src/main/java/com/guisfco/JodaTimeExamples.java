package com.guisfco;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Duration;
import org.joda.time.LocalDate;
import org.joda.time.LocalDateTime;
import org.joda.time.LocalTime;
import org.joda.time.Period;
import org.joda.time.format.DateTimeFormat;

public final class JodaTimeExamples {

    public static void run() {
        var localDate = LocalDate.now();
        var localTime = LocalTime.now();
        var localDateTime = LocalDateTime.now();

        IO.println("LocalDate: " + localDate);
        IO.println("LocalTime: " + localTime);
        IO.println("LocalDateTime: " + localDateTime);

        var losAngeles = DateTime.now(DateTimeZone.forID("America/Los_Angeles"));
        var saoPaulo = losAngeles.withZone(DateTimeZone.forID("America/Sao_Paulo"));

        IO.println("Los Angeles: " + losAngeles + " / São Paulo: " + saoPaulo);

        var formatter = DateTimeFormat.forPattern("dd/MM/yyyy HH:mm:ss z");
        IO.println("Formatted: " + formatter.print(saoPaulo));

        var parsed = org.joda.time.LocalDate.parse("2026-06-08");
        IO.println("Parsed date: " + parsed);

        var start = new DateTime(2026, 6, 7, 10, 0, DateTimeZone.UTC);
        var end = new DateTime(2026, 6, 8, 10, 0, DateTimeZone.UTC);

        var duration = new Duration(start, end);
        var period = new Period(start, end);

        IO.println("Duration hours: " + duration.getStandardHours());
        IO.println("Period days: " + period.getDays());
    }
}
