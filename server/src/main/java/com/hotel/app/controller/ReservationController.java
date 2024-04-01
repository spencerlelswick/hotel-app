package com.hotel.app.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hotel.app.dto.ReservationDTO;
import com.hotel.app.model.Availability;
import com.hotel.app.model.Reservation;
import com.hotel.app.repository.ReservationRepository;
import com.hotel.app.service.ReservationService;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController {

	@Autowired
	private ReservationService reservationService;
	
	@PostMapping
    public ResponseEntity<?> createReservation(@RequestBody Reservation reservation) {
        
		try {
            ReservationDTO savedReservation = reservationService.createReservation(reservation);
            return ResponseEntity.status(HttpStatus.CREATED).body(savedReservation);
        } catch (IllegalArgumentException e) {
            return ResponseEntity.badRequest().body(e.getMessage());
        }
    }
}
