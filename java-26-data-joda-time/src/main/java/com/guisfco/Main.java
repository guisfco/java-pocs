package com.guisfco;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Main {

    static void main() {
        var localDate = LocalDate.now();
        var localTime = LocalTime.now();
        var localDateTime = LocalDateTime.now();

        IO.println("LocalDate: " + localDate);
        IO.println("LocalTime: " + localTime);
        IO.println("LocalDateTime: " + localDateTime);

        var losAngeles = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));
        var saoPaulo = losAngeles.withZoneSameInstant(ZoneId.of("America/Sao_Paulo"));

        IO.println("Los Angeles: " + losAngeles + " / São Paulo: " + saoPaulo);
    }
}
