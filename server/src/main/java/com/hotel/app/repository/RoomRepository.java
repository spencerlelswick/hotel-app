package com.hotel.app.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.hotel.app.entity.Room;


@RepositoryRestResource
public interface RoomRepository extends JpaRepository<Room, Integer> {
    

    List<Room> findByAvailability(Availability availability);
}
