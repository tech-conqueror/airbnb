package com.techconqueror.airbnb.api.dto;

import jakarta.validation.constraints.FutureOrPresent;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import java.time.LocalDate;

public record CreateReservationRequest(
        @NotNull(message = "Room ID cannot be null") Long roomId,
        @NotNull(message = "Check-in date cannot be null")
                @PastOrPresent(message = "Check-in date cannot be in the future")
                LocalDate checkInDate,
        @NotNull(message = "Check-out date cannot be null")
                @FutureOrPresent(message = "Check-out date must be in the future")
                LocalDate checkOutDate,
        @Min(value = 1, message = "Guest count must be at least 1") int guestCount,
        @Min(value = 0, message = "Total price must be positive") double totalPrice) {}
