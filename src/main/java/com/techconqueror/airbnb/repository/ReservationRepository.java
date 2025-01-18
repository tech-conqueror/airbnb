package com.techconqueror.airbnb.repository;

import com.techconqueror.airbnb.repository.entity.ReservationEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {}
