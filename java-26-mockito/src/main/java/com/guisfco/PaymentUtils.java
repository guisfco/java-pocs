package com.guisfco;

import java.time.Instant;
import java.time.temporal.ChronoUnit;

public final class PaymentUtils {

    public static boolean isPaymentExpired(Instant createdAt) {
        return Instant.now().isAfter(createdAt.plus(30, ChronoUnit.MINUTES));
    }
}
