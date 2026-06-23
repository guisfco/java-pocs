package com.guisfco;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.stream.Gatherers;

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

        IO.println("\n==== Gatherers (JDK 24) ====");

        var numbers = List.of(1, 2, 3, 4, 5);

        var slidingWindow = numbers.stream()
                .gather(Gatherers.windowSliding(3))
                .toList();

        IO.println(slidingWindow);

        var fixedWindow = numbers.stream()
                .gather(Gatherers.windowFixed(3))
                .toList();

        IO.println(fixedWindow);

        IO.println("\n==== HTTP/3 Client (JDK 26) ====");

        try (var client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_3).build()) {
            var request = HttpRequest.newBuilder()
                    .uri(URI.create("https://github.com/guisfco/java-pocs/blob/main/README.md"))
                    .GET()
                    .build();

            var response = client.send(request, HttpResponse.BodyHandlers.ofString());

            System.out.println("Status: " + response.statusCode());
            System.out.println("Protocol: " + response.version());
            System.out.println("Body size: " + response.body().length());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
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
            case int number -> "Integer: " + number;
            case String text -> "String: " + text;
            case null -> "Null";
            default -> "Unknown";
        };
    }
}
