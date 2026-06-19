package com.guisfco;

import java.math.BigDecimal;
import java.util.concurrent.Executors;

public class Main {

    static void main() {
        IO.println("==== Virtual Threads (JDK 21) ====");

        var factory = Thread.ofVirtual().name("virtual-thread-", 1).factory();
        try (var executor = Executors.newThreadPerTaskExecutor(factory)) {
            for (int i = 0; i < 100; i++) {
                executor.execute(() -> IO.println("Running " + Thread.currentThread().getName()));
            }
        }

        IO.println("\n==== Pattern Matching (JDK 21) ====");
        IO.println(describe("Test"));
        IO.println(describe(1));
        IO.println(describe(null));
        IO.println(describe(BigDecimal.ONE));
    }

    private static String describe(Object value) {
        return switch (value) {
            case Integer number -> "Integer: " + number;
            case String text -> "String: " + text;
            case null -> "Null";
            default -> "Unknown";
        };
    }
}
