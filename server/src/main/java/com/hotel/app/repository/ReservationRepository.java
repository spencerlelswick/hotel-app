package com.hotel.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hotel.app.entity.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

}
