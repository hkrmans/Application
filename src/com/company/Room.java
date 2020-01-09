package com.company;

public class Room {

    private int roomNumber;
    private int numberOfBeds;
    private boolean hasBalcony;
    private double pricePerNight;
    private boolean isBooked = false;
    private boolean isChecked = false;

    public Room() {

    }


    public int getRoomNumber(int bookingId) {
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
        this.hasBalcony = hasBalcony;
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

    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setChecked(boolean checked) {
        this.isChecked = checked;
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
        return "\n" + "<<Room information>>" + "\n" +
                "Room number: " + roomNumber + "\n" +
                "Number of beds: " + numberOfBeds + "\n" +
                "Has balcony: " + hasBalcony + "\n" +
                "Price per night: " + pricePerNight + "kr" + "\n" +
                "Is booked: " + isBooked + "\n" +
                "_____________________________________________" + "\n";

    }


}
