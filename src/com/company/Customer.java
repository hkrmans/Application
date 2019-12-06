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

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    @Override
    public String toString() {
        return
                ">> Customer infomration <<" + "\n" +
                "Social security number: " + ssn + "\n" +
                "Name: " + Name + "\n" +
                "Address: " + address + "\n" +
                "Telephonenumber: " + telephoneNumber + "\n" +
                "________________________________________";

    }
}
