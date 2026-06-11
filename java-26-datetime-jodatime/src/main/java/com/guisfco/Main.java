package com.guisfco;

public class Main {

    static void main() {
        IO.println("==== Java Date Time API ====");
        JavaTimeExamples.run();

        IO.println("\n==== Legacy Java Date Time API ====");
        LegacyJavaTimeExamples.run();

        IO.println("\n==== Joda Time ====");
        JodaTimeExamples.run();
    }
}
