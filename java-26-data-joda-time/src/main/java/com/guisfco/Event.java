package com.guisfco;

import java.time.Instant;
import java.util.UUID;

public record Event(UUID id, Instant startDate, Instant endDate) {
}
