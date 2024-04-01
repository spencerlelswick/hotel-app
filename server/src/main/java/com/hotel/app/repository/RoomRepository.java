package com.hotel.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hotel.app.model.Availability;
import com.hotel.app.model.Room;


@RepositoryRestResource(collectionResourceRel = "rooms", path = "rooms")
public interface RoomRepository extends JpaRepository<Room, Integer> {
    
    List<Room> findByAvailability(@Param("availability") Availability availability);

}
