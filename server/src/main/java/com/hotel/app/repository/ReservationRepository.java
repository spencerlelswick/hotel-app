package com.hotel.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hotel.app.model.Reservation;

@RepositoryRestResource(collectionResourceRel = "reservations", path = "reservations")
public interface ReservationRepository extends JpaRepository<Reservation, Integer> {

	@Query("SELECT r FROM Reservation r WHERE r.room.id = :roomId")
	List<Reservation> findAllByRoomId(@Param("roomId") int roomId);
}
