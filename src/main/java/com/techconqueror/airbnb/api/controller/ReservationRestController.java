package com.techconqueror.airbnb.api.controller;

import com.techconqueror.airbnb.api.ReservationApi;
import com.techconqueror.airbnb.api.dto.CreateReservationRequest;
import com.techconqueror.airbnb.api.dto.Reservation;
import com.techconqueror.airbnb.service.ReservationService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("reservations")
@AllArgsConstructor
public class ReservationRestController implements ReservationApi {

    private final ReservationService reservationService;

    @Override
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation create(@RequestBody CreateReservationRequest createReservationRequest) {
        return reservationService.createReservation(createReservationRequest);
    }
}
