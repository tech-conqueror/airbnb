package com.techconqueror.airbnb.service.mapper;

import com.techconqueror.airbnb.api.dto.CreateReservationRequest;
import com.techconqueror.airbnb.repository.entity.ReservationEntity;

public class CreateReservationRequestMapper {

    public static ReservationEntity toEntity(CreateReservationRequest dto) {
        return new ReservationEntity(
                null,
                null,
                dto.roomId(),
                dto.checkInDate(),
                dto.checkOutDate(),
                dto.guestCount(),
                null,
                dto.totalPrice());
    }

    public static CreateReservationRequest toDto(ReservationEntity entity) {
        return new CreateReservationRequest(
                entity.getRoomId(),
                entity.getCheckInDate(),
                entity.getCheckOutDate(),
                entity.getGuestCount(),
                entity.getTotalPrice());
    }
}
