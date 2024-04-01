package com.hotel.app.model;

public enum Availability {
	Available("Available"),
    Booked("Booked"),
    Maintenance("Maintenance"),
    OutOfService("Out of Service");

    private final String value;

    Availability(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
    
    public static Availability fromValue(String value) {
        for (Availability availability : values()) {
            if (availability.value.equalsIgnoreCase(value)) {
                return availability;
            }
        }
        throw new IllegalArgumentException("Invalid Availability: " + value);
    }
}
