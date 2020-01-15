package com.company;

import java.util.Date;

public class Booking {

    private int bookingId;
    private Date checkInDate;
    private Date checkOutDate;
    private double totalPrice;
    private Room room;

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Date getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(Date checkInDate) {
        this.checkInDate = checkInDate;
    }

    public Date getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(Date checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public Room getRoom() {
        return room;
    }

    public Booking(int bookingId, double totalPrice) {
        this.bookingId = bookingId;
        this.totalPrice = totalPrice;

    }

//    public Booking(int bookingId, Date checkInDate, Date checkOutDate, double totalPrice) {
//        this.bookingId = bookingId;
//        this.checkInDate = checkInDate;
//        this.checkOutDate = checkOutDate;
//        this.totalPrice = totalPrice;
//    }


    @Override
    public String toString() {

        return
                "_______________________________" + "\n" +
                "Booking information" + "\n" +
                 room + "\n" + ">> BookingID: " +  bookingId + " <<" + "\n" +
                        "_______________________________" + "\n";

    }
}
