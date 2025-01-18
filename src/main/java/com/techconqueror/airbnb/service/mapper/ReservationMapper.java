package com.techconqueror.airbnb.service.mapper;

import com.techconqueror.airbnb.api.dto.Reservation;
import com.techconqueror.airbnb.repository.entity.ReservationEntity;

public class ReservationMapper {

    public static ReservationEntity toEntity(Reservation dto) {
        return new ReservationEntity(
                dto.id(),
                dto.userId(),
                dto.roomId(),
                dto.checkInDate(),
                dto.checkOutDate(),
                dto.guestCount(),
                dto.status(),
                dto.totalPrice());
    }

    public static Reservation toDto(ReservationEntity entity) {
        return new Reservation(
                entity.getId(),
                entity.getUserId(),
                entity.getRoomId(),
                entity.getCheckInDate(),
                entity.getCheckOutDate(),
                entity.getGuestCount(),
                entity.getStatus(),
                entity.getTotalPrice());
    }
}
