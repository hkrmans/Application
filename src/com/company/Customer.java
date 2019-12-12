package com.company;

public class Customer {

    private String ssn;
    private String Name;
    private String address;
    private String telephoneNumber;
    private Booking booking;

    public Customer() {
        this.telephoneNumber = getTelephoneNumber();
        this.address = getAddress();
        this.ssn = getSsn();
        this.Name = getName();

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
        return Name;
    }

    public String setName(String Name) {
        this.Name = Name;
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
                ">> Customer infomration <<" + "\n" +
                        "Name: " + Name + "\n" +
                        "Social security number: " + ssn + "\n" +
                "Address: " + address + "\n" +
                "Telephonenumber: " + telephoneNumber + "\n" +
                "________________________________________";

    }
}
