package com.company;

public class Customer {

    String ssn;
    String Name;
    String address;
    String telephoneNumber;

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
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

    public Customer(String ssn, String name, String address, String telephoneNumber) {
        this.ssn = ssn;
        Name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
    }
}
