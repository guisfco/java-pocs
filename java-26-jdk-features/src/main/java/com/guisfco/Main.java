package com.guisfco;

import java.math.BigDecimal;
import java.util.List;
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

        IO.println("\n==== Record Patterns (JDK 21) ====");
        IO.println(sum(new Point(5, 10)));

        IO.println("\n==== Sequenced Collections (JDK 21) ====");
        var names = List.of("Guilherme", "Yasmin", "Kira");
        IO.println(names.getFirst());
        IO.println(names.getLast());
        IO.println(names.reversed());
    }

    public record Point(int x, int y) {
    }

    private static int sum(Object object) {
        if (object instanceof Point(int x, int y)) {
            return x + y;
        }
        return 0;
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
