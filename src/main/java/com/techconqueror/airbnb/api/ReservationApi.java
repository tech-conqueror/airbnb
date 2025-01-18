package com.techconqueror.airbnb.api;

import com.techconqueror.airbnb.api.dto.CreateReservationRequest;
import com.techconqueror.airbnb.api.dto.Reservation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name = "Reservation", description = "APIs for managing reservations.")
public interface ReservationApi {

    @Operation(
            summary = "Create Reservation",
            description = "Creates a new reservation for the user based on the provided details.")
    @ApiResponses(
            value = {
                @ApiResponse(responseCode = "201", description = "Reservation successfully created"),
                @ApiResponse(
                        responseCode = "400",
                        description =
                                "Bad Request: The input data is invalid or missing required fields. Ensure all mandatory fields are provided and have valid values."),
                @ApiResponse(
                        responseCode = "500",
                        description =
                                "Internal Server Error: An unexpected error occurred on the server while processing the request. Please try again later or contact support if the issue persists.")
            })
    Reservation create(CreateReservationRequest createReservationRequest);
}
