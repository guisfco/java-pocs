package com.guisfco;

import java.math.BigDecimal;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.Executors;
import java.util.stream.Gatherers;

public class Main {

    private static final ScopedValue<String> REQUEST_ID = ScopedValue.newInstance();

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
        gatherers();

        IO.println("\n==== Scoped Values (JDK 25) ====");
        handleRequest(UUID.randomUUID().toString());

        IO.println("\n==== HTTP/3 Client (JDK 26) ====");
        httpClient();
    }

    private static void gatherers() {
        var numbers = List.of(1, 2, 3, 4, 5);

        var slidingWindow = numbers.stream()
                .gather(Gatherers.windowSliding(3))
                .toList();

        IO.println(slidingWindow);

        var fixedWindow = numbers.stream()
                .gather(Gatherers.windowFixed(3))
                .toList();

        IO.println(fixedWindow);
    }

    private static void httpClient() {
        try (var client = HttpClient.newBuilder().version(HttpClient.Version.HTTP_3).build()) {
            var request = HttpRequest.newBuilder()
                    .uri(URI.create("https://www.google.com"))
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
            case Integer number -> "Integer: " + number;
            case String text -> "String: " + text;
            case null -> "Null";
            default -> "Unknown";
        };
    }

    public static void handleRequest(String requestId) {
        ScopedValue.where(REQUEST_ID, requestId)
                .run(() -> {
                    validatePayment();
                    processPayment();
                    saveAuditLog();
                });
    }

    private static void validatePayment() {
        IO.println("Validating payment, requestId=" + REQUEST_ID.get());
    }

    private static void processPayment() {
        IO.println("Processing payment, requestId=" + REQUEST_ID.get());
    }

    private static void saveAuditLog() {
        IO.println("Saving audit log, requestId=" + REQUEST_ID.get());
    }
}
