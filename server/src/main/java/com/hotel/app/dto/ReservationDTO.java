package com.hotel.app.dto;

import java.util.Date;

public class ReservationDTO {

    private int id;
    private UserDTO user;
    private RoomDTO room;
    private Date startTime;
    private Date endTime;
    private Date dateCreated;
    private Date lastUpdated;

    // Constructors
    public ReservationDTO() {
    }

    public ReservationDTO(int id, UserDTO user, RoomDTO room, Date startTime, Date endTime, Date dateCreated, Date lastUpdated) {
        this.id = id;
        this.user = user;
        this.room = room;
        this.startTime = startTime;
        this.endTime = endTime;
        this.dateCreated = dateCreated;
        this.lastUpdated = lastUpdated;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserDTO getUser() {
        return user;
    }

    public void setUser(UserDTO user) {
        this.user = user;
    }

    public RoomDTO getRoom() {
        return room;
    }

    public void setRoom(RoomDTO room) {
        this.room = room;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }
}