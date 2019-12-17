package com.company;

public class Customer {

    private String ssn;
    private String name;
    private String address;
    private String telephoneNumber;
    private Booking booking;

    public Customer(String ssn, String name, String address, String telephoneNumber) {
        this.ssn = ssn;
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }

    public Customer(){
        this.ssn = ssn;
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.booking = booking;

    }

    public void addBooking(Booking booking) {
        this.booking = booking;
    }

    public String getSsn() {
        return ssn;
    }

    public String setSsn(String ssn) {
        this.ssn = ssn;
        return ssn;
    }

    public String getName() {
        return name;
    }

    public String setName(String Name) {
        this.name = Name;
        return Name;
    }

    public String getAddress() {
        return address;
    }

    public String setAddress(String address) {
        this.address = address;
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
        return telephoneNumber;
    }

    @Override
    public String toString() {
        return
                ">> Customer information <<" + "\n" +
                        "Name: " + name + "\n" +
                        "Social security number: " + ssn + "\n" +
                "Address: " + address + "\n" +
                "Telephonenumber: " + telephoneNumber + "\n" +
                "________________________________________";

    }
}
