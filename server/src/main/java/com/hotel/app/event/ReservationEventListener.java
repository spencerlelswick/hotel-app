package com.hotel.app.event;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.core.annotation.HandleAfterCreate;
import org.springframework.stereotype.Component;

import com.hotel.app.model.Availability;
import com.hotel.app.model.Reservation;
import com.hotel.app.model.Room;
import com.hotel.app.repository.RoomRepository;

@Component
public class ReservationEventListener {

	@Autowired
	private RoomRepository roomRepository;
	
	@HandleAfterCreate
    public void handleReservationCreation(Reservation reservation) {
        Room room = reservation.getRoom();
        room.setAvailability(Availability.Booked);
        roomRepository.save(room);
    }
	
}
