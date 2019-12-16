package com.company;

import java.util.ArrayList;

public class Room {

    private int roomNumber;
    private int numberOfBeds;
    private boolean hasBalcony;
    private double pricePerNight;
    private boolean isBooked;
    private int peopleAmount;

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public void setNumberOfBeds(int numberOfBeds) {
        this.numberOfBeds = numberOfBeds;
    }

    public boolean isHasBalcony() {
        return hasBalcony;
    }

    public void setHasBalcony(boolean hasBalcony) {
        this.hasBalcony = this.hasBalcony;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public Room(int roomNumber, int numberOfBeds, boolean hasBalcony, double pricePerNight, boolean isBooked) {
        this.roomNumber = roomNumber;
        this.numberOfBeds = numberOfBeds;
        this.hasBalcony = hasBalcony;
        this.pricePerNight = pricePerNight;
        this.isBooked = isBooked;
    }

    @Override
    public String toString() {
        return "\n" + "<<Booking information>>" + "\n" +
                "Room number: " + roomNumber + "\n" +
                "Number of beds: " + numberOfBeds + "\n" +
                "Has balcony: " + hasBalcony + "\n" +
                "Price per night: " + pricePerNight + "kr" + "\n" +
                "Is booked: " + isBooked + "\n" +
                "_____________________________________________" + "\n";

    }
}
