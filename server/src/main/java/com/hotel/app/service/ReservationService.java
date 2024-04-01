package com.hotel.app.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hotel.app.dto.ReservationDTO;
import com.hotel.app.dto.RoomDTO;
import com.hotel.app.dto.UserDTO;
import com.hotel.app.model.Reservation;
import com.hotel.app.model.Room;
import com.hotel.app.model.User;
import com.hotel.app.repository.ReservationRepository;
import com.hotel.app.repository.RoomRepository;
import com.hotel.app.repository.UserRepository;

@Service
public class ReservationService {
	
	@Autowired
    private ReservationRepository reservationRepository;
	
	@Autowired
    private UserRepository userRepository;

    @Autowired
    private RoomRepository roomRepository;

	
	
    public ReservationDTO createReservation(Reservation reservation) {
        if (hasOverlappingReservations(reservation)) {
            throw new IllegalArgumentException("Overlapping reservations are not allowed");
        }

        reservation.setDateCreated(new Date());
        Reservation savedReservation = reservationRepository.save(reservation);

        User user = userRepository.findById(savedReservation.getUser().getId())
                .orElseThrow(() -> new IllegalArgumentException("User not found"));
        
        Room room = roomRepository.findById(savedReservation.getRoom().getId())
                .orElseThrow(() -> new IllegalArgumentException("Room not found"));

        return new ReservationDTO(
            savedReservation.getId(),
            new UserDTO(user.getId(), user.getFirstName(), user.getLastName(), user.getEmail()),
            new RoomDTO(room.getId(), room.getRoomNumber(), room.getRate(), room.getAvailability()),
            savedReservation.getStartTime(),
            savedReservation.getEndTime(),
            savedReservation.getDateCreated(),
            savedReservation.getLastUpdated()
        );
    }

    private boolean hasOverlappingReservations(Reservation newReservation) {
        List<Reservation> existingReservations = reservationRepository.findAllByRoomId(newReservation.getRoom().getId());

        for (Reservation existingReservation : existingReservations) {
            if (existingReservation.getEndTime().after(newReservation.getStartTime()) &&
                existingReservation.getStartTime().before(newReservation.getEndTime())) {
                return true; // Overlapping reservations found
            }
        }

        return false; // No overlapping reservations
    }

    

    
}
