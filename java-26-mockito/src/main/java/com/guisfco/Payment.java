package com.guisfco;

import java.math.BigDecimal;
import java.time.Instant;
import java.util.UUID;

public record Payment(UUID id, BigDecimal amount, PaymentStatus status, Instant createdAt) {
}