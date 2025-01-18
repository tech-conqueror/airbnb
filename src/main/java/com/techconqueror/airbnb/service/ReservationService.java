package com.techconqueror.airbnb.service;

import com.techconqueror.airbnb.api.dto.CreateReservationRequest;
import com.techconqueror.airbnb.api.dto.Reservation;
import com.techconqueror.airbnb.repository.ReservationRepository;
import com.techconqueror.airbnb.repository.entity.ReservationEntity;
import com.techconqueror.airbnb.service.mapper.CreateReservationRequestMapper;
import com.techconqueror.airbnb.service.mapper.ReservationMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReservationService {

    private final ReservationRepository reservationRepository;

    public Reservation createReservation(CreateReservationRequest createReservationRequest) {
        ReservationEntity reservationEntity = CreateReservationRequestMapper.toEntity(createReservationRequest);

        reservationEntity.setUserId(9999L);
        reservationEntity.setStatus("PENDING");

        return ReservationMapper.toDto(reservationRepository.save(reservationEntity));
    }
}
