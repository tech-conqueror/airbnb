package com.techconqueror.airbnb.api.dto;

import java.time.LocalDate;

public record Reservation(
        Long id,
        Long userId,
        Long roomId,
        LocalDate checkInDate,
        LocalDate checkOutDate,
        int guestCount,
        String status,
        double totalPrice) {}
