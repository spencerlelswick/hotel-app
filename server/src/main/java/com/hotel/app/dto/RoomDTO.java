package com.hotel.app.dto;

import java.math.BigDecimal;

import com.hotel.app.model.Availability;

public class RoomDTO {

    private int id;
    private int roomNumber;
    private BigDecimal rate;
    private Availability availability;

    // Constructors
    public RoomDTO() {
    }

    public RoomDTO(int id, int roomNumber, BigDecimal rate, Availability availability) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.rate = rate;
        this.availability = availability;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }
}