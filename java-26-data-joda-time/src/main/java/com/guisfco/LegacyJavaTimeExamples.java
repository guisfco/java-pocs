package com.guisfco;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class LegacyJavaTimeExamples {

    public static void run() {
        var now = new Date(); // this is mutable
        IO.println("Date: " + now);

        var calendar = Calendar.getInstance();

        calendar.set(2026, 5, 9); // month starts at 0
        IO.println("Calendar date: " + calendar.getTime());

        calendar.add(Calendar.DAY_OF_MONTH, 9); // changes the same instance
        IO.println("Calendar after adding 9 days: " + calendar.getTime());

        var formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        IO.println("Formatted: " + formatter.format(calendar.getTime()));
    }
}
